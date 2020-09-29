package student_valerija_ionova.lesson_16.level_6_middle.variant_2;


class Variant2 {

    private int [] elevationMap;
    int max = 0;

    Variant2 (int [] elevationMap){
        this.elevationMap = elevationMap;
    }

    int getVolumeOfWater (){
        int waterVolume = 0;
        int [] leftMax = getArrayOfMaxFromLeft(elevationMap.length);
        int [] rightMax = getArrayOfMaxFromRight(elevationMap.length);

        for (int i = 0; i < elevationMap.length; i ++){
            waterVolume += (Math.min (leftMax[i],
                    rightMax[i]) - elevationMap[i]);
        }
        return waterVolume;
    }

    private int [] getArrayOfMaxFromLeft (int length){
        int [] leftMax = new int [length];
        max = 0;
        for (int i = 0; i < elevationMap.length; i ++){
            max = Math.max (max, elevationMap[i]);
            leftMax[i] = max;
        }
        return leftMax;
    }

    private int [] getArrayOfMaxFromRight (int length){
        int [] rightMax = new int [length];
        max = 0;
        for (int i = elevationMap.length - 1; i >= 0; i--){
            max = Math.max (elevationMap[i], max);
            rightMax[i] = max;
        }
        return rightMax;
    }
}
