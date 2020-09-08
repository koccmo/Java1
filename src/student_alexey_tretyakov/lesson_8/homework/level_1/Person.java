package student_alexey_tretyakov.lesson_8.homework.level_1;



 class Person  extends Address{
     private String fullName;
     private int age;

     private Person (String city,String street){
         super( city, street );
     }

     void setFullName (String fullName){
         this.fullName = fullName;
     }

     void setAge(int age) {
         this.age = age;
     }

     void printPersonalData () {
         System.out.println("Full name = " + this.fullName);
         System.out.println( "Age = " + this.age);
         System.out.println( "Address = " + this.getCity() + " , "+ this.getStreet());
     }

     public static void main(String[] args) {

         Person person = new Person("Riga","Kalpaka iela");
         person.printPersonalData();
         person.setFullName("Alex");
         person.setAge(35);
         person.setCity("Jurmala");
         person.setStreet("Jomas iela");
         person.printPersonalData();

     }
 }

