package student_valerija_ionova.lesson_15.level_6_middle.task_17.videostore;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rental {

	private Movie movie;
	private int daysRented;

	public Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}
}