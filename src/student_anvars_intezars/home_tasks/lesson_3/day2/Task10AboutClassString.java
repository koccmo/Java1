package student_anvars_intezars.home_tasks.lesson_3.day2;

public class Task10AboutClassString {

    /*

    1. Объекты класса String хрянятся в особом типе памяти,
    которая называется "Куча"/"Heap".
    Новые объекты всегда создаются в куче,
    а ссылки на них хранятся в стеке

    2. Длина строки определяется специальным методом,
    под названием "length()".
    Ниже можно увидеть пример:

        import java.io.*;

   public class Test {

   public static void main(String args[]){
      String Str1 = new String("Добро пожаловать на ProgLang.su");
      String Str2 = new String("ProgLang.su" );

      System.out.print("Длина строки \"Добро пожаловать на ProgLang.su\" - " );
      System.out.println(Str1.length());

      System.out.print("Длина строки \"ProgLang.su\" - " );
      System.out.println(Str2.length());

      Результат
      Длина строки "Добро пожаловать на ProgLang.su" - 31
    Длина строки "ProgLang.su" - 11

    3. Две строки можно сравнивать разными методами.
        А именно, compareTo(String), compareToIgnoreCase(String) и
         compareTo(object String) строкового класса (String Class).
         Данные методы позволяют вовзратить разность первых
         нечетных символов сравниваемых строк.

         Пример:

         public class Compare{
         public static void main(String args[]){
         String firstStr = "Привет Мир!";
         String secondStr = "привет мир!";
         Object objStr = firstStr;

         System.out.println(firstStr.compareTo(secondStr));
         System.out.println(firstStr.compareToIgnoreCase(secondStr));
         System.out.println(firstStr.compareTo(objStr.toString()));
   }
}
    Результат программы:
                -32
                 0
                 0

          Есть еще медот сравнения строк под названием "equals();"
          Данный метод сравнивает строку с указанным объектом.
          Результат является истинным тогда и только тогда, когда аргумент не является
          нулевым и является строковым объектом,
          который представляет ту же последовательность символов, что и этот объект.

            public class Compare{
            public static void main(String []args){
            String str1 = "proglang";
            String str2 = "proglang";
            String str3 = new String ("Prog Lang");

            System.out.println(str1.equals(str2));
            System.out.println(str2.equals(str3));

   }
}
        Результат: true
                   false



    4. String pool - является частью памяти под названием "Куча"/"Heap".
       Например, переменная типа String создается в части памяти "Стек" но сама
       строка уже будет храниться в области памяти "String Pool".
       Это отдельный участок памяти "Стек", в которой и хранится ссылочная переменная
       типа String.

       Источники:
        https://topjava.ru/blog/stack-and-heap-in-java
        http://proglang.su/java/strings-length
        http://proglang.su/java-examples/strings-compare
     */
}
