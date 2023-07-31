package csd.uoc.gr.A23.person;

import csd.uoc.gr.A23.armor.Gun;

import csd.uoc.gr.A23.exception.DeadCharacterException;

import csd.uoc.gr.A23.utilities.Utilities;


public abstract class Member extends GunCarrier implements Character{
	final String name;
	int health;
	final boolean bodyArmor;
	final int iq;
	final int physicalStrength;
	
	Member(String name,
			int health, 
			Gun gun,
			boolean bodyArmor, 
			int iq, 
			int physicalStrength){
		super(gun);
		this.name = name;
		this.health = health;
		this.bodyArmor = bodyArmor;
		this.iq = iq;
		this.physicalStrength = physicalStrength;
	}
	
	public int getHealth() {return this.health;}
	
	public String getName() {return this.name;}
	
	public boolean isAlive() {if (this.health > 0)return true;else return false;}
	
	public boolean hasBodyArmor() {return this.bodyArmor;}
	
	public void damageHealth(int damage) {this.health -= damage;}
	
	public int calculateAtomicPower() {return this.iq + this.physicalStrength;}
	
	public void fight(Character adversary) throws DeadCharacterException {
		int myGunPower = this.getGun().getPower();
		int damage;
		
		if( !(adversary instanceof Member) )throw new IllegalArgumentException("Adversary is not a Member");
		
		if( !( (this.getHealth() > 0) && (adversary.getHealth() > 0) ) ) throw new DeadCharacterException();
		
		if(adversary instanceof Insider) damage = 2;
		else {
			//we have determine that it is member so we can cast
			if( !((Member)adversary).bodyArmor) {
				damage = myGunPower + (this.calculateAtomicPower() - adversary.calculateAtomicPower()) + handleHostage();
			}else {
				damage = (myGunPower/2) + (this.calculateAtomicPower() - adversary.calculateAtomicPower()) + handleHostage() ;
			}
		}
		adversary.damageHealth(damage);
	}
	
	public int handleHostage() {return Utilities.getRandomVal(-2, 2);}
	
	
	
	
}
