package test;

public class Shop {
    private String name;
    private String discription;
    private String stars;


    public Shop(String name, String discription, String stars) {
        this.name = name;
        this.discription = discription;
        this.stars = stars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

}


