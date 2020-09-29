package student_roberts_kupcs.lesson_12.homework.level_3.Task_20;
//За блоком try может следовать один или несколько блоков catch.
// Каждый блок catch должен содержать отдельный обработчик исключений.
// Итак, если вам нужно выполнять разные задачи при возникновении разных исключений,
// используйте блок java multi-catch.

//Что нужно помнить
//
//     Одновременно возникает только одно исключение и одновременно выполняется только один блок catch.
//     Все блоки перехвата должны быть упорядочены от наиболее конкретных к наиболее общим,
//     т.е. перехват для ArithmeticException должен предшествовать перехвату для исключения.

class MultiCatchExample {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

}

