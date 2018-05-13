package com.karenngomes.Implementation;

public enum Categories {
	ART(1), COMICS(2), CRAFTS(3), DANCE(4), DESIGN(5), FASHION(6), 
	FILM_VIDEO(7), FOOD(8), GAMES(9), JOURNALISM(10), MUSIC(11), 
	PHOTO(12), PUBLISHING(13), TECH(14), THEATER(15);
	
	private final int value;
	
	Categories(int valueOp) {
		value = valueOp;
	}
	
	int getValue() {
		return value;
	}
}
