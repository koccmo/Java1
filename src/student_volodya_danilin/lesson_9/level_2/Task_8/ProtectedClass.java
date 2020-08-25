package student_volodya_danilin.lesson_9.level_2.Task_8;

/*
Из классов, оператор доступа protected доступен только для
внутренних/вписанных классов.

Главный класс не может быть protected т.к. в этом нет смысла.
Оператор доступа "protected" делал бы с классом всё то же самое
что и default'ный оператор доступа ака package-private, т.к.
мы не можем наследовать (extends) пакеты.

Поэтому в языке JAVA нет понятия субпакета(child package),
следовательно оператор доступа protected на наружных классах нам ни к чему.
 */

class ProtectedClass {

    private String title;
    private String author;

    protected class InnerProtectedClass {
        //тут конструктор по-default'у также будет protected
    }

}