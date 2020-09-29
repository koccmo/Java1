package student_valerija_ionova.lesson_16.level_6_middle.variant_1;

/*Basic Insight:
An element of the array can store water if there are higher bars on left and right.
The amount of water to be stored in every element can be found out by finding the heights
of bars on the left and right sides. The idea is to compute the amount of water that can be stored in every element
of the array.
Example
Consider the array {3, 0, 0, 2, 0, 4}, three units of water can be stored three indexes 1 and 2,
and one unit of water at index 3, and three units of water at index 4. */

class Variant1 {

    private int [] elevationMap;

    Variant1 (int [] elevationMap){
        this.elevationMap = elevationMap;
    }

    int getVolumeOfWater (){
        int volume = 0;
        for (int i = 0; i < elevationMap.length; i++){
            volume += addVolumeOfWaterForCurrentIndex(i);
        }
        return volume;
    }

    private int addVolumeOfWaterForCurrentIndex (int index){
        int volume = Math.max(0, Math.min(highestOnLeft(index), highestOnRight(index)) - elevationMap[index]);
        return volume;
    }

    private int highestOnLeft (int index){
        int result = 0;
        for (int i = 0; i < index; i++){
            if (elevationMap[i] > result){
                result = elevationMap[i];
            }
        }
        return result;
    }

    private int highestOnRight (int index){
        int result = 0;
        for (int i = elevationMap.length - 1; i > index; i --){
            if (elevationMap[i] > result){
                result  = elevationMap[i];
            }
        }
        return result;
    }

}
