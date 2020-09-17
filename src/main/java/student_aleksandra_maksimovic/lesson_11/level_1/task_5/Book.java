package student_aleksandra_maksimovic.lesson_11.level_1.task_5;

/*
Дан класс Book:

Создайте класс BookListContainsDemo в котором продемонстрируйте как
проверяют есть ли в списке данная книга или её нет. Если для правильной
работы выбранной вами функциональности требуется внести изменения в
класс Book, сделайте это!

PS: подсказка по функциональности в названии класса :).
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Book {

    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return this.title.equals(book.title) &&
                this.author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return this.title.hashCode() ^ this.author.hashCode();
    }
}
