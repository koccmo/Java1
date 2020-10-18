package student_volodya_danilin.lesson_14.level_2;

@FunctionalInterface
interface ApplePredicate {

    boolean test (Apple apple);

}

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }
}

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}

class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        int appleWeight = Integer.parseInt(apple.getWeight());
        return appleWeight > 150;
    }
}

class AppleLightWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        int appleWeight = Integer.parseInt(apple.getWeight());
        return appleWeight < 150;
    }
}

class AppleHeavyGreenPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        int appleWeight = Integer.parseInt(apple.getWeight());
        String appleColor = apple.getColor();
        return appleWeight > 150
                && appleColor.equals("green");
    }
}



