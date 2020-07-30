package student_roberts_kupcs.lesson_3.homeworks.day_4;

class BookDemo {

    public static void main(String[] args) {

        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
