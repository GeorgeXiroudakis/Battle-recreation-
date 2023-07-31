package csd.uoc.gr.A23.person;

import csd.uoc.gr.A23.armor.Gun;

public class PoliceOfficer extends Member{
	public PoliceOfficer(String name,
			Gun gun, boolean
			bodyArmorint, int iq, int
			physicalStrength) {
		super(name, 10, gun, bodyArmorint, iq, physicalStrength);
	}
}
