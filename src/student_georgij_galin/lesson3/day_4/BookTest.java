package student_georgij_galin.lesson3.day_4;


public class BookTest {
    public static void main(String[] args){
        Book book = new Book("Harry Potter");
        String bookTitle = book.getTitle();
        System.out.println("Book title is :" + bookTitle);
    }
}