package com.quanroon.ysq.adpater;

import java.util.HashMap;

public class MainApdaptee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类适配器
		Target classtg = new ClassAdapter();
		classtg.sampleOperation2();
		classtg.sampleOperation1();
		//对象适配器
		Target objecttg = new ObjectAdapter(new Adaptee());
		objecttg.sampleOperation2();
		objecttg.sampleOperation1();
		//接口适配器
		Target interfacetg = new MyInterfacesSub();
		interfacetg.sampleOperation2();
	}

}