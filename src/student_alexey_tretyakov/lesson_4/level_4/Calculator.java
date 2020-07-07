package student_alexey_tretyakov.lesson_4.level_4;



public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public double divide (int firstNumber, int secondNumber) {
        double firstDouble = firstNumber;
        double secondDouble = secondNumber;
        return (firstDouble / secondDouble);
    }
    public boolean isEven (int number) {

        if ( ( number % 2 ) != 0 ) return false;
        else return true;
    }
    public int maxOfTwoNumbers (int firstNumber, int secondNumber) {
        if ( firstNumber > secondNumber ) return firstNumber ;

        if ( firstNumber < secondNumber ) return   secondNumber ;

        if ( (firstNumber - secondNumber) == 0 ) return 0;
        else return firstNumber;

    }



    public int maxOfThree(int int1, int int2, int int3) {
        if (int1 > int2) {
            if (int1 > int3) {
                return int1;
            } else {
                return int3;
            }
        } else {
            if (int2 > int3) {
                return int2;
            } else {
                return int3;
            }
        }
    }

    public static void main(String[] args) {

        Calculator myCalc = new Calculator();
        System.out.println("Calculate Sum 5 + 3 = " + myCalc.sum( 5, 3 ));
        System.out.println("Calculate Subtract 5 - 3 = " + myCalc.subtract( 5, 3 ));
        System.out.println("Calculate Multiply 5 * 3 = " + myCalc.multiply( 5, 3 ));
        System.out.println("Calculate Divide 10 / 3 = " + myCalc.divide( 10, 3 ));
        System.out.println(" 10 number is Even ?  - " + myCalc.isEven(10) );
        System.out.println(" 13 number is  Even ?  - " + myCalc.isEven(13) );
        int bigOrSmall = myCalc.maxOfTwoNumbers(10,5);
        String bigOrSmallString;
        if ( bigOrSmall !=0) {
            bigOrSmallString = Integer.toString( bigOrSmall );
        } else {
            bigOrSmallString = " equals ";
        }
        System.out.println(" What number is bigger? (10 or 5)    - " +  bigOrSmallString);

        bigOrSmall = myCalc.maxOfTwoNumbers(10,15);
        if ( bigOrSmall !=0) {
            bigOrSmallString = Integer.toString( bigOrSmall );
        } else {
            bigOrSmallString = " equals ";
        }
        System.out.println(" What number is bigger? (10 or 15)    - " + bigOrSmallString );

        bigOrSmall = myCalc.maxOfTwoNumbers(10,10);
        if ( bigOrSmall !=0) {
            bigOrSmallString = Integer.toString( bigOrSmall );
        } else {
            bigOrSmallString = " equals ";
        }
        System.out.println(" What number is ? (10 or 10)    - " + bigOrSmallString);

        System.out.println(" What number is  bigger? ( 5, 13 or 10)  - " + myCalc.maxOfThree( 5, 13, 10));



    }




}
