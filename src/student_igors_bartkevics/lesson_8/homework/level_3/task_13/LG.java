package student_igors_bartkevics.lesson_8.homework.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LG extends TV {
    String webOSVersion;
    public LG(String manufacturer, String model, int sizeOfDiagonal) {
        super(manufacturer, model, sizeOfDiagonal);
    }

    public String getWebOSVersion() {
        return webOSVersion;
    }

    public void setWebOSVersion(String webOSVersion) {
        this.webOSVersion = webOSVersion;
    }
}
