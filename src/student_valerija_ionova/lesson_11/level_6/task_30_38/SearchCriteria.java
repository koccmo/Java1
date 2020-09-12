package student_valerija_ionova.lesson_11.level_6.task_30_38;

/*Task15
Для представления сложных критериев поиска книг в базе данных создайте
интерфейс SearchCriteria со следующим методом:
*/


public interface SearchCriteria {

    boolean match(Book book);

}
