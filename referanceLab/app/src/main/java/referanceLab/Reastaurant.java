package referanceLab;

import java.util.ArrayList;
import java.util.HashMap;

public class Reastaurant<T> extends Review implements output , Print{


    private String restaurantName;
    private int numStars;
    private String priceCatig;
    private HashMap<String, HashMap<String, ArrayList<String>>> all;

    HashMap<String, ArrayList<String>> restaurantHash =new HashMap<>();
    ArrayList<String> restaurantList= new ArrayList<>();


    public Reastaurant(String author, String body, int revStars,HashMap all) {
        super(author, body, revStars);
        this.all=all;
    }

    public Reastaurant(String author, String body, int revStars) {
        super(author,body,revStars);
    }


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getNumStars() {
        return numStars;
    }

    public void setNumStars(int numStars) {
        this.numStars = numStars;
    }

    public String getPriceCatig() {
        return priceCatig;
    }

    public void setPriceCatig(String priceCatig) {
        this.priceCatig = priceCatig;
    }

    public String tostring(){
        String result;
        result= "the Restaurant "+this.restaurantName + "has " +this.numStars +"stars" + this.priceCatig +"$";
        return  result;
    }

    public void addReview(Review review){
        restaurantList.add(review.getAuthor());
        restaurantList.add(review.getBody());
        restaurantList.add(String.valueOf(review.getRevStars()));

    }

    @Override
    public void output() {
        restaurantHash.put(getRestaurantName(),restaurantList);
        all.put("Restaurant",restaurantHash);
        System.out.println(all);

    }
}
