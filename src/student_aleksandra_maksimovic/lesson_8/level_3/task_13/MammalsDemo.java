package student_aleksandra_maksimovic.lesson_8.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MammalsDemo {
    public static void main(String[] args) {
        MammalsDemo demo = new MammalsDemo();
        demo.polarBearDemo();
        demo.blueWhaleDemo();
        demo.elephantDemo();
    }

  public void polarBearDemo() {
      PolarBear polarBear = new PolarBear(true, true);
      String habitat = polarBear.habitat();
      int lifespan = polarBear.lifespan();
      System.out.println("Polar Bear habitat - "+habitat+", estimated life expectancy "+lifespan+" years.");
  }
  public void blueWhaleDemo() {
      BlueWhale blueWhale = new BlueWhale(true, true);
      String habitat = blueWhale.habitat();
      int lifespan = blueWhale.lifespan();
      System.out.println("Blue Whale habitat - "+habitat+", estimated life expectancy "+lifespan+" years.");
  }
  public void elephantDemo() {
      Elephant elephant = new Elephant(true, true);
      String habitat = elephant.habitat();
      int lifespan = elephant.lifespan();
      System.out.println("Elephant habitat - " + habitat + ", estimated life expectancy " + lifespan + " years.");
  }
}
