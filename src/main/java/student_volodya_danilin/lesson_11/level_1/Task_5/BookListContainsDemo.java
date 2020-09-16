package student_volodya_danilin.lesson_11.level_1.Task_5;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookListContainsDemo {

    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author3", "title3");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        if(isThisBookInList2(book1)) {
            System.out.println(book1.getTitle() + " was found!");
        }
    }

    boolean isThisBookInList1(Book book) {
        boolean result = false;
        if (books.contains(book)) {
            result = true;
        }
        return result;
    }

    static boolean isThisBookInList2(Book book) {
        boolean result = false;
        String bookAuthor = book.getAuthor();
        String bookTitle = book.getTitle();

        for (Book value : books) {
            if (value.getAuthor().equals(bookAuthor)
            && value.getTitle().equals(bookTitle)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
