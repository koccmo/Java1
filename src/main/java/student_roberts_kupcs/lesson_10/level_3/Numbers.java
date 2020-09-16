package student_roberts_kupcs.lesson_10.level_3;

interface Numbers {
    int count(int n);

}
class MatOperations {
    public static void main(String[] args) {

        Numbers num;//объявить ссылку на функциональный интерфейс
        num = (n) -> (n * 20);

        System.out.println("" + num.count(10));
    }
}
