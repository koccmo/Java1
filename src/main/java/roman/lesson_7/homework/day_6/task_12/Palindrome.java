package roman.lesson_7.homework.day_6.task_12;


public class Palindrome {
    public static void main(String[] args) {
        Palindrome check = new Palindrome();
        String text = "А роза упала на лапу Азора";
        System.out.println(check.isPalindrome(text));

    }

    public boolean isPalindrome(String text) {
        if (!containNumbersInText(text)) {
            return checkIfArrayIsPalindrome(textToCharArray(text));
        } else return false;
    }

    public boolean checkIfArrayIsPalindrome(char[] charArray) {
        char[] reversedChar = charArray;
        boolean result = false;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == reversedChar[charArray.length - (i + 1)]) {
               result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public char[] textToCharArray(String text) {
        return text.toLowerCase().replaceAll("[^A-Za-zА-Яа-я]", "").toCharArray();
    }

    public boolean containNumbersInText(String text) {
        return text.matches(".*\\d.*");
    }

    public void printCharArray(char[] charArray) {
        for (char s : charArray) {
            System.out.println(s);
        }
    }

}








