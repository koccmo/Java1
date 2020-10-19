package student_valerija_ionova.lesson_15.level_6_middle.task_17.videostore;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Movie {

	public static final String REGULAR = "REGULAR";
	public static final String NEW_RELEASE = "NEW_RELEASE";
	public static final String CHILDREN = "CHILDREN";

	private String title;
	private String priceCode;

	public Movie(String title, String priceCode) {
		this.title 		= title;
		this.priceCode = priceCode;
	}

	public String getTitle () {
		return title;
	}

	public String getPriceCode() {
		return priceCode;
	}
}