package com.quanroon.ysq.multidesigner.sfm.report.impl;

import com.quanroon.ysq.multidesigner.sfm.report.Handler;
import com.quanroon.ysq.multidesigner.sfm.report.ILeave;

/**
 * @author quanroon.ysq
 * @version 1.0.0
 * @content
 * @date 2020/9/12 17:55
 */
public class ProjectLeader extends Handler {


    public ProjectLeader() {
        super(Handler.NUM_ONE, Handler.NUM_ONE);
        this.setNextHandler(new ParamsLeader());
    }

    @Override
    protected void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.argsContext() + "。");
        System.out.println("小组长审批：同意。");
    }
}
