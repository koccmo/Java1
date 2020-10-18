package student_aleksandra_maksimovic.lesson_13.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Field {
    private boolean[][] data;


    public Field(int width, int height) {
        data = new boolean[height][width];
    }

    public Field(boolean[][] data) { this.data = data; }

    public void setCell(int x, int y, boolean live) {
        // System.out.println(x + " x " + y + " = " + live);
        data[y][x] = live;
    }

    public boolean getCell(int x, int y) {
        if (x < 0 || x >= getWidth() || y < 0 ||  y >= getHeight()) {
            return false;
        }

        return data[y][x];
    }

    public int getWidth() {
        return data[0].length;
    }

    public int getHeight() {
        return data.length;
    }
}
