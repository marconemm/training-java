package br.com.dio;

import java.util.List;
import br.com.dio.models.MyLists;
import br.com.dio.utils.Calculate;

public class CallBacksInJava {

	private static float getMedia(Calculate calc, float a, float b) {
		return calc.sumTwoNumbers(a, b);
	}

	public static void main(String[] args) {

		final List<Float> randomGradesList = MyLists.createRandomGradesList(4);

		// Reference syntax:
		System.out.println("\nReference syntax:");
		randomGradesList.forEach(System.out::println);

		Calculate mediaCallBack = (a, b) -> (a + b) / 2;

		float media = getMedia(mediaCallBack, randomGradesList.get(0), randomGradesList.get(3));
		System.out.println("The media of the first and last elements is: " + media);

	}
}
