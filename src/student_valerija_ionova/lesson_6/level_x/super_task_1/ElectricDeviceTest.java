package student_valerija_ionova.lesson_6.level_x.super_task_1;

public class ElectricDeviceTest {

    public static void main(String [] args){
        ElectricDeviceTest electricDeviceTest = new ElectricDeviceTest();
        electricDeviceTest.testTVCost();
    }

    public void testTVCost(){
        ElectricDevice TV = new ElectricDevice("TV", 25.58);
        if (TV.getCost() == 25.58){
            System.out.println("testTVCost OK");
        }else{
            System.out.println("testTVCost FAIL");
        }
    }
}
