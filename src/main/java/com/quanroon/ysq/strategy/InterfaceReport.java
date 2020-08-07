package com.quanroon.ysq.strategy;

/**
 * @author quanroong.ysq
 * @version 1.0.0
 * @description 城市上报的抽象类
 * @createtime 2020/6/13 17:05
 */
abstract class InterfaceReport {

    abstract void companyReport();

    abstract void groupReport();

    abstract void workerReport();
}

class ShangHai extends  InterfaceReport{

    @Override
    void companyReport() {
        System.out.println("======》上海：参加单位上报");
    }

    @Override
    void groupReport() {
        System.out.println("======》上海：参加单位上报");
    }

    @Override
    void workerReport() {

    }
}