package student_alexey_tretyakov.lesson_3.day_4;

public class Book {
    private String booktitle;

    public Book(String newTitle) {
        this.booktitle = newTitle;
    }

    public String getTitle() {
        return this.booktitle;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}

