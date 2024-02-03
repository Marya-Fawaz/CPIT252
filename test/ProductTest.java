

import java.time.LocalDate;
import Lab1_CPIT252.ElectricProduct;
import Lab1_CPIT252.FoodProduct;
import Lab1_CPIT252.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



public class ProductTest
{
    @Test
    public void shouldCountQuantity()
    {
    Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta", LocalDate.parse("2024-10-23"), 200.0);
    Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta", LocalDate.parse("2024-10-23"), 220.0);
    Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta", LocalDate.parse("2024-10-23"), 300.00);
    Product p4 = new ElectricProduct(4875, 30.0, "Extension cord", "220v", 200.0);
   
    assertEquals(p3.getTotalQuantity(), 4);
    }

    
}
