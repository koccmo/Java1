package student_eduards_jasvins.lesson_8.day_3.task_13;

abstract class Garry {

    private String nickName;
    private int age;

    public Garry(String nickName, int age) {
        this.nickName = nickName;
        this.age = age;

    }


    abstract void helloMyFriend();
}
