package student_eduards_jasvins.lesson_10.day_6;

import java.util.ArrayList;
import java.util.Arrays;


class BookLibrary {

    private ArrayList <Book> bookLibrary;

    BookLibrary(Book ... books) { this.bookLibrary = new ArrayList <> (Arrays.asList(books)); }

    ArrayList <Book> getBookLibrary() { return bookLibrary; }
}
