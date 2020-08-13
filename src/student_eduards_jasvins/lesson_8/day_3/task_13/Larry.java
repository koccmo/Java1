package student_eduards_jasvins.lesson_8.day_3.task_13;

class Larry extends Garry {

    private int eyes;


    public Larry(String nickName, int age, int eyes) {
        super(nickName, age);
        this.eyes = eyes;
    }

    @Override
    void helloMyFriend() {
        if (eyes > 0) {
            System.out.println("Yeah, I have so many eyes!");
        }else {
            System.out.println("You don't have normal eyes");
        }

    }

}
