package student_alexey_tretyakov.lesson_3.day_x.SuperTask_1;


public class UserLoginService {

	private int MaxAttempt =3; // название переменных с маленькой буквы

	// много вложенных if: 3 уровня - очень сложно проследить всю логику алгоритма во всех ветках
	// попробуйте упростить код и сделать его более читабельным
	// в идеале одна команда return
	public boolean login ( User user1, String userP ){
        if ( user1.userState ) {
             if (user1.userTimes <= MaxAttempt) {
                user1.userTimes++;
                if (user1.userPassword.equals( userP )) {
                    user1.userTimes = 1;
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }
}
