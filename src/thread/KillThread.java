package thread;

import com.gtmap.thread.pojo.charactor.Hero;

/**
 * �������߳�-�̳��߳���
 * 	ʹ�ö��̣߳��Ϳ������������ڹ�����Ī��ͬʱ���ͽ�����Ҳ�ڹ���äɮ 
 * 	���һ����KillThread �̳�Thread��������дrun���� 
 * 	�����̰߳취�� ʵ����һ��KillThread���󣬲��ҵ�����start���� 
 * 	�Ϳ��Թ۲쵽 �ͽ����˹���äɮ��ͬʱ������Ҳ�ڹ�����Ī
 * @author Administrator
 *
 */
public class KillThread extends Thread{
	private Hero h1;
	private Hero h2;
	
	public KillThread(Hero h1,Hero h2){
		this.h1 = h1;
		this.h2 = h2;
	}
	
	public void run(){
		while(!h2.isDead()){
			h1.attackHero(h2);
		}
	}
	
}
