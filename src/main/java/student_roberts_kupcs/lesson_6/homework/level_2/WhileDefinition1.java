package student_roberts_kupcs.lesson_6.homework.level_2;

//Найдите ошибку в программе и исправить её:
//
//class WhileDefinition1 {
//
//    public static void main(String[] args) {
//        int i = 1;
//        while i <= 100) {
//            System.out.println(i);
//            i++;
//        }
//    }
//
//}

class WhileDefinition1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {           //Error:(20, 14) java: '(' expected
            System.out.println(i);
            i++;
        }
    }
}
