package student_sandra_arniece.lesson_4.level_4; //Task 11,13,14,15

class Calculator {

    public int addition(int firstInteger, int secondInteger) {
        return firstInteger + secondInteger;
    }

    public int division(int firstInteger, int secondInteger) {
        return firstInteger / secondInteger;
    }

    public int subtraction(int firstInteger, int secondInteger) {
        return firstInteger - secondInteger;
    }

    public int multiplication(int firstInteger, int secondInteger) {
        return firstInteger * secondInteger;
    }

    public boolean even(int integer) {
        return integer % 2 == 0;
    }

    public int maxOfTwo(int firstInteger, int secondInteger) {
        return Math.max(firstInteger, secondInteger);
    }

    public int maxOfThree(int firstInteger, int secondInteger, int thirdInteger) {
        if ((firstInteger >= secondInteger) && (firstInteger >= thirdInteger))
            return firstInteger;
        else if ((secondInteger >= firstInteger) && (secondInteger >= thirdInteger))
            return secondInteger;
        else return thirdInteger;
    }

}
