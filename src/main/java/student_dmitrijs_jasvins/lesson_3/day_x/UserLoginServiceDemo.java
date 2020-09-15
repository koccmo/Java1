package student_dmitrijs_jasvins.lesson_3.day_x;

class UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");

        boolean firstLoginAttempt = service.login(userOne, "user-password-12345");
        boolean secondLoginAttempt = service.login(userOne, "user-password");
        System.out.println("User login with password user-password-12345 is " + firstLoginAttempt);
        System.out.println("User login with password user-password is " + secondLoginAttempt);
    }
}
