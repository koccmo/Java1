package student_valerija_ionova.lesson_15.level_6_middle.task_17.videostore;

/*
Первое: разберите код и проанализируйте что он делает.
Второе: напишите автоматические тесты для проверки правильности работы.
Третье: найдите плохие места в коде и объясните почему вы считаете их плохими.
Четвёртое: придумайте способ как улучшить код.
Пятое: выполните рефакторинг.
Шестое: убедитесь, что после рефакторинга все тесты по прежнему работают.
*/

import java.util.Vector;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Customer {

	private String name;
	private Vector rentals = new Vector ();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental (Rental rental) {
		rentals.addElement (rental);
	}

	public String getName () {
		return name;
	}

	Vector getRentals(){
		return rentals;
	}

}