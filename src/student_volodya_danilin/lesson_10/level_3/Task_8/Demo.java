package student_volodya_danilin.lesson_10.level_3.Task_8;

class Demo {
    public static void main(String[] args) {

        System.out.println("Starting new tests ... ");

        System.out.println("Creating database ... ");
        InMemoryDatabase database = new InMemoryDatabase();

        System.out.println("Creating Product Nuggets and Product Ak47");
        Product product1 = new Product("Nuggets");
        Product product2 = new Product("Ak47");

        System.out.println("Adding products to the database ...");
        database.save(product1, product2);

        Product demoProd;
        System.out.println("\nLooking for Nuggets ... ");
        demoProd = database.findByTitle("Nuggets");
        if (demoProd.getTitle().equals("Nuggets")) {
            System.out.println(demoProd.getTitle() + " found!");
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nLooking for Ak47 ... ");
        demoProd = database.findByTitle("Ak47");
        if (demoProd.getTitle().equals("Ak47")) {
            System.out.println(demoProd.getTitle() + " found!");
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nLooking for non-existent Product ... ");
        demoProd = database.findByTitle("Milk Chocolate 3000");
        if (demoProd == null) {
            System.out.println("Product not found!");
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }
}
