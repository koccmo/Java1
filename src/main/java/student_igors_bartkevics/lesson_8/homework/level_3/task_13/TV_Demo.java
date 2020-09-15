package student_igors_bartkevics.lesson_8.homework.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TV_Demo {

    public static void main(String[] args) {
        LG lg = new LG("LG", "UH630V", 42);
        Samsung samsung = new Samsung("Samsung", "UE32n4005", 32);
        lg.setWebOSVersion("2.0");
        samsung.setTizenVersion("2.1 Nectarine");

    }

}
