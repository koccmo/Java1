package student_igors_bartkevics.lesson_10.homework.level_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MyListImplTest {


    public static void main(String[] args) {
        MyListImplTest test = new MyListImplTest();
        test.addTest();
        test.removeByIndexTest();
        test.getElementByIndexTest();
        test.containsTest();
        test.doesNotContainTest();
    }

    void addTest() {
        MyList list = new MyListImpl();
        list.add(1);
        list.add(2);
        list.add(3);
        checkResult(list.size() == 3, "Add");
    }

    void removeByIndexTest() {
        MyList list = new MyListImpl();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeByIndex(0);
        list.removeByIndex(0);
        list.removeByIndex(0);
        checkResult(list.size() == 0, "Remove by index");
    }

    void getElementByIndexTest() {
        MyList list = new MyListImpl();
        list.add(3);
        list.add(2);
        list.add(1);
        checkResult(list.getElementByIndex(2) == 1, "Get element by index");
    }

    void containsTest() {
        MyList list = new MyListImpl();
        list.add(3);
        list.add(2);
        list.add(1);
        checkResult(list.contains(2), "Contains");
    }

    void doesNotContainTest() {
        MyList list = new MyListImpl();
        list.add(3);
        list.add(2);
        list.add(1);
        checkResult(!list.contains(0), "Does not contain");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }



}
