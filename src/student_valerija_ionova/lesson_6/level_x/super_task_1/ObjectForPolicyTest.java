package student_valerija_ionova.lesson_6.level_x.super_task_1;

import java.util.ArrayList;

public class ObjectForPolicyTest {

    public static void main(String [] args){
        ObjectForPolicyTest objectForPolicyTest = new ObjectForPolicyTest();
        objectForPolicyTest.testNewHomeWithTosterPriceOfMainObject();
    }

    public void testNewHomeWithTosterPriceOfMainObject(){
        ArrayList <ElectricDevice> listOfElectricDevices = new ArrayList<ElectricDevice>();
        ElectricDevice toster = new ElectricDevice("Toster", 4.32);
        listOfElectricDevices.add(toster);
        ObjectForPolicy objectForPolicy = new ObjectForPolicy("Home with tree", 25000, listOfElectricDevices);
        if (objectForPolicy.getCost() == 25000){
            System.out.println("testNewHomeWithTosterPriceOfMainObject OK");
        }else{
            System.out.println("testNewHomeWithTosterPriceOfMainObject FAIL");
        }
    }

    /*public void testNewHomeWithTosterPriceOfElectricDevice(){
        ArrayList <ElectricDevice> listOfElectricDevices = new ArrayList<ElectricDevice>();
        ElectricDevice toster = new ElectricDevice("Toster", 4.32);
        listOfElectricDevices.add(toster);
        ObjectForPolicy objectForPolicy = new ObjectForPolicy("Home with tree", 25000, listOfElectricDevices);
        if (objectForPolicy.getElectricalDevices().get(0).getCost() == 4.32){
            System.out.println("testNewHomeWithTosterPriceOfElectricDevice OK");
        }else{
            System.out.println("testNewHomeWithTosterPriceOfElectricDevice FAIL");
        }
    }*/
}
