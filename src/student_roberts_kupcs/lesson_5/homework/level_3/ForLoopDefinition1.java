package student_roberts_kupcs.lesson_5.homework.level_3;

//Найдите ошибку в программе и исправить её:
//
//class ForLoopDefinition1 {
//
//    public static void main(String[] args) {
//        for (int i; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
//
//}

// Ошибка: (19, 21) Java: переменная я, возможно, не был инициализирован

class ForLoopDefinition1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
