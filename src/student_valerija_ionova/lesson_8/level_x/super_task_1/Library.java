package student_valerija_ionova.lesson_8.level_x.super_task_1;

import java.util.ArrayList;
import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Library {

    private ArrayList<Book> allBooks;

    public Library (Book ... allBooks){
        this.allBooks = new ArrayList<>(Arrays.asList(allBooks));
    }

    public ArrayList <Book> getAllBooks(){
        return allBooks;
    }

    public void addBookToTheLibrary(Book book){
        allBooks.add(book);
    }
}
