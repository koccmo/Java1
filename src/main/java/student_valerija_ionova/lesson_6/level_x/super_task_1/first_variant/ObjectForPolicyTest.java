package student_valerija_ionova.lesson_6.level_x.super_task_1.first_variant;

class ObjectForPolicyTest {

   public static void main(String [] args){
        ObjectForPolicyTest objectForPolicyTest = new ObjectForPolicyTest();


        objectForPolicyTest.testNewHomeWithTosterPriceOfElectricDevice();
        objectForPolicyTest.testNewHomeWithoutElectricDevice();
    }

    public void testNewHomeWithTosterPriceOfElectricDevice(){
        ElectricDevice [] electricDevices = new ElectricDevice[1];
        electricDevices[0] = new ElectricDevice("Toster", 4);

        ObjectForPolicy objectForPolicy = new ObjectForPolicy(electricDevices);
        if (objectForPolicy.getElectricDevices()[0].getCost() == 4){
            System.out.println("testNewHomeWithTosterPriceOfElectricDevice OK");
        }else{
            System.out.println("testNewHomeWithTosterPriceOfElectricDevice FAIL");
        }
    }

    public void testNewHomeWithoutElectricDevice(){

        ObjectForPolicy objectForPolicy = new ObjectForPolicy();
        if (!objectForPolicy.getIsElectricDevices()){
            System.out.println("testNewHomeWithoutElectricDevice OK");
        }else{
            System.out.println("testNewHomeWithoutElectricDevice FAIL");
        }
    }
}
