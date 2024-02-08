import java.util.Random;        // https://www.geeksforgeeks.org/generating-random-numbers-in-java/
/** A Fish class with a set weight or random weight.
 *
 * @author Cody Shitagi
 * @since 1/21/24
 *
 */

public class Fish {
   private String name;
   private String bodyColor;
   private String finColor;
   private String food;
   private int length;
   private int weight;

   private static final double MM_TO_INCHES = 25.4;
   private static final double GRAMS_TO_POUNDS = 453.6;
   // Test the Class
   // public static void main(String[] args){
   //    //System.out.println("Hello Tuna");
   //    Fish carp = new Fish("carp", "red", "red", "bread", 100);
   //    Fish parc = new Fish("parc", "blue", "blue", "meat");
   //    System.out.println(carp);
   //    System.out.println(parc);
   //}

   /** Constructs the distinct characteristics of a fish for the Fish class.
    *
    * @param name The name of the fish
    * @param bodyColor the color of the fish
    * @param finColor the fin color of the fish
    * @param food what the fish eats
    * @param length the length of the fish
    */
   public Fish(String name, String bodyColor, String finColor, String food, int length) {
      // System.out.println("Fish constructor 1");
      this.name = name;
      this.bodyColor = bodyColor;
      this.finColor = finColor;
      this.food = food;
      this.length = length;
      setWeight();
   }

   /** Constructs the distinct characteristics of a fish for the Fish class but randomized length.
    *
    * @param name The name of the fish
    * @param bodyColor the color of the fish
    * @param finColor the fin color of the fish
    * @param food what the fish eats
    */
   public Fish(String name, String bodyColor, String finColor, String food) {
      // System.out.println("Fish constructor 2");
      this.name = name;
      this.bodyColor = bodyColor;
      this.finColor = finColor;
      this.food = food;
      Random rand = new Random();
      this.length = rand.nextInt(1000) + 1;
      setWeight();
   }

   /** toString Method displaying the attributes of a fish.
    *
    * @return a String
    */
   public String toString() {
      String s = "";
      s = "Fish type: " + this.name;
      s = s + "\nBody color: " + this.bodyColor;
      s = s + "\nFin color: " + this.finColor;
      s = s + "\nFood: " + this.food;

      double inches = this.length / MM_TO_INCHES;
      // https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
      String stringInches = String.format("%.2f", inches);
      s = s + "\nLength : " + stringInches + " in";

      double pounds = this.weight / GRAMS_TO_POUNDS;
      String stringPounds = String.format("%.2f", pounds);
      s = s + "\nWeight: " + stringPounds + " lbs\n";

      return s;
   }

   public String getName() {
      return this.name;
   }

   public String getBodyColor() {
      return this.bodyColor;
   }

   public String getFinColor() {
      return this.finColor;
   }

   public String getFood() {
      return this.food;
   }

   public int getLength() {
      return this.length;
   }

   public int getWeight() {
      return this.weight;
   }


   public void setName(String name) {
      this.name = name;
   }

   public void setBodyColor(String bodyColor) {
      this.bodyColor = bodyColor;
   }

   public void setFinColor(String finColor) {
      this.finColor = finColor;
   }

   public void setFood(String food) {
      this.food = food;
   }

   public void setLength(int length) {
      this.length = length;
      setWeight();
   }

   /** Credits for helping me figure out double convertion an power.
    * <p>
    * How to find powers in java.
    * https://ioflood.com/blog/math-pow-java/#:~:text=Function%20in%20Java%3F-,The%20Math.,pow(base%2C%20exponent)%3B%20.
    * </p>
    * <p>
    * How to convert double to integer in java. (I used to be in ICS111)
    * https://www.geeksforgeeks.org/convert-double-to-integer-in-java/
    * </p>
    */
   public void setWeight() {
      double temp = 0.00001 * Math.pow(this.length, 3);
      this.weight = (int) temp;
   }
}
