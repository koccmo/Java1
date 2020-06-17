package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_1;

public class UserTest {
    public static void main(String[] args){
        User user = new User("MaryPoppins", "Love");

        //Test of method getLogin
        if (user.getLogin().equals("MaryPoppins")){
            System.out.println("Getter getLogin works");
        }else{
            System.out.println("Getter getLogin doesn't work");
            }

         //Test of method getPassword
        if (user.getPassword().equals("Love")){
            System.out.println("Getter getPassword works");
        } else
            System.out.println("Getter getPassword doesn't work");

        //Test of method restartTimesToBlock()
        user.timesToBlock = 1;
        user.restartTimesToBlock();
        if (user.timesToBlock == 3){
            System.out.println("Method restartTimesToBlock is working good");
        } else
            System.out.println("Method restartTimesToBlock is working bad");

        //Test of method toBlockUser()
        user.toBlockUser();
        if (user.blocked){
            System.out.println("Method toBlockUser is working good");
        }else
            System.out.println("Method toBlockUser isn't working");
    }
}
