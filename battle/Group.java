package csd.uoc.gr.A23.battle;

import java.util.ArrayList;
import java.util.List;

import csd.uoc.gr.A23.person.Member;

import csd.uoc.gr.A23.utilities.Utilities;

public class Group {
	String groupName;
	List<Member> members;
	
	Group(String name){
		if (name == null || name == "" || name == " ")throw new IllegalArgumentException("the group name can not be emty");
		this.groupName = name;
		this.members = new ArrayList<Member>();
	}
	
	public String getGroupName() {return this.groupName;}
	
	public int getSize() {return this.members.size();}
	
	int getNumberOfAliveMembers() {
		int sum = 0;
		for(int i = 1; i < this.members.size(); i++) {
			if(this.members.get(i).isAlive())sum += 1;
		}
		return sum;
	}
	
	public boolean isDefeated() {
		if (getNumberOfAliveMembers() > 0)return false;
		return true;
	}
	
	Member pickRandomAliveMember() {
		if( (this.members.size() == 0) || ( this.isDefeated()) )return null;
		int index;
		do {
			index = Utilities.getRandomVal(0, this.members.size()-1);
		}while( !( this.members.get(index).isAlive() ) );
		
		return this.members.get(index);
	}
	
	public void addMember(Member member) {//!!!!!!!!!!!!
		if(member == null)throw new IllegalArgumentException("The member can not be null");
		
		this.members.add(member);
	}

}