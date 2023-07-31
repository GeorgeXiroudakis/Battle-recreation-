package csd.uoc.gr.A23.battle;
import csd.uoc.gr.A23.armor.Handgun;
import csd.uoc.gr.A23.armor.Rifle;
import csd.uoc.gr.A23.armor.Shotgun;
import csd.uoc.gr.A23.armor.Submachine;
import csd.uoc.gr.A23.exception.DeadCharacterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import csd.uoc.gr.A23.person.HeistMasterMind;
import csd.uoc.gr.A23.person.HeistMember;
import csd.uoc.gr.A23.person.Insider;
import csd.uoc.gr.A23.person.Member;
import csd.uoc.gr.A23.person.PoliceInspector;
import csd.uoc.gr.A23.person.PoliceOfficer;
import static csd.uoc.gr.A23.utilities.Utilities.getRandomVal;
/**
* @author kpapantoniou
*/
public class Battle {
	 public static void main(String[] args) {
	 //heist group
	 HeistMember hm1 = new HeistMember("Tokyo", new Rifle(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 HeistMember hm2 = new HeistMember("Berlin", new Handgun(), false, getRandomVal(1, 2), getRandomVal(1, 5));
	 HeistMember hm3 = new HeistMember("Athens", new Shotgun(), false, getRandomVal(1, 2), getRandomVal(1, 8));
	 HeistMember hm4 = new HeistMember("Moscow", new Submachine(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 HeistMasterMind hmm = new HeistMasterMind("Madrid", new Rifle(), getRandomVal(1, 3), getRandomVal(1, 7));
	 HeistMember hm5 = new HeistMember("Oslo", new Handgun(), false, getRandomVal(1, 2), getRandomVal(1, 3));
	 HeistMember hm7 = new HeistMember("Minsk", new Submachine(), false, getRandomVal(1, 2), getRandomVal(1, 3));
	 HeistMember hm8 = new HeistMember("Monaco", new Rifle(), false, getRandomVal(1, 2), getRandomVal(1, 3));
	 HeistMember hm9 = new HeistMember("Lima", new Shotgun(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 HeistMember hm10 = new HeistMember("Lisbon", new Submachine(), true, getRandomVal(1, 13), getRandomVal(1, 3));
	 HeistMember hm11 = new HeistMember("Beirut", new Submachine(), false, getRandomVal(1, 2), getRandomVal(1, 3));
	 HeistMember hm12 = new HeistMember("Dublin", new Rifle(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 HeistMember hm13 = new HeistMember("Nicosia", new Shotgun(), false, getRandomVal(1, 2), getRandomVal(1, 3));
	 HeistMember hm6 = new HeistMember("Kingston", new Shotgun(), false, getRandomVal(1, 2), getRandomVal(1, 3));
	 Insider in1 = new Insider("insider1", new Shotgun(), true, getRandomVal(1, 3), getRandomVal(1, 5));
	 Insider in2 = new Insider("insider2", new Rifle(), false, getRandomVal(1, 3), getRandomVal(1, 5));
	//creating a heist group and adding members to it
	 Group a1 = new Group("Heist");
	 a1.addMember(in1);
	 a1.addMember(hm1);
	 a1.addMember(hm2);
	 a1.addMember(hm3);
	 a1.addMember(hm4);
	 a1.addMember(hm5);
	 a1.addMember(hm6);
	 a1.addMember(hm7);
	 a1.addMember(hm8);
	 a1.addMember(hm9);
	 a1.addMember(hm10);
	 a1.addMember(hm11);
	 a1.addMember(hm12);
	 a1.addMember(hm13);
	 a1.addMember(hmm);
	 //police group
	 PoliceOfficer po1 = new PoliceOfficer("po1", new Rifle(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po2 = new PoliceOfficer("po2", new Rifle(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po3 = new PoliceOfficer("po3", new Rifle(), false, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po4 = new PoliceOfficer("po4", new Handgun(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceInspector pi1 = new PoliceInspector("pi1", new Rifle(), getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceInspector pi2 = new PoliceInspector("pi2", new Rifle(), getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po5 = new PoliceOfficer("po5", new Handgun(), false, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po6 = new PoliceOfficer("po6", new Rifle(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po7 = new PoliceOfficer("po7", new Handgun(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po8 = new PoliceOfficer("po8", new Rifle(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po9 = new PoliceOfficer("po9", new Shotgun(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po10 = new PoliceOfficer("po10", new Shotgun(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po11 = new PoliceOfficer("po11", new Shotgun(), false, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po12 = new PoliceOfficer("po12", new Handgun(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 PoliceOfficer po13 = new PoliceOfficer("po13", new Handgun(), true, getRandomVal(1, 12), getRandomVal(1, 3));
	 PoliceOfficer po14 = new PoliceOfficer("po14", new Handgun(), true, getRandomVal(1, 2), getRandomVal(1, 3));
	 //creating a police force and adding members to it
	 Group a2 = new Group("Police");
	 a2.addMember(po1);
	 a2.addMember(po2);
	 a2.addMember(po3);
	 a2.addMember(po4);
	 a2.addMember(po5);
	 a2.addMember(po6);
	 a2.addMember(po7);
	 a2.addMember(po8);
	 a2.addMember(po9);
	 a2.addMember(po10);
	 a2.addMember(po11);
	 a2.addMember(in2);
	 a2.addMember(po11);
	 // a2.addMember(po12);
	 // a2.addMember(po13);
	 // a2.addMember(po14);
	 a2.addMember(pi1);
	 a2.addMember(pi2);
	 //printing information about the 2 groups before the battle
	 System.out.println("Heist Group " + a1.getGroupName() + " has " + a1.getSize() + " members");
	 System.out.println("Police Group " + a2.getGroupName() + " has " + a2.getSize() + " members");
	 boolean turn = false;
	 System.out.println("The battle begun");
	 //repeat until one army loses
	 while (!(a1.isDefeated() || a2.isDefeated())) {
		 if (!turn) { //turn for first
			 Member attacker = a1.pickRandomAliveMember();
			 if (attacker == null) {
				 break;
			 }
			 Member defender = a2.pickRandomAliveMember();
			 if (defender == null) {
				 break;
			 }
			 System.out.println(attacker.getName() + " attacks " + defender.getName());
			 try {
				 attacker.fight(defender);
			 } catch (DeadCharacterException ex) {
				 Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
			 }
			 turn = true;
			 } else { //turn for second
				 Member attacker = a2.pickRandomAliveMember();
				 if (attacker == null) {
					 break;
				 }
				 Member defender = a1.pickRandomAliveMember();
				 if (defender == null) {
					 break;
				 }
				 System.out.println("--------------------------------");
				 System.out.println(attacker.getName() + " attacks " + defender.getName());
				 try {
				 attacker.fight(defender);
				 } catch (DeadCharacterException ex) {
				 Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
				 }
				 turn = false;
			}
	 }
	 System.out.println("The battle ended");
	 //printing information about the 2 armies after the war
	 System.out.println(a1.getGroupName() + " alive members: " + a1.getNumberOfAliveMembers());
	 System.out.println(a2.getGroupName() + " alive members: " + a2.getNumberOfAliveMembers());
	//Finding who won
	 if (a1.getNumberOfAliveMembers() > a2.getNumberOfAliveMembers()) {
		 System.out.println(a1.getGroupName() + " won !");
	 } else if (a2.getNumberOfAliveMembers() > a1.getNumberOfAliveMembers()) {
		 System.out.println(a2.getGroupName() + " won !");
	 } else {
		 System.out.println("Nobody won");
	 }
	 }
	}