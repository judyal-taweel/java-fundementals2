package trainigTesting;

import java.util.ArrayList;
import java.util.HashMap;

public class Resturant<T> extends trainigTesting.Review implements OutputInterface,ToStringInterFace {
    private String resturantName;
    private int noOfStars;
    private String priceCategory;
private HashMap<String,HashMap<String,ArrayList<String>>> all;
    HashMap<String, ArrayList<String>> resturantMap =new HashMap<>();
    ArrayList<String> resturantList = new ArrayList<>();
    public Resturant(String body, String author, String stars,HashMap all) {
        super(body, Integer.parseInt(stars),author,all );
        this.all=all;
    }
    public String getResturantName() {
        return resturantName;
    }
    public String setName(String name) {
        this.resturantName = name;
        return name;
    }
    public String getNoOfStars() {
        return String.valueOf(noOfStars);
    }

    public void setNoOfStars(int noOfStars) {
        this.noOfStars = noOfStars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }
    @Override
    public String tostring(){
        String result;
        result= "the Restaurant "+this.resturantName + " has " +this.noOfStars +"  stars  " + this.priceCategory +" ";
        return  result;
    }
    public void addReview(trainigTesting.Review review){

        resturantList.add(review.getAuthor());
        resturantList.add(review.getBody());
        resturantList.add(String.valueOf(review.getStars()));
        resturantList.add("-->");
        output();
    }

    @Override
    public void output() {
        resturantMap.put(getResturantName(),resturantList);
        System.out.println("");
        all.put("Resturant", resturantMap);
        System.out.println(all.get("Resturant"));
    }
}
