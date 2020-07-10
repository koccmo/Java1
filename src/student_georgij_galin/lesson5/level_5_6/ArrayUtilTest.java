package student_georgij_galin.lesson5.level_5_6;


public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayForTest [] = arrayUtil.createArray(5);
        if (arrayForTest.length == 5){
            System.out.println("Method createArray is working");
        }else{
            System.out.println("Method createArray isn't working");
        }
    }

    public void shouldFindMaxNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 3, 5, 7, 8, 0};
        if (arrayUtil.findMaxNumber(arrayForTest) == 8){
            System.out.println("Method findMaxNumber is working");
        }else{
            System.out.println("Method findMaxNumber isn't working");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayForTest = {1, 3, 5, 7, 8, 0};
        if (arrayUtil.findMinNumber(arrayForTest) == 0){
            System.out.println("Method findMinNumber is working");
        }else{
            System.out.println("Method findMinNumber isn't working");
        }
    }

}
