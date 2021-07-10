package test;

public class Review<T> {

    private String author;
    private String body;
    private int stars;

    public Review(String author , String body, int stars ){
        this.author=author;
        this.body=body;
        this.stars=stars;
    }



    public void setAuthor(String author) {
        this.author = author;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setStars(int stars) {
        if(stars <= 5 || stars >= 0){
            this.stars = stars;
        }else{
            System.out.println("The stars should be between 0 - 5");
        }
    }
    public String getAuthor() {
        return author;
    }
    public String getBody() {
        return body;
    }
    public int getStars() {
        return stars;
    }
    public String toString(){
        String result;
        result= "the Restaurant "+this.author + "voted " +this.stars +"stars" + this.body;
        return  result;
    }
}
