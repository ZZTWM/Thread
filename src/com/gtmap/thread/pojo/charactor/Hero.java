package com.gtmap.thread.pojo.charactor;

public class Hero {
	public String name;
	public float hp;
	public int damage;
	
	public Hero(){
		
	}
	
	public Hero(String name, float hp, int damage) {
		super();
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHp() {
		return hp;
	}
	public void setHp(float hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]";
	}
	
	public void attackHero(Hero h){
		try {
			//Ϊ�˱�ʾ������Ҫʱ�䣬ÿ�ι�����ͣ1000����
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h.hp-=damage;
		System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);
		//System.out.format("%s ���ڹ��� %s,%s��Ѫ����� %0.f%n",name,h.name,h.name,h.hp);
		
		if(h.isDead()){
			System.out.println(h.name + "���ˣ�");
		}
	}
	
	public boolean isDead(){
		return 0 > hp?true:false;
	}
}
