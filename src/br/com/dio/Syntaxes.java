package br.com.dio;

import java.util.List;
import java.util.function.Consumer;

import br.com.dio.models.MyLists;

public class Syntaxes {

	public static void main(String[] args) {

		final List<Float> randomGradesList = MyLists.createRandomGradesList(4);

		// Full syntax:
		System.out.println("\nFull syntax:");
		randomGradesList.forEach(new Consumer<Float>() {

			@Override
			public void accept(Float grade) {

				System.out.println(grade);
			}
		});

		// Lambda syntax:
		System.out.println("\nLambda syntax:");
		randomGradesList.forEach(grade -> System.out.println(grade));

		// Reference syntax:
		System.out.println("\nReference syntax:");
		randomGradesList.forEach(System.out::println);

	}
}
