package student_roberts_kupcs.lesson_7.homework.level_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WorldService {

        String text;

        public void textSplit(int[] array) {
            String[] arrayOfStrings = text.split("[, . ]+ ");
            System.out.println("Number of substrings: " + arrayOfStrings.length);

            for (int i = 0; i < arrayOfStrings.length; i++) {
                System.out.println("arrayOfStrings[" + i + "] : " + arrayOfStrings[i]);
            }

        }
    public int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }

    public void countWordsUsingSplit() {
    }
}
