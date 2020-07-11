package student_eduards_jasvins.lesson_4.day_4;

public class Calculator {

    public int sum (int firstnumber, int secondnumber){
        return firstnumber + secondnumber;
    }
    public int subtraction (int firstnumber, int secondnumber){
        return firstnumber - secondnumber;
    }
    public int multiplication (int firstnumber, int secondnumber){
        return firstnumber * secondnumber;
    }
    public int division (int firstnumber, int secondnumber){
        return firstnumber / secondnumber;
    }
    public boolean isEven (int number) {
        return  number % 2 == 0;
    }
    public int twoNumbers (int firstnumber, int secondnumber){
        if (firstnumber > secondnumber){
            return firstnumber;
        }else{
            return secondnumber;
        }
    }

    public int threeNumbers (int firstnumber, int secondnumber, int thirdnumber){
        if (firstnumber >= secondnumber && firstnumber >= thirdnumber){
            return  firstnumber;
        }else if (secondnumber >= firstnumber && secondnumber >= thirdnumber){
            return secondnumber;
        }else{
            return thirdnumber;
        }
    }


}
