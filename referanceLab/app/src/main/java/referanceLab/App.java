/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package referanceLab;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        HashMap<String,HashMap<String, ArrayList>> all= new HashMap<>();

    Review rev1 = new Reastaurant("judy","good",5,all);

        Reastaurant casting = (Reastaurant) rev1;

        casting.setRestaurantName("shawarmaji");
//        casting.setAuthor("mahmoud");

        casting.addReview(rev1);
        Review rev2 = new Reastaurant("mahmoud","good",5,all);
        casting.setRestaurantName("zanjabeel");

        casting.addReview(rev2);

        casting.output();

        Review rev3 = new Shop("mahmoud2","I like it",5,all);
        Shop castingShop = (Shop) rev3;
        castingShop.setShopName("adidas");
        castingShop.addReview(rev3);
        castingShop.output();
//
        Review rev4=new Theater("sara","magnafisant",5,"dark knight",all);
        Theater castingTheater = (Theater) rev4;
        castingTheater.addReview(rev4);
        castingTheater.output();
//

    }
}
