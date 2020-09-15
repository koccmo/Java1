package student_aleksandra_maksimovic.my_exercises;

class Book {

    private String title;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}