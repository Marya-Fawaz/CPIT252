

import java.lang.reflect.Modifier;
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

/**
 *
 * @author USER
 */
public class Lab1Test {
    private static Product p1, p2, p3, p4;

    @BeforeClass
    public static void init(){
        p1 = new FoodProduct(6745, 5.50, "Penne Pasta", LocalDate.parse("2024-10-23"), 200.0);
        p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta", LocalDate.parse("2024-10-23"),50.5);
        p3 = new FoodProduct(2106, 4.50, "Linguine Pasta", LocalDate.parse("2024-10-23"), 65.8);
        p4 = new ElectricProduct(4875, 30.0, "Extension cord","220v", 70.0);
    }

    //  Question 1: Instance and class variables
    @Test
    public void checkQ1shouldCountQuantity()
    {
        assertEquals(4, p3.getTotalQuantity());
    }

    // Question 2: Unit testing (no testing - will be inspected manually)

    // Question 3: Inheritance
    @Test
    public void checkQ3Inheritance(){
        assertTrue(p1 instanceof Product);
        assertTrue(p2 instanceof Product);
        assertTrue(p3 instanceof Product);
        assertTrue(p4 instanceof Product);
    }

    // Question 4: Polymorphism "Many Forms" (no testing - will be inspected)

    // Question 5: Controlling Changes
    @Test
    public void checkQ5NoOverride(){
        try{
            assertTrue(Modifier.isFinal(Product.class.getMethod("addToShoppingCart").getModifiers()));
        }
        catch(NoSuchMethodException e){
            fail();
        }
    }
    // Question 6: Abstraction (no testing - will be inspected)
    @Test
    public void checkQ6Abstraction(){
        assertTrue(Modifier.isAbstract(Product.class.getModifiers()));
    }


    // Question 7: Encapsulation (no testing - will be inspected)
    @Test
    public void checkQ7EncapsulationShouldNotAllowInvalidValues() {
        try {
            p1.setWeight(-10);
            // if no exception is thrown
            assertTrue(p1.getWeight() > 0);
        }
        // if an exception is thrown
        catch(IllegalArgumentException e){
            assertTrue(p1.getWeight() > 0);
        }
    }
}

