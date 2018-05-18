package com.karenngomes.implementation;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum Categories {
	ART(1), COMICS(2), CRAFTS(3), DANCE(4), DESIGN(5), FASHION(6), 
	FILM_VIDEO(7), FOOD(8), GAMES(9), JOURNALISM(10), MUSIC(11), 
	PHOTO(12), PUBLISHING(13), TECH(14), THEATER(15);
	
	private int value;
	
	Categories(int valueOp) {
		value = valueOp;
	}
	
	int getValue() {
		return value;
	}
	void setValue(int value) {
		this.value = value;
	}
	
	public void viewCategories() {
		List<Categories> list = new ArrayList<Categories>(EnumSet.allOf(Categories.class));
		for (int i = 0; i < list.size(); i++){
		    System.out.printf("[%d] " + list.get(i).name(), i + 1);
		}
	}
}
