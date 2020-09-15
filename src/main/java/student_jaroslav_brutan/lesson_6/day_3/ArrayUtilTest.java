package student_jaroslav_brutan.lesson_6.day_3;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.doesContainNumber();
        test.howMuchArrayContainsSpecificNumber();
        test.replaceFirstNumber();
    }

    public void doesContainNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[]array = {1, 2, 4, 6, 7, 9};
        boolean result = arrayUtil.doesContainNumber(array, 6);
        if (result){
            System.out.println("TEST - OK!");
        } else {
            System.out.println("TEST - FALSE!");
        }
    }

    public void howMuchArrayContainsSpecificNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[]array = {1, 2, 2, 4, 5, 5, 2};
        int result = arrayUtil.howMuchArrayContainsSpecificNumber(array, 2);
        if (result == 3){
            System.out.println("TEST - OK");
        } else {
            System.out.println("TEST - FALSE");
        }
    }

    public void replaceFirstNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[]array = {1, 2, 4, 5, 7, 8};
        int result = arrayUtil.replaceFirstNumber(array,4, 9);
        if (result == 9){
            System.out.println("TEST - OK");
        } else {
            System.out.println("TEST - FALSE");
        }
    }


}
