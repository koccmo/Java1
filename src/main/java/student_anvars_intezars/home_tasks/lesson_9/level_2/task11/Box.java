package student_anvars_intezars.home_tasks.lesson_9.level_2.task11;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class Box {

    protected String size;

    protected Box(String size) {
        this.size = size;
    }

    class AnotherBox extends Box {
    	@CodeReviewComment(teacher = "Свойство, которое не инициализируется?")

    	@CodeReviewComment(teacher = ""
				+ "protected AnotherBox(String size, String material) {"
				+ "            super(size);"
				+ "				this.material = material;"
				+ "        }")
        protected AnotherBox(String size) {
            super(size);
        }
    }
}


