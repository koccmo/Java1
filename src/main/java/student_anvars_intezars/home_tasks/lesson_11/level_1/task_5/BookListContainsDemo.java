package student_anvars_intezars.home_tasks.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Not implemented equals() method!")
class BookListContainsDemo {

    public static void main(String[] args) {

        List<Book> myBooks = new ArrayList<>();
        Book firstBook = new Book("Nassim Nicholas Taleb", "Antifragile");
        Book secondBook = new Book("Robert Martin", "Clean Code");
        myBooks.add(firstBook);
        myBooks.add(secondBook);
        if (myBooks.contains(secondBook)) {
            System.out.println("Second Book is found in the list -> ");
            System.out.println("Author: " + secondBook.getAuthor() + ", Title: " + secondBook.getTitle());
        }
    }
}