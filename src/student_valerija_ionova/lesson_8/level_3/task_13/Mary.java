package student_valerija_ionova.lesson_8.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Mary extends Family{

    private int numberOfDresses;

    public Mary (String surName, String address, int numberOfDresses){
        super (surName, address);
        this.numberOfDresses = numberOfDresses;
    }

    @Override
    String introduceYourself(){
        return ("I have "+numberOfDresses+" dresses");
    }
}
