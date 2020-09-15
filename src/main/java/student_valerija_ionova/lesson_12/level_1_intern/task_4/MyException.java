package student_valerija_ionova.lesson_12.level_1_intern.task_4;

//Внесите изменения в код так, что бы сообщение об ошибке
//передать в конструктор супер класса.

class MyException extends Exception {


    public MyException(String message) {
        super(message);
    }

}