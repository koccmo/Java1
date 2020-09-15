package student_vladislav_zagrebin.lesson_5.lessonExamples;

public class BookArrayExample {

    public static void main(String[] args) {

        BookExample[] books = new BookExample [4];

        BookExample book1 = new BookExample("A", "A1");
        BookExample book2 = new BookExample("A", "A2");
        BookExample book3 = new BookExample("A", "A3");
        BookExample book4 = new BookExample("A", "A4");


        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;


    }
}
