package student_igors_bartkevics.lesson_7.homework.level_x.super_task_1.ver_3;

class NameValidator {

    static boolean isDiskNameValid(char diskName) {
        boolean result = false;
        if (Character.isLetter(diskName)) {
            if (Character.isUpperCase(diskName)) {
                result = true;
            }
        }
        return result;
    }

    static boolean isFolderNameValid(String name) {
        return isFolderNameContainsValidCharacters(name) && isValidFolderNameLength(name);
    }

    static boolean isFolderNameContainsValidCharacters(String name) {
        boolean result = true;
        for (int i = 0; i < name.length(); i++) {
            if (!isValidCharacter(name.charAt(i))) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean isValidCharacter(char character) {
        return (Character.isLetter(character) ||
                Character.isDigit(character) ||
                character == '_');
    }

    private static boolean isValidFolderNameLength(String name) {
        return name.length() < 20;
    }


}
