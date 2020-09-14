package com.quanroon.ysq.multidesigner.sfm.report;

import com.quanroon.ysq.multidesigner.sfm.report.impl.ProjectLeader;

/**
 * @author quanroon.ysq
 * @version 1.0.0
 * @content
 * @date 2020/9/12 17:55
 */
public class LeaveMainTest {

    public static void main(String[] args) {
        //请假条来一张
        ILeave leave = new Leave("小花",5,"身体不适");

        //各位领导
        Handler groupLeader = new ProjectLeader();

        //提交申请
        groupLeader.submit(leave);
    }
}
