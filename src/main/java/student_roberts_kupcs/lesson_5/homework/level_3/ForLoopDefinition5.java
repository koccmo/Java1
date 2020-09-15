package student_roberts_kupcs.lesson_5.homework.level_3;

//Найдите логическую ошибку в программе и исправить её:
//
//class ForLoopDefinition5 {
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++ {
//            System.out.println(i);
//        }
//    }
//
//}

//Ошибка: (19, 36) Java: ')' ожидается

class ForLoopDefinition5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
