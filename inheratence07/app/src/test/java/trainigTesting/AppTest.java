/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trainigTesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest  {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void testtoStringReview() {
        Review reviewTest = new Review("ok",5,"mahmood");
        assertEquals(" the Restaurant "+reviewTest.getAuthor() + "  voted " +reviewTest.getStars() +"  stars  " + reviewTest.getBody(), reviewTest.tostring());
    }
//"the Restaurant "+this.name + " has " +this.noOfStars +"  stars  " + this.priceCategory +" $"
@Test public void testtoStringResturant() {
   Resturant resturantTest = new Resturant("ok","mahmood","4");
   resturantTest.setName("shawrma");
   resturantTest.setNoOfStars(4);
   resturantTest.setPriceCategory(" $");
    assertEquals("the Restaurant "+resturantTest.getResturantName() + " has " +resturantTest.getNoOfStars() +"  stars  " + resturantTest.getPriceCategory() +" ", resturantTest.tostring());
}
@Test public void addReviewTest(){
    Review rev1 = new Resturant("good","Judy","5");

    Resturant reviewCasting = (Resturant) rev1;
    reviewCasting.setName("Zanjabeel");

    assertEquals ("{Zanjabeel=[judy, good, 5]}","{"+reviewCasting.getResturantName()+"=["+reviewCasting.getBody()+", "+reviewCasting.getAuthor()+", "+reviewCasting.getStars()+"]}");


}


}