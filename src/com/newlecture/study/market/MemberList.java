package com.newlecture.study.market;

public class MemberList {
	private Member[] members;
	private History[] histories;
	private int count;
	private int idx;
	
	public MemberList() {
		count = 1;
		idx = 0;
		members = new Member[count];
	}
	
	public void add(Member member) {
		
		if( !(members[count-1]==null) ) {
			Member[] temp = new Member[count+1];
			
			for(int i=0; i<count; i++)
				temp[i] = members[i];
			members = temp;
			count++;
		}
		
		members[idx] = member;
		idx++;
	}
	
	public int size() {
		int size = count;
		
		return size;
	}

	public Member get(int i) {
		Member member = members[i];
		return member;
	}

	public Member find(Member temp) {
		
		for(int i=0; i<count; i++) 
			if(temp.getId().equals(members[i].getId() ) ) 
				return members[i];
			
		return null;
	}
	
}
