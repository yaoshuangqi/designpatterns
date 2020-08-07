package com.quanroon.ysq.builder.method1;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 第一种常用方式：
 * 当一个类构造器需要传入很多参数时，如果创建这个类的实例，代码可读性会非常差，
 * 而且很容易引入错误，此时就可以利用 builder模式进行重构
 * @createtime 2020/6/27 21:05
 */
public class NewComputer {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;
    public NewComputer() { }

    private NewComputer(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }

    /**
     * 定义一个内部类，用于建造各个零件
     */
    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder() {}

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }
        public Builder screen(String val) {
            screen = val;
            return this;
        }
        public Builder memory(String val) {
            memory = val;
            return this;
        }
        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }
        public NewComputer build() {
            return new  NewComputer(this);
        }
    }

    @Override
    public String toString() {
        return "NewComputer{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
