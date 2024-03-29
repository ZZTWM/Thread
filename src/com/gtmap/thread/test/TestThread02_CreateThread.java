package com.gtmap.thread.test;

import com.gtmap.thread.pojo.charactor.Hero;

import thread.KillThread;
/**
 * 创建多线程-继承线程类
 * 	使用多线程，就可以做到盖伦在攻击提莫的同时，赏金猎人也在攻击盲僧 
 * 	设计一个类KillThread 继承Thread，并且重写run方法 
 * 	启动线程办法： 实例化一个KillThread对象，并且调用其start方法 
 * 	就可以观察到 赏金猎人攻击盲僧的同时，盖伦也在攻击提莫
 * @author Administrator
 *
 */
public class TestThread02_CreateThread {
	public static void main(String[] args) {
	    Hero gareen = new Hero();
	    gareen.name = "盖伦";
	    gareen.hp = 616;
	    gareen.damage = 50;

	    Hero teemo = new Hero();
	    teemo.name = "提莫";
	    teemo.hp = 300;
	    teemo.damage = 30;
	     
	    Hero bh = new Hero();
	    bh.name = "赏金猎人";
	    bh.hp = 500;
	    bh.damage = 65;
	     
	    Hero leesin = new Hero();
	    leesin.name = "盲僧";
	    leesin.hp = 455;
	    leesin.damage = 80;
	    
	    KillThread killThread01 = new KillThread(gareen, teemo);
	    killThread01.start();
	    
	    KillThread killThread02 = new KillThread(bh, leesin);
	    killThread02.start();
	    
	}
}
