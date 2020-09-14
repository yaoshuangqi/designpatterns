package com.quanroon.ysq.multidesigner.sfm;

/**
 * @author quanroon.ysq
 * @version 1.0.0
 * @content 这个抽象类，实际上就是一个模板方法模式
 * @date 2020/8/25 18:16
 */
public abstract class UpLoadBaseService implements AbastractHandler {
    public void upWorker() {
        throw new UnsupportedOperationException();
    }

    public void upCompany() {
        throw new UnsupportedOperationException();
    }

    protected void getProjId(Long projId){
        System.out.println("=======策略抽象类中的公共方法");
    }


    @Override
    public void afterPropertiesSet() {

    }
}
