package student_aleksandra_maksimovic.lesson_3.homeworks.day_2;

    /*  Тема: Самостоятельное изучение класса String.

        Поищите в интернете информацию про класс String в Java.
        Прочтите несколько статей. Попробуйте найти ответы на
        следующие вопросы:

        - Где ханитятся обьекты класса String?
        - Как определить длину строки?
        - Как сравнивать две строки?

        - Что такое String Pool и зачем он нужен? - это сложный вопрос!
        Кто разберётся и сможет обьяснить заслужит +1 к карме.

        и т.д
    */

public class Task10 {

    public static void main(String[] args) {

        //- Где ханитятся обьекты класса String?

        // - Как определить длину строки?
        // - use length() method
        String stringLength = "need to know length";
        System.out.println("string length is: " + stringLength.length());


        // - Как сравнивать две строки?
        // - use equals method to compare  strings
        String stringEquals1 = "string12245";
        String stringequals2 = "string12245";

        System.out.println(stringEquals1.equals(stringequals2));


        // Java String Pool example


        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");

        System.out.println("s1 == s2 :" + (s1 == s2));
        System.out.println("s1 == s3 :" + (s1 == s3));

        // - Что такое String Pool и зачем он нужен?

        /*
         пул Java String - специальная область памяти, где Strings хранятся в JVM .

         Благодаря неизменности Strings в Java, JVM может оптимизировать объем памяти,
         выделенный для них, сохраняя только одну копию каждого литерала String в пуле .
         Этот процесс называется interning .

         Когда мы создаем переменную String и присваиваем ей значение, JVM ищет в пуле String с равным значением.
         Если найден, компилятор Java просто возвратит ссылку на свой адрес памяти, без выделения дополнительной памяти.
         Если он не найден, он будет добавлен в пул (интернирован) и его ссылка будет возвращена.

         Когда мы создаем String с помощью оператора new , компилятор Java создаст новый объект и сохранит его в пространстве кучи,
         зарезервированном для JVM.Каждая строка String , созданная таким образом,
         будет указывать на другую область памяти со своим собственным адресом.


         */




    }



}
