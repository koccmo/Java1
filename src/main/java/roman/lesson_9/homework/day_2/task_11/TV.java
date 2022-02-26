package roman.lesson_9.homework.day_2.task_11;

 public class TV {
     protected String manufacturing;

     protected TV(String manufacturing) {
         this.manufacturing = manufacturing;
     }

     @Override
     public String toString() {
         return "TV{" +
                 "name='" + manufacturing + '\'' +
                 '}';
     }

     public static void main(String[] args) {
         TV tv = new TV("Sharp");
         System.out.println(tv);
     }
}
