

package Lab1_CPIT252;

import java.time.LocalDate;

public class App{

  public static void main(String[]args){
    Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta", LocalDate.parse("2024-02-02"),52.0);
    Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta", LocalDate.parse("2024-02-07"),40.0);
    Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta", LocalDate.parse("2024-02-08"),30.5);
    System.out.println("Total Quantity: " + p3.getTotalQuantity());
    
     Product p4 = new FoodProduct(1234, 9.99, "water", LocalDate.parse("2024-02-09"),45.9);
    FoodProduct p5 = new FoodProduct(3452, 10.0, "Cheddar Cheese", LocalDate.parse("2022-06-07"),79.8);
    ElectricProduct p6 = new ElectricProduct(4875, 30.0, "Extension cord", "220v",75.2);
    
    Product [] product={p1, p2, p3, p4, p5, p6};
    for(Product p : product){
        System.out.println(p);
    }
    
    p1.setWeight(50);
  }
}


