package student_valerija_ionova.lesson_8.level_x.super_task_1;

/*Разработать доменную модель для электронной системы управления библиотекой.
Доменная модель должна в будущем давать возможность поддерживать следующие операции:
- взять книгу из библиотеки;
- вернуть книгу в библиотеку;
- поиск нужной книги;
- резервация книги;
- рассылка оповещений читателям о сроке сдачи книги в библиотеку;
- выписывание штрафов за вовремя не сданные книги;
- добавление новой книги в библиотеку.

В рамках данной задачи нужно только попробовать разработать модель
данных (pojo классы), которые будут описывать данные, которые нужны для
реализации указанных выше операций. Можно создать модель, которая будет
поддерживать только часть указанных выше операций.*/

import java.util.Date;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    private String title;
    private String author;
    private boolean bookInLibrary;
    public boolean bookReserved;
    public Date date;

    public Book (String title, String author, Date date){
        this.title =title;
        this.author = author;
        this.bookInLibrary = true;
        this.bookReserved = false;
        this.date = date;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean getBookInLibrary(){
        return bookInLibrary;
    }

    public boolean getBookReserved(){
        return bookReserved;
    }

    public Date getDate(){
        return date;
    }

    public void setBookInLibrary(boolean bookInLibrary){
        this.bookInLibrary = bookInLibrary;
    }

    public void setBookReserved(boolean bookReserved){
        this.bookReserved = bookReserved;
    }

}
