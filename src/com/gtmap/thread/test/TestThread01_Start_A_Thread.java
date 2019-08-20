package com.gtmap.thread.test;

import com.gtmap.thread.pojo.charactor.Hero;

/**
 * 多线程即在同一时间，可以做多件事情。 
 * 创建多线程有3种方式，分别是继承线程类,实现Runnable接口,匿名类
 * @author Administrator
 *
 */
public class TestThread01_Start_A_Thread {
	public static void main(String[] args) {
		Hero gareen = new Hero("盖伦",616,50);
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 300;
		teemo.damage = 30;
		
		Hero bh = new Hero("赏金猎人",500,65);
		Hero lessin = new Hero("盲僧",455,80);
		/**
		 * 首先要理解进程(Processor)和线程(Thread)的区别 
		 * 	进程：启动一个LOL.exe就叫一个进程。 接着又启动一个DOTA.exe，这叫两个进程。 
		 * 	线程：线程是在进程内部同时做的事情，比如在LOL里，有很多事情要同时做，比如"盖伦” 击杀“提莫”，同时“赏金猎人”又在击杀“盲僧”，这就是由多线程来实现的。 
		 * 	此处代码演示的是不使用多线程的情况： 
		 * 	只有在盖伦杀掉提莫后，赏金猎人才开始杀盲僧
		 */
		
		//盖伦攻击提莫
		while(!teemo.isDead()){
			gareen.attackHero(teemo);
		}
		
		//盖伦攻击提莫
		while(!lessin.isDead()){
			bh.attackHero(lessin);
		}
		
	}
}
