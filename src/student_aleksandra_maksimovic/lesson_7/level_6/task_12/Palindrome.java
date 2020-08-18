package student_aleksandra_maksimovic.lesson_7.level_6.task_12;
/*
Написать программу, которая определяет, является ли строка палиндромом.
Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".

Создать класс Palindrome, который реализует следующий метод:

boolean isPalindrome(String text) - метод возвращает true, если строка является палиндромом, в противном случае false;

Ограничения:
- Логику проверки необходимо реализовать при помощи массивов;
- Знаки препинания и регистр при проверке необходимо игнорировать (Le,VEl = level);

Написать тестовые сценарии для класса Palindrome в классе PalindromeTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */


import java.util.Arrays;

public class Palindrome {

    public boolean isValidChar(char ch) {
        return ch != ' ' && ch != ',' && ch != '.';
    }

    public int findValidCharPos(String text, int start) {
        for (int i = start; i < text.length(); i++) {
            if (isValidChar(text.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public int findValidCharPosReverse(String text, int start) {
        for (int i = start; i >= 0; i--) {
            if (isValidChar(text.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        boolean result = false;
        while (left < right)
        {
            left = findValidCharPos(text, left);
            right = findValidCharPosReverse(text, right);
            if (left < 0 || right < 0 || left >= right) {
                break;
            }

            char leftChar = text.charAt(left);
            char rightChar = text.charAt(right);

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                result = false;
                break;
            }

            result = true;
            left++;
            right--;
        }

        return result;
    }


}
