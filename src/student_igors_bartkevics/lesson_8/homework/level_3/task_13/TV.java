/*
Придумайте и создайте абстрактный класс и его потомков.
 */
package student_igors_bartkevics.lesson_8.homework.level_3.task_13;

abstract class TV {
    private String manufacturer;
    private String model;
    private int sizeOfDiagonal;

    public TV(String manufacturer, String model, int sizeOfDiagonal) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.sizeOfDiagonal = sizeOfDiagonal;
    }
}
