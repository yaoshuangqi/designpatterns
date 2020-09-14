package com.quanroon.ysq.multidesigner.sfm;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author quanroon.ysq
 * @version 1.0.0
 * @content 这个接口，实际上就是一个策略模式
 * @date 2020/8/25 17:19
 */
public interface AbastractHandler extends InitializingBean {

    void upWorker();

    void upCompany();
}
