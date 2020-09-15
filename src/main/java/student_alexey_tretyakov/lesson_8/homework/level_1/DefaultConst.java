package student_alexey_tretyakov.lesson_8.homework.level_1;

 class DefaultConst {
     // конструктор по умолчанию (default constructor), который пуст, он не
     //делает ничего, кроме вызова конструктора суперкласса.
     private String str;

     DefaultConst() {
         this.str = "Hello world!";
     }


     public static void main(String[] args) {

         DefaultConst defConstr = new DefaultConst();
         System.out.println( defConstr.str );
     }
 }