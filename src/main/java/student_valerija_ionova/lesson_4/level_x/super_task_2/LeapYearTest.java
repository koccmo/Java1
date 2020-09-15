package student_valerija_ionova.lesson_4.level_x.super_task_2;

//Создать класс для тестов LeapYearTest
//и покрыть тестами весь функционал класса LeapYear.

class LeapYearTest {
    public static void main(String[] args){
        LeapYearTest leapYearTest = new LeapYearTest();

        leapYearTest.notDivide4Test();
        leapYearTest.notDivide100Test();
        leapYearTest.notDivide400Test();
        leapYearTest.Divide400Test();

    }

    public void notDivide4Test(){
        LeapYear leapYear = new LeapYear();
        if (!leapYear.isLeapYear(1999)){
            System.out.println("Test notDivide4 = OK");
        }else System.out.println("Test notDivide4 = FAIL");

    }

    public void notDivide100Test(){
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(1996)){
            System.out.println("Test notDivide100 = OK");
        }else System.out.println("Test notDivide100 = FAIL");

    }

    public void Divide400Test(){
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(2000)){
            System.out.println("Test Divide400 = OK");
        }else System.out.println("Test Divide400 = FAIL");

    }

    public void notDivide400Test(){
        LeapYear leapYear = new LeapYear();
        if (!leapYear.isLeapYear(1900)){
            System.out.println("Test notDivide400 = OK");
        }else System.out.println("Test notDivide400 = FAIL");

    }
}
