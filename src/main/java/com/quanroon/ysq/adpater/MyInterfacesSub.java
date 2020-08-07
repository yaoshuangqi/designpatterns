package com.quanroon.ysq.adpater;
/*
 * 此类只需要重写方法2的，因此通过接口适配器后，我们就没有必要重写方法2了，如果需要也可以重写
 */
public class MyInterfacesSub extends InterfaceAdapter {

	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		super.sampleOperation2();
		System.out.println("本类只需要当前这个方法2，而方法1我不需要，因此我可以不用重写的。");
	}
}
