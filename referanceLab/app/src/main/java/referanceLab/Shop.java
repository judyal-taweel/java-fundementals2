package referanceLab;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop extends Review implements output,Print {
    private String shopName;
    private String discription;
    private int dolarSign;
    private HashMap<String, HashMap<String, ArrayList<String>>> all;

    HashMap<String, ArrayList<String>> shopHash =new HashMap<String, ArrayList<String>>();
    ArrayList<String> shopList = new ArrayList<>();

    public Shop(String author, String body, int revStars,HashMap all) {
        super(author, body, revStars);
        this.all=all;
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getDolarSign() {
        return dolarSign;
    }

    public void setDolarSign(int dolarSign) {
        this.dolarSign = dolarSign;
    }

    public void addReview(Review review){
        shopList.add(review.getAuthor());
        shopList.add(review.getBody());
        shopList.add(String.valueOf(review.getRevStars()));

    }

    @Override
    public void output() {
        shopHash.put(getShopName(),shopList);
        all.put("shop",shopHash);
        System.out.println(all);



    }
    public String tostring(){
        String result;
        result= "the Shop "+this.shopName + "has " +this.discription +"number of dollar sign" + this.dolarSign +"$";
        return  result;
    }

}
