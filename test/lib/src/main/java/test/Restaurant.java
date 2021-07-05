package test;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant extends Review {
    private String name;
    private int stars;
    private int priceCategory;


    public Restaurant(String author, String body, int stars) {
        super(author, body, stars);
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public int getPriceCategory() {
        return priceCategory;
    }
    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String toString(){
        String result;
        result= "the Restaurant "+this.name + "has " +this.stars +"stars" + this.priceCategory +"$";
        return  result;
    }
    public void addReview(Review review){
        HashMap<String, ArrayList<String>> clientRev=new HashMap<>();
        ArrayList<String> myrev= new ArrayList<>();
        myrev.add(review.getAuthor());
        myrev.add(review.getBody());
        myrev.add(String.valueOf(review.getStars()));

        clientRev.put(this.name,myrev);
        System.out.println(clientRev);

    }

}
