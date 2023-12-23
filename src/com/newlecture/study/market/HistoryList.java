package com.newlecture.study.market;

public class HistoryList {
	private History[] histories;
	private int count;
	private int idx;
	
	public HistoryList() {
		count = 1;
		idx = 0;
		histories = new History[count];
	}
	
	public void add(History history) {
		
		if( !(histories[count-1]==null) ) {
			History[] temp = new History[count+1];
			
			for(int i=0; i<count; i++)
				temp[i] = histories[i];
			histories = temp;
			count++;
		}
		
		histories[idx] = history;
		idx++;
	}
	
	public int size() {
		int size = count;
		
		return size;
	}

	public History get(int i) {
		History history = histories[i];
		return history;
	}
}
