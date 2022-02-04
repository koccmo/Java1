package roman.lesson_7.homework.day_1.task_1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class WordService {
    public static void main(String[] args) {
        WordService word = new WordService();
        String text = word.getTextFromUser();
        System.out.println(text);

        System.out.println(word.findMostFrequentWord(text));

    }
    private static final String EMPTY_STRING = "";
    public String findMostFrequentWord(String text) {
        String userText = text.toLowerCase();
        String[] stringArrayWithUserText = splitText(userText);
        HashMap<String, Integer> emptyMapForUserText = creatingMap();
        counterForRepeatAndPutNumbers(fillUpMapWithUserText(emptyMapForUserText, stringArrayWithUserText), stringArrayWithUserText);
        String word = returnWordMostRepetitive(counterForRepeatAndPutNumbers(fillUpMapWithUserText(emptyMapForUserText, stringArrayWithUserText), stringArrayWithUserText));
        return word;
    }


    public String returnWordMostRepetitive(HashMap<String, Integer> countedRepeatingWordInMap) {
        int count = 0;
        String mostRepetitiveWord = EMPTY_STRING;
        for (String word : countedRepeatingWordInMap.keySet()) {
            if(count <  countedRepeatingWordInMap.get(word)) {
                count = countedRepeatingWordInMap.get(word);
                mostRepetitiveWord = word;
            }
        }
        return mostRepetitiveWord;
    }

    public HashMap<String, Integer> counterForRepeatAndPutNumbers(HashMap<String, Integer> filledUpMapWithText, String[] stringArrayWithText){
        HashMap<String, Integer> countedRepeatingWordInMap = filledUpMapWithText;
        for (String word : stringArrayWithText) {
            if (countedRepeatingWordInMap.containsKey(word)) {
                countedRepeatingWordInMap.replace(word, countedRepeatingWordInMap.get(word) + 1);
            } else {
                countedRepeatingWordInMap.put(word, 0);
            }
        }
        return countedRepeatingWordInMap;
    }

    public HashMap<String, Integer> fillUpMapWithUserText(HashMap<String, Integer> mapForUserText, String[] stringArrayWithText){
        HashMap<String, Integer> filledUpMapWithUserText = mapForUserText;
        for (String word : stringArrayWithText) {
            mapForUserText.put(word, 0);
        }
        return filledUpMapWithUserText;
    }
    public HashMap<String, Integer> creatingMap(){ return new HashMap<>();
    }

    public String[] splitText(String gettedTextFromUser) {
        return gettedTextFromUser.split(" ");
    }


    public String getTextFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text to find most frequent word - ");
        String gettedTextFromUser = scan.nextLine();
        return gettedTextFromUser;
    }



    public int wordCounter(String[] arrayText){
        int numberOfWords = 0;
        for (int i = 0; i < arrayText.length; i++) {
            numberOfWords += 1;
        }
        return numberOfWords;
    }







}
