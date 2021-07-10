package referanceLab;

public class Review<T> implements Print {
    private String author;
    private String body;
    private int revStars;

    public Review(String author, String body, int revStars) {
        this.author = author;
        this.body = body;
        this.revStars = revStars;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getRevStars() {
        return revStars;
    }

    public void setRevStars(int revStars) {
        if(revStars>=0||revStars<=5) {
            this.revStars = revStars;
        }else{
            System.out.println("should add from 0 to 5 stars");
        }
    }

    public String tostring(){
        String result;
        result= "the author is "+this.author + "he/she put " +this.revStars +"and his/her comment is: " + this.body;
        return  result;
    }
}
