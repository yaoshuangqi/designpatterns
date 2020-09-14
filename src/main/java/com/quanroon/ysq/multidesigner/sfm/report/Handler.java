package com.quanroon.ysq.multidesigner.sfm.report;

/**
 * @author quanroon.ysq
 * @version 1.0.0
 * @content
 * @date 2020/9/12 17:19
 */
public abstract class Handler {

    //上报项目
    protected final static int NUM_ONE = 1;
    //上报配置
    protected final static int NUM_SECOND = 2;
    //上报参建单位
    protected final static int NUM_THRIED = 3;

    //节点区间
    private int numStart = 0;
    private int numEnd = 0;

    //下一节点
    private Handler nextHandler;

    //上报节点设置点 上不封顶
    public Handler(int numStart) {
        this.numStart = numStart;
    }

    //上报节点设置点
    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置下一节点
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    //提交上报
    public final void submit(ILeave leave){

        if(0 == this.numStart){
            return;
        }

        //如果请假天数达到该领导者的处理要求
        if(leave.getNum() >= this.numStart){
            this.handleLeave(leave);

            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if(null != this.nextHandler && leave.getNum() > numEnd){
                this.nextHandler.submit(leave);//继续提交
            }
        }
    }

    //各级领导处理请假条方法
    protected abstract void handleLeave(ILeave leave);

}
