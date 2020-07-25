package student_roberts_kupcs.lesson_7.homework.level_1;

//Дана строка с текстом.
//Написать метод, который найдёт слово, которое в тексте встречается больше всего раз.
//
//class WordService {
//
//    public String findMostFrequentWord(String text) {
//           // write solution here
//    }
//
//}
//
//Если несколько слов в тексте встречаются одинаково максимальное число раз,
//то возвращаем то слово, которое стоит в тексте первым.
//
//Подумайте на какие подзадачи можно разбить эту задачу?
//Распишите на бумаге каждую подзадачу в отдельности:
//- как она называется,
//- что её надо передать на вход (параметры),
//- что будет возвращать в качестве результата.
//
//PS: если вы не можете придумать как разбить эту задачу на подзадачи,
//пожалуйста попросите помощи! Умение попросить помощи, когда это нужно
//навес золота в ИТ.
//
//Убедитесь, что вы сможете из решений всех подзадач
//собрать решение главной задачи.

class WorldService {

    public String findMostFrequentWord(String text) {
        // Where my current word starts.Где начинается текущее слово.
        int wordStart = 0;
        // How many I counted. Сколько насчитал
        int wordCount = 0;
        // The currently most frequent. В настоящее время наиболее часто
        String word = "";
        for (
                int wordEnd = wordStart; wordEnd < text.length(); wordEnd++) {
            // Is this the end of a word? // Это конец слова?
            if (wordEnd > text.length() || text.charAt(wordEnd) == ' ') {
                // We have a word! How many times does it occur?
                String thisWord = text.substring(wordStart, wordEnd);
                // How many times this word occurs.
                int thisWordCount = 0;
                // Current start of search.
                int search = -1;
                // Count them.
                while ((search = text.indexOf(thisWord, search + 1)) >= 0) {
                    thisWordCount += 1;
                }
                // Is it longer?
                if (thisWordCount > wordCount) {
                    // Keep track.
                    word = thisWord;
                    wordCount = thisWordCount;
                }
                // Move start to the next word.
                wordStart = wordEnd + 1;
            }
        }
        return word;

    }

}
