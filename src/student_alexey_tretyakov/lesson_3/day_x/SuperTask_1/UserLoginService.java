package student_alexey_tretyakov.lesson_3.day_x.SuperTask_1;


public class UserLoginService {
    private int maxAttempt =3;
    /*
    public boolean login ( User user1, String userP ){
        if ( user1.userActivity) {
             if (user1.userTimes <= maxAttempt) {
                user1.userTimes++;
                if (user1.userPassword.equals( userP )) {
                    user1.userTimes = 1;
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }
    */

    public boolean login ( User user1, String userP ) {

        if ((user1.userActivity) && (user1.userTimes <= maxAttempt) && (user1.userPassword.equals(userP))) {
            user1.userTimes = 1;
            return  true;
        } else {
            user1.userTimes++;
            return  false;
        }
    }
}
