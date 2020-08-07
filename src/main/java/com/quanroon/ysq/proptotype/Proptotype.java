package com.quanroon.ysq.proptotype;

import java.io.*;
import java.util.ArrayList;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description
 * @createtime 2020/7/31 20:35
 */
public class Proptotype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    /*
     * 浅复制
     */
    public Object clone() throws CloneNotSupportedException{
        Proptotype proto = (Proptotype)super.clone();//重点为：super.clone();
        return proto;
    }
    /*
     * 深复制，本质就是一种序列化后，在反序列化，生成另一个实例
     */
    public Object deepClone() throws IOException,ClassNotFoundException{
        //写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制流产生新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public static void main(String[] args) throws Exception {
        User user = new User();
        School school = new School();
        school.setSchoolName("新沟中学");

        School school1 = new School();
        school1.setSchoolName("黑心");

        School school2 = new School();
        school2.setSchoolName("百信");

        ArrayList<School> schools = new ArrayList<School>();
        schools.add(school1);
        schools.add(school2);

        ArrayList<String> strings = new ArrayList<String>();

        user.setId(111);
        user.setName("张三");
        user.setAge(33L);
        user.setSchool(school);

        user.setSchoolList(schools);

        strings.add("笑话");
        user.setPersones(strings);

        //-===============================================

        //这就是一种浅克隆
        Object clone = user.clone();

        //深克隆
        Object deepClone = user.deepClone();

        //修改
        user.setName("和尚");
        user.setId(888);
        user.setAge(555L);
        school.setSchoolName("新沟44中学");

        strings.clear();

        school2.setSchoolName("百信 == >改成 核心");

        System.out.println("旧："+user.toString());
        System.out.println("浅克隆，只针对基础类型进行复制："+clone.toString());
        System.out.println("深克隆，将引用对象也进行复制："+deepClone.toString());
    }
}
