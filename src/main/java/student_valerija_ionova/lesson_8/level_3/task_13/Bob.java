package student_valerija_ionova.lesson_8.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Bob extends Family{

    private int numberOfFriends;

    public Bob (String surname, String address, int numberOfFriends){
        super(surname, address);
        this.numberOfFriends = numberOfFriends;
    }

    @Override
    String introduceYourself(){
        return ("I have "+numberOfFriends+" friend!");
    }

}
