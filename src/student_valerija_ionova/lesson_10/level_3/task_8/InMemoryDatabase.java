package student_valerija_ionova.lesson_10.level_3.task_8;

/*Создайте реализацию следующего интерфейса.
Класс должен называться InMemoryDatabase и сохранять продукты в памяти
используя для этого массив или список.

Если продукт не найден при поске то вернуть null.

Обязательно протестируйте созданную вами реализацию интерфейса Database.
*/

import java.util.ArrayList;

class InMemoryDatabase implements  Database{
    private ArrayList<Product> products = new ArrayList<> ();

    ArrayList <Product> getProducts(){
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        Product result;
        for (Product product : products){
            if (product.getTitle().equals(productTitle)){
                return product;
            }
        }
        return null;
    }
}
