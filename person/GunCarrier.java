package csd.uoc.gr.A23.person;

import csd.uoc.gr.A23.armor.Gun;

public class GunCarrier {
	Gun gun;
	
	GunCarrier(Gun gun){
		this.gun = gun;
	}
	
	Gun getGun() {return this.gun;}
	
	void setGun(Gun gun) {this.gun = gun;}
}
