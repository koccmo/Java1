package student_volodya_danilin.lesson_10.level_6;

class Book {

    String author;
    String title;
    boolean isRead;

    Book() {
        this.author = "";
        this.title = "";
        this.isRead = false;
    }

    Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.isRead = false;
    }

    void printBookInfo() { //Task_17
        System.out.println(this.title + " [" + this.author + "]");
    }

    void printPersonalBookInfo() {
        System.out.println(this.title + " by " + this.author + "\nis read: " + this.isRead );
    }
}
