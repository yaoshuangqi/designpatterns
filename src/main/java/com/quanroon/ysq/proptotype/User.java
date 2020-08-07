package com.quanroon.ysq.proptotype;

import java.io.*;
import java.util.List;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description
 * @createtime 2020/7/31 20:37
 */
public class User implements Cloneable, Serializable {

    private int id;
    private String name;
    private Long age;

    private School school;

    private List<String> persones;
    private List<School> schoolList;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public List<School> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<School> schoolList) {
        this.schoolList = schoolList;
    }

    public List<String> getPersones() {
        return persones;
    }

    public void setPersones(List<String> persones) {
        this.persones = persones;
    }

    /*
     * 浅复制
     */
    public Object clone() throws CloneNotSupportedException{
        User proto = (User)super.clone();//重点为：super.clone();
        return proto;
    }
    /*
     * 深复制
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                ", persones=" + persones.toString() +
                ", schoolList=" + schoolList.toString() +
                '}';
    }
}
