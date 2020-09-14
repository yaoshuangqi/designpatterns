package com.quanroon.ysq.multidesigner.sfm.report;

/**
 * @author quanroon.ysq
 * @version 1.0.0
 * @content
 * @date 2020/9/12 17:45
 */
public class Leave implements ILeave {

    private String name;//上报类型
    private int num;//上报节点数
    private Object argsContext;//上报内容


    public Leave(String name, int num, Object... argsContext) {
        this.name = name;
        this.num = num;
        this.argsContext = argsContext;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public Object argsContext() {
        return argsContext;
    }
}
