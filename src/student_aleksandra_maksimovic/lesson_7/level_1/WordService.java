package student_aleksandra_maksimovic.lesson_7.level_1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class WordService {

	@CodeReviewComment(teacher = "Сложная имплементация. "
			+ "Посмотри стандартный метод String.split()"
			+ "и его примеры использования.")
	@CodeReviewComment(teacher = "ArrayList<String> wordsList = new ArrayList<String>();"
			+ "лучше слева от знака = использовать интерфейс List вот так:"
			+ "List<String> wordsList = new ArrayList<>();")
    public ArrayList<String> splitString(String text) {
        String  word = "";
        ArrayList<String> wordsList = new ArrayList<String>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            }
            else {
                wordsList.add(word);
                word = "";
            }
        }
        if (word.length() > 0) {
            wordsList.add(word);
        }
        return wordsList;
    }

    public Map<String, Integer> countWords(String text) {
        ArrayList<String> words = this.splitString(text);

        @CodeReviewComment(teacher = "Почему выбрана имплементация LinkedHashMap?")
        var wordCounts = new LinkedHashMap<String, Integer>();

        for (String word : words) {
            if (!wordCounts.containsKey(word)) {
                wordCounts.put(word, 1);
            } else {
                wordCounts.put(word, wordCounts.get(word) + 1);
            }
        }

        return wordCounts;      //var words = service.splitString("one two three");
        //System.out.println(words);

    }

    public String findMostFrequentWord(String text) {
        Map<String, Integer> countMap = this.countWords(text);

        int max = 0;
        String maxWord = "";

        for (String word : countMap.keySet()) {
            int count = countMap.get(word);
            if (count > max) {
                max = count;
                maxWord = word;
            }
        }

        return maxWord;
    }


    public static void main(String[] args) {
        var service = new WordService();
        service.findMostFrequentWord("mama papa papa mama kot sov");


    }


}
