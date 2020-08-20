package student_valerija_ionova.lesson_7.homeworks.level_6.task_12;

/*Написать программу, которая определяет, является ли строка палиндромом.
Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".

Создать класс Palindrome, который реализует следующий метод:

boolean isPalindrome(String text) - метод возвращает true, если строка является палиндромом, в противном случае false;

Ограничения:
- Логику проверки необходимо реализовать при помощи массивов;
- Знаки препинания и регистр при проверке необходимо игнорировать (Le,VEl = level);

Написать тестовые сценарии для класса Palindrome в классе PalindromeTest.
Все тестовые сценарии должны отрабатывать без ошибок.*/

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Palindrome {

	@CodeReviewComment(teacher = "public method really? May be private?")
	@CodeReviewComment(teacher = "Because clients will invoke only isPalindrome() method.")
    private String [] arrayOfWords (String text){
        String [] arrayOfLetters = new String [text.length()];

        int j = 0;
        for (int i = 0; i<text.length(); i++){
            if (Character.isLetter(text.charAt(i))){
                arrayOfLetters[j] = String.valueOf(text.charAt(i)).toLowerCase();
                j++;
            }
        }
        String [] arrayOfWordsRightLength = new String [j];
        for (int k = 0; k<arrayOfWordsRightLength.length; k++){
            arrayOfWordsRightLength[k] = arrayOfLetters[k];
        }
        return arrayOfWordsRightLength;
    }

    public boolean isPalindrome(String text){
        boolean result = true;
        for (int i=0; i<arrayOfWords(text).length; i++){
            if (!arrayOfWords(text)[i].equals(arrayOfWords(text)[arrayOfWords(text).length-1-i])){
                result = false;
            }
        }
        return result;
    }
}