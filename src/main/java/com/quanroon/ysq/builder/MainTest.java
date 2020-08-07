package com.quanroon.ysq.builder;

import com.quanroon.ysq.builder.method1.NewComputer;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 测试入口
 * @createtime 2020/6/27 21:15
 */
public class MainTest {

    public static void main(String[] args) {
        NewComputer build = new NewComputer.Builder()
                .cpu("cpu")
                .memory("xxx")
                .screen("xxx")
                .mainboard("xxx").build();

        System.out.println(build.toString());



    }
}
