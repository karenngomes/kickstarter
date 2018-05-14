package com.karenngomes.implementation;

public enum Countries {
	AUSTRALIA(1), AUSTRIA(2), BELGIUM(3), CANADA(4), DENMARK(5), FRANCE(6), 
	GERMANY(7), HONG_KONG(8), IRELAND(9), ITALY(10), JAPAN(11), LUXEMBOURG(12), 
	MEXICO(13), NEW_ZEALAND(14), NORWAY(15), SINGAPORE(16), SPAIN(17), 
	SWEDEN(18), SWITZERLAND(19), NETHERLANDS(20), UK(21), USA(22);
	
	private final int value;
	
	Countries(int valueOp) {
		value = valueOp;
	}
	
	int getValue() {
		return value;
	}
}
