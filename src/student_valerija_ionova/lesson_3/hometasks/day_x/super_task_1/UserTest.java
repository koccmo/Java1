package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_1;

public class UserTest {
    public static void main(String[] args){

        UserTest userTest = new UserTest();
        userTest.testGetLogin();
        userTest.testGetPassword();
        userTest.testRestartTimesToBlock();
        userTest.testToBlockUser();
    }

    public void testGetLogin(){
        User user = new User("MaryPoppins", "Love");

        if (user.getLogin().equals("MaryPoppins")){
            System.out.println("Getter getLogin works");
        }else{
            System.out.println("Getter getLogin doesn't work");
        }
    }

    public void testGetPassword(){
        User user = new User("MaryPoppins", "Love");

        if (user.getPassword().equals("Love")){
            System.out.println("Getter getPassword works");
        } else
            System.out.println("Getter getPassword doesn't work");
    }

    public void testRestartTimesToBlock(){
        User user = new User("MaryPoppins", "Love");
        user.timesToBlock = 1;
        user.restartTimesToBlock();
        if (user.timesToBlock == 3){
            System.out.println("Method restartTimesToBlock is working good");
        } else
            System.out.println("Method restartTimesToBlock is working bad");
    }

     public void testToBlockUser(){
        User user = new User("MaryPoppins", "Love");
        user.toBlockUser();
         if (user.blocked){
             System.out.println("Method toBlockUser is working good");
         }else
             System.out.println("Method toBlockUser isn't working");
     }



}
