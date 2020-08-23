package student_anvars_intezars.home_tasks.lesson_8.level_6.task30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class VarargsExampleDemo {

    public static void main(String[] args) {

        VarargsExample someNumbers = new VarargsExample();
        int[] arrayOfNumbers = new int[] {15,23};
        someNumbers.printNumbersOfVarargArray(arrayOfNumbers);
        System.out.println(" ");
        someNumbers.printNumbersOfVarargArray(3,5,7,12,18);
    }
}
