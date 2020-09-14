package com.quanroon.ysq.multidesigner.sfm.report;

/**
 * @author quanroon.ysq
 * @version 1.0.0
 * @content 上报抽象
 * @date 2020/9/12 17:14
 */
public interface ILeave {
    String getName();//上报类型

    int getNum();//上报节点数

    Object argsContext();//上报内容
}
