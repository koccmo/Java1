package student_igors_bartkevics.lesson_7.homework.level_6.task_12;

class Palindrome {

    boolean isPalindrome(String text) {
        boolean result = false;
        char[] transformedText = transformText(text);
        for (int i =0; i < (transformedText.length)/2; i++ ) {
            if (transformedText[i] == transformedText[transformedText.length-(i+1)]) {
                result = true;
            }
            else {
                result =  false;
                break;
            }
        }
        return result;
    }

    public char[] transformText(String text) {
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (isLetter(text.charAt(i))) {
                newText.append(text.charAt(i));
            }
        }
        return newText.toString().toLowerCase().toCharArray();
    }

    public boolean isLetter(char symbol) {
        return Character.isLetter(symbol);
    }
}

