package com.quanroon.ysq.adpater;

public class ObjectAdapter implements Target {

	private Adaptee adaptee;
	/**
	 * 将持有Adaptee的实例，放在此适配器类中。达到兼容作用
	 * 因此适配器补充上这个方法
	 */
	public ObjectAdapter(Adaptee adaptee) {
		super();
		// TODO Auto-generated constructor stub
		this.adaptee = adaptee;
	}

	public void sampleOperation1() {
		// TODO Auto-generated method stub
		adaptee.sampleOperation1();
	}

	public void sampleOperation2() {
		// TODO Auto-generated method stub
		System.out.println("this is ObjectAdapter");
	}

}
