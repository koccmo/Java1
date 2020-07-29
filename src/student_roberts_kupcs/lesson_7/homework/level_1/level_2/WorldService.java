package student_roberts_kupcs.lesson_7.homework.level_1.level_2;

// Task2
// Запрограммируйте решение каждой из подзадачь из Task_1.txt в отдельности.
//Для этого создайте в классе WordService отдельные методы для каждой подзадачи.
//Напишите автоматические тесты для каждой подзадачи.


class WorldService {

    public String findMostFrequentWord(String text) {
        return text;
    }

    public void splitText(String[] array) {
        String str = new String("find find most frequent word");
        String[] arrSplit = str.split(", ");
        for (int i = 0; i < arrSplit.length; i++) {
            System.out.println(arrSplit[i]);
        }
    }


}
