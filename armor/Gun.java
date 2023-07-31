package csd.uoc.gr.A23.armor;

public abstract class Gun {
	final int Power;
	
	Gun(int Power){
		this.Power = Power;
	}
	
	public int getPower() {return this.Power;}
	
}
