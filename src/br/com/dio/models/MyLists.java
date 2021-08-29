package br.com.dio.models;

import java.util.ArrayList;
import java.util.List;

public class MyLists {

	public static List<Float> createRandomGradesList(int amount){
		
		final ArrayList<Float> result = new ArrayList<>();
		
		for (int i = 0; i < amount; i++) {
			double randomGrande = (Math.random() * 9) + 1;
			
			String strRandomGrade = String.format("%.2f", randomGrande);
			
			result.add(Float.parseFloat(strRandomGrade));
		}
		
		return result;
		
	}

}
