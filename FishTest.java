import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.text.DecimalFormat;

/** Assignment 1 Fish JUnit test.
* @author Lisa Miller
* @version 1.0
* @since 8/26/23
*/

public class FishTest {
   /** length to weight coefficient. */
   public static final double LEN_TO_WT_COEFF = 0.00001;
   /**mm to inches factor. */
   public static final double MM_TO_INCH = 25.4;
   /**grams to pounds factor. */
   public static final double G_TO_LBS = 453.6;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** 
   * Test constructor with given length and toString method.
   * checks that toString is properly formatted
   */
   @Test
   public void constructor5ParamAndtoStringTest() {
      Fish f = new Fish("parrotfish", "blue-green", "blue", "algae", 80);
      Assert.assertEquals("toString format is incorrect for Fish with given length 80mm",  
            "Fish type: parrotfish\nBody color: blue-green\nFin color: blue\nFood: algae\n"
            + "Length: 3.15 in\nWeight: 0.01 lbs\n", f.toString());
   
   }
   
   /** 
   * Test constructor without length and toString method.
   * checks that toString is properly formatted
   */
   @Test
   public void constructor4ParamAndtoStringTest() {
      DecimalFormat df = new DecimalFormat("0.00");
      Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
      int len = f.getLength();
      int wt = f.getWeight();
      String sLen = df.format(len / MM_TO_INCH);
      String sWt = df.format(wt / G_TO_LBS);
      Assert.assertEquals("toString format is incorrect for Fish with random length",  
            "Fish type: parrotfish\nBody color: blue-green\nFin color: blue\nFood: algae\n" 
             + "Length: " + sLen + " in\nWeight: " + sWt + " lbs\n", f.toString());
   }
   
     
   //************ Get Methods Tests ****************
   
   /** 
   * Test getName method.
   */
   @Test
   public void getNameTest() {
      Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
      Assert.assertEquals("getName method doesn't return the correct Fish name",  
            "parrotfish", f.getName());
   
   }
   /** 
   * Test getBodyColor method.
   */
   @Test
   public void getBodyColorTest() {
      Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
      Assert.assertEquals("getBodyColor method doesn't return the correct body color",  
            "blue-green", f.getBodyColor());
   
   }
   
      /** 
   * Test getFinColor method.
   */
   @Test
   public void getFinColorTest() {
      Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
      Assert.assertEquals("getBodyColor method doesn't return the correct body color",  
            "blue", f.getFinColor());
   
   }
   
   /** 
   * Test getFood method.
   */
   @Test
   public void getFoodTest() {
      Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
      Assert.assertEquals("getFood method doesn't return the correct food string",  
            "algae", f.getFood());
   
   }


   
   /** Constructor no length test - length should be random between 1 - 1000. 
   * runs 100 time to check random range
   */
   @Test public void randomLengthGetSetTest() {
      Fish f;
      int len;
      for (int i = 0; i < 100; i++) {
         f = new Fish("carp", "gold", "brown", "algae");
         len = f.getLength();
         Assert.assertTrue("Fish length should be between 1 - 1000 grams"
               + " if no length given to constructor, but was"
               + len, (len > 0 && len <= 1000));
      }
   
   }
   
   /** Constructor weight set test. 
   * weight should be 0.00001 * length^3
   * runs 100 time to check correctness
   */
   @Test public void weightGetSetTest() {
      Fish f;
      int len;
      int wt;
      for (int i = 0; i < 100; i++) {
         f = new Fish("carp", "gold", "brown", "anything");
         len = f.getLength();
         wt = f.getWeight();
         Assert.assertTrue("Fish weight should be 0.00001 * length^3"
               + ", but length was " + len + " and weight was "
               + wt, wt == (int) (LEN_TO_WT_COEFF * len * len * len));
      }
   
   }
    
    //********************* set Methods tests *************************
      /** 
   * Test setName method.
 //   */
//    @Test
//    public void setNameTest() {
//       Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
//       f.setName("Uhu");
//       Assert.assertEquals("setName method doesn't correctly set Fish name",  
//           "Uhu", f.getName());
//    
//    }
// 
//          /** 
//    * Test setBodyColor method.
//    */
//    @Test
//    public void setBodyColorTest() {
//       Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
//       f.setBodyColor("Gray");
//       Assert.assertEquals("setBodyColor method doesn't correctly set Fish body color",  
//             "Gray", f.getBodyColor());
//    
//    } 
//              /** 
//    * Test setFinColor method.
//    */
//    @Test
//    public void setFinColorTest() {
//       Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
//       f.setFinColor("Gray");
//       Assert.assertEquals("setFinColor method doesn't correctly set Fish body color",  
//             "Gray", f.getFinColor());
//    
//    } 
//    
//    /** 
//    * Test setFood method.
//    */
//    @Test
//    public void setFoodTest() {
//       Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
//       f.setFood("limu");
//       Assert.assertEquals("setFood method doesn't correctly set Fish food",  
//             "limu", f.getFood());
//    
//    } 
//    
//    /** 
//    * Test setLength method.
//    */
//    @Test
//    public void setLengthTest() {
//       Fish f = new Fish("parrotfish", "blue-green", "blue", "algae");
//       f.setLength(100);
//       Assert.assertEquals("setLength method doesn't correctly set Fish length",  
//             100, f.getLength());
//       //weight should also get changed!
//       Assert.assertEquals("setLength method doesn't cause Fish weight to also update",  
//             10, f.getWeight());
//    } 
    
} //end test class
