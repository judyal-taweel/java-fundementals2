package trainigTesting;

import java.util.HashMap;

public class Review <T> implements ToStringInterFace {
    public String body;
    private String author;
    private String stars;
    private HashMap all;
    public Review(String body,int stars,String author,HashMap all){
        this.body=body;
        this.author=author;
        this.stars= String.valueOf(stars);
        this.all=all;
    }
    public Review(String author) {
        this.author=author;
    }
    public Review(){

    }
    public String getBody() {
        return body;
    }
    public String setBody(String body) {
        this.body = body;
        return body;
    }
    public String getAuthor() {
        return author;
    }
    public String setAuthor(String author) {
        this.author = author;
        return author;
    }
    public String getStars() {
        return stars;
    }
    public void setStars(String stars) {
        this.stars = stars;
//        return String.valueOf(stars);
    }
    public String tostring(){
        String result;
        result= " the Author of this Review is  "+this.author + "  He/She put a  " +this.stars +"  and His/Her comment :  " + this.body;
        return  result;
    }
}
