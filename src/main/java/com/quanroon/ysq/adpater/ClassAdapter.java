package com.quanroon.ysq.adpater;

/*
 * 适配器角色Adapter扩展了Adaptee,同时又实现了目标(Target)接口。
 * 由于Adaptee没有提供sampleOperation2()方法，而目标接口又要求这个方法，因此适配器角色Adapter实现了这个方法。
 */
public class ClassAdapter extends Adaptee implements Target {
	/**
	 * 由于源类Adaptee没有方法sampleOperation2()
	 * 因此适配器补充上这个方法
	 */
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!");
	}

}
