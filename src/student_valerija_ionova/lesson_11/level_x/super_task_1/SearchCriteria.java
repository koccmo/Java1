package student_valerija_ionova.lesson_11.level_x.super_task_1;

/*Task15
Для представления сложных критериев поиска книг в базе данных создайте
интерфейс SearchCriteria со следующим методом:
*/


public interface SearchCriteria {

    boolean match(Book book);

}
