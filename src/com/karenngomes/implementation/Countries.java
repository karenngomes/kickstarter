package com.karenngomes.implementation;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum Countries {
	AUSTRALIA(1), AUSTRIA(2), BELGIUM(3), CANADA(4), DENMARK(5), FRANCE(6), 
	GERMANY(7), HONG_KONG(8), IRELAND(9), ITALY(10), JAPAN(11), LUXEMBOURG(12), 
	MEXICO(13), NEW_ZEALAND(14), NORWAY(15), SINGAPORE(16), SPAIN(17), 
	SWEDEN(18), SWITZERLAND(19), NETHERLANDS(20), UK(21), USA(22);
	
	private int value;
	
	Countries(int valueOp) {
		value = valueOp;
	}
	
	int getValue() {
		return value;
	}
	void setValue(int value) {
		this.value = value;
	}
	
	public void viewCountries() {
		List<Categories> list = new ArrayList<Categories>(EnumSet.allOf(Categories.class));
		for (int i = 0; i < list.size(); i++){
		    System.out.printf("[%d] " + list.get(i).name(), i + 1);
		}
	}
}
