package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant<T> extends Review {

    private String name;
    private int starss;
    private int priceCategory;


    public Restaurant(String author, String body, int starss) {
        super(author, body, starss);
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStarss() {
        return starss;
    }
    public void setStarss(int stars) {
        this.starss = stars;
    }
    public int getPriceCategory() {
        return priceCategory;
    }
    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String toString(){
        String result;
        result= "the Restaurant "+this.name + "has " +this.starss +"stars" + this.priceCategory +"$";
        return  result;
    }
    public void addReview(Review review){
        HashMap<T, ArrayList<T>> clientRev=new HashMap<>();
        ArrayList<T> myrev= new ArrayList<>();
        myrev.add((T) review.getAuthor());
        myrev.add((T) review.getBody());
//        myrev.add(review.setStars(this.getStars()));
//        myrev.add((T) String.valueOf(review.getStars()));
//        myrev.add(review.getStars())


        clientRev.put((T) this.name,myrev);
        System.out.println(clientRev);

    }
}
