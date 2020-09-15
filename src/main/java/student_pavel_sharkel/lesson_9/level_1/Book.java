package student_pavel_sharkel.lesson_9.level_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class Book {

	@CodeReviewComment(teacher = "Fields must be private")
    public String title;
    public String author;

}
