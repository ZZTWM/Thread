package com.gtmap.thread.test;

import com.gtmap.thread.pojo.charactor.Hero;

/**
 * ���̼߳���ͬһʱ�䣬������������顣 
 * �������߳���3�ַ�ʽ���ֱ��Ǽ̳��߳���,ʵ��Runnable�ӿ�,������
 * @author Administrator
 *
 */
public class TestThread01_Start_A_Thread {
	public static void main(String[] args) {
		Hero gareen = new Hero("����",616,50);
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 300;
		teemo.damage = 30;
		
		Hero bh = new Hero("�ͽ�����",500,65);
		Hero lessin = new Hero("äɮ",455,80);
		/**
		 * ����Ҫ������(Processor)���߳�(Thread)������ 
		 * 	���̣�����һ��LOL.exe�ͽ�һ�����̡� ����������һ��DOTA.exe������������̡� 
		 * 	�̣߳��߳����ڽ����ڲ�ͬʱ�������飬������LOL��кܶ�����Ҫͬʱ��������"���ס� ��ɱ����Ī����ͬʱ���ͽ����ˡ����ڻ�ɱ��äɮ����������ɶ��߳���ʵ�ֵġ� 
		 * 	�˴�������ʾ���ǲ�ʹ�ö��̵߳������ 
		 * 	ֻ���ڸ���ɱ����Ī���ͽ����˲ſ�ʼɱäɮ
		 */
		
		//���׹�����Ī
		while(!teemo.isDead()){
			gareen.attackHero(teemo);
		}
		
		//���׹�����Ī
		while(!lessin.isDead()){
			bh.attackHero(lessin);
		}
		
	}
}
