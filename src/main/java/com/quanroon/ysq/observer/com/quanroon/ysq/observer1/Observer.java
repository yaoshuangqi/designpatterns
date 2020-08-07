package com.quanroon.ysq.observer.com.quanroon.ysq.observer1;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 声明通知者通用的接口，比如定义updata方法
 * @createtime 2020/8/7 20:46
 */
public interface Observer {
    /**
     * 业务类需要重写的方法，用于处理自己的业务
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);

    /**
     * 给出一个展示数据的接口DisplayElement
     * 默认已实现
     *
     */
    default void dispalyData(Object... args){
        StringBuilder builder = new StringBuilder();
        for (Object arg : args) {
            builder.append(arg)
                    .append("-----");
        }
        System.out.println("默认展示方法，可以不用；展示数据："+builder.toString());
    }
}
