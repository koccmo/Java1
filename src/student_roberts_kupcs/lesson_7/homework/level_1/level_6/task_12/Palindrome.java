package student_roberts_kupcs.lesson_7.homework.level_1.level_6.task_12;

//Написать программу, которая определяет, является ли строка палиндромом.
//Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
//Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
//например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".
//
//Создать класс Palindrome, который реализует следующий метод:
//
//boolean isPalindrome(String text) - метод возвращает true, если строка является палиндромом, в противном случае false;
//
//Ограничения:
//- Логику проверки необходимо реализовать при помощи массивов;
//- Знаки препинания и регистр при проверке необходимо игнорировать (Le,VEl = level);
//
//Написать тестовые сценарии для класса Palindrome в классе PalindromeTest.
//Все тестовые сценарии должны отрабатывать без ошибок.

class Palindrome {


    public boolean isPalindrome(String text) {

        // очистите строку .,; array[]
        String[] words = text.split("(<=,?/)");

        // Перестановка элементов массива в обратном порядке
        for (int i = 0; i < words.length / 2; i++) {
            String tmp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = tmp;
            System.out.println(tmp);

            // сравнит ее []
            if (words.equals(tmp)) {
                System.out.println(tmp);
                return true;
            } else {
                return false;
            }

        }

        return true;
    }
}
