package com.quanroon.ysq.multidesigner.sfm;

/**
 * @author quanroon.ysq
 * @version 1.0.0
 * @content 策略模式+工厂模式+模板模式混合使用
 * 业务场景：在住建局业务上报中，用户会根据所选城市，来讲劳务信息上报到指定城市的住建局平台上，因城市的多样性，
 * 导致程序中会出现很多ifelse来进行判断进行相应城市service层的调用，
 * 根据业务的发展，每增加一个城市上报业务，都会导致原先公共部分代码的修改，违背了接口开发的开闭原则
 * 因此，我们可以采用设计模式来混合使用。完成这项伟大的任务
 * @date 2020/8/25 8:50
 */
public class StrategyFactoryMouldTest {

}
