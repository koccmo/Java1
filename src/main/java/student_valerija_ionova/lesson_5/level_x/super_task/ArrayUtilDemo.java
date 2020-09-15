package student_valerija_ionova.lesson_5.level_x.super_task;

class ArrayUtilDemo {
    public static void main(String[] args){

        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.println("Task 25 \n" +
                "- запросите у пользователя с консоли длину массива\n" +
                "- создайте массив указанной пользователем длины\n" +
                "- заполните массив числами полученными от пользователя\n" +
                "- распечатайте на консоль все элементы массива.");
        int arrayLength = arrayUtil.inputOfArrayLength();
        int [] newArray =  arrayUtil.newArray(arrayLength);
        int [] filledArray = arrayUtil.fillArray(newArray);
        arrayUtil.printArray(filledArray);

        System.out.println("Task 26\n" +
                "- запросите у пользователя с консоли длину массива\n" +
                "- создайте массив указанной пользователем длины\n" +
                "- заполните массив случайными числами\n" +
                "- распечатайте на консоль все элементы массива.");
        arrayLength =arrayUtil.inputOfArrayLength();
        newArray =  arrayUtil.newArray(arrayLength);
        int [] filledArrayWithRandomNumbers = arrayUtil.fillArrayWithRandomNumbers(newArray);
        arrayUtil.printArray(filledArrayWithRandomNumbers);

        System.out.println("Task 27\n" +
                "- создайте массив произвольной длины\n" +
                "- заполните массив случайными числами\n" +
                "- распечатайте на консоль все элементы массива\n" +
                "- найдите наибольшее число в массиве и выведети его на консоль.");
        newArray =arrayUtil.newArrayWithRandomLength();
        filledArrayWithRandomNumbers = arrayUtil.fillArrayWithRandomNumbers(newArray);
        arrayUtil.printArray(filledArrayWithRandomNumbers);
        arrayUtil.printMaxInArray(newArray);

        System.out.println("Task 28\n" +
                "- создайте массив произвольной длины\n" +
                "- заполните массив случайными числами\n" +
                "- распечатайте на консоль все элементы массива\n" +
                "- найдите наименьшее число в массиве и выведети его на консоль.");
        newArray =arrayUtil.newArrayWithRandomLength();
        filledArrayWithRandomNumbers = arrayUtil.fillArrayWithRandomNumbers(newArray);
        arrayUtil.printArray(filledArrayWithRandomNumbers);
        arrayUtil.printMinInArray(newArray);

        System.out.println("Task 29\n" +
                "- создайте массив произвольной длины\n" +
                "- заполните массив случайными числами\n" +
                "- распечатайте на консоль все элементы массива\n" +
                "- найдите все чётные числа в массиве и выведети их на консоль.");
        newArray =arrayUtil.newArrayWithRandomLength();
        filledArrayWithRandomNumbers = arrayUtil.fillArrayWithRandomNumbers(newArray);
        arrayUtil.printArray(filledArrayWithRandomNumbers);
        arrayUtil.printEvenNumbersOfArray(newArray);

        System.out.println("Task 30\n" +
                "- создайте массив произвольной длины\n" +
                "- заполните массив случайными числами\n" +
                "- распечатайте на консоль все элементы массива\n" +
                "- найдите все нечётные числа в массиве и выведети их на консоль.");
        newArray =arrayUtil.newArrayWithRandomLength();
        filledArrayWithRandomNumbers = arrayUtil.fillArrayWithRandomNumbers(newArray);
        arrayUtil.printArray(filledArrayWithRandomNumbers);
        arrayUtil.printOddNumbersOfArray(newArray);

    }
}
