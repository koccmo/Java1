package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.BookDatabase;
import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class CountAllBookUIAction implements UIAction {

	@CodeReviewComment(teacher = "How this field will be initialized?")
    BookDatabase bookDatabase;


    @Override
    public void execute() {
        System.out.println("Books in library is:  " + bookDatabase.countAllBooks());
    }
}
