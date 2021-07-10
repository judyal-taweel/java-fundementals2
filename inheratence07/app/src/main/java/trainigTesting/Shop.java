package trainigTesting;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop extends Review implements OutputInterface,ToStringInterFace {
    private String shopName;
    private String description ;
    private String shopStars;
    private HashMap<String,HashMap<String,ArrayList<String>>> all;
    HashMap<String, ArrayList<String>> shopMap=new HashMap<>();
    ArrayList<String> shopList= new ArrayList<>();
    public Shop(String body, String author, String stars,HashMap all) {
        super(body, Integer.parseInt(stars),author,all );
        this.all=all;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShopStars() {
        return shopStars;
    }

    public void setShopStars(String shopStars) {
        this.shopStars = shopStars;
    }
    public void addReview(Review review){

        shopList.add(review.getAuthor());
        shopList.add(review.getBody());
        shopList.add(String.valueOf(review.getStars()));
         output();
    }
    @Override
    public String tostring(){
        String result;
        result= "the Shop "+this.shopName + " has " +this.description +"  stars  " + this.shopStars +" ";
        return  result;
    }
    @Override
    public void output() {
        shopMap.put(getShopName(),shopList);
        System.out.println("");
        all.put("Shop", shopMap);
        System.out.println(all.get("Shop"));
    }
}
