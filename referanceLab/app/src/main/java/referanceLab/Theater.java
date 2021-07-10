package referanceLab;

import java.util.ArrayList;
import java.util.HashMap;

public class Theater extends Review implements Print,output{
    private String theaterName;
    private String movie;
    private boolean isOnShow;
    private HashMap<String, HashMap<String, ArrayList<String>>> all;


    ArrayList<String> allMovies=new ArrayList<>();

    HashMap<String, ArrayList<String>> theaterHash =new HashMap<>();

    public Theater(String author, String body, int revStars , String movie,HashMap all) {
        super(author, body, revStars);
        this.movie=movie;
        this.all=all;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public boolean isOnShow() {
        return isOnShow;
    }

    public void setOnShow(boolean onShow) {
        isOnShow = onShow;
    }

    public ArrayList<String> getAllMovies() {
        return allMovies;
    }

    public void setAllMovies(ArrayList<String> allMovies) {
        this.allMovies = allMovies;
    }

    public void addMovie(String mov){
        if(isOnShow){
            System.out.println("the "+ mov +" is exist" );
        }else{
            allMovies.add(mov);
        }
    }

    public void deleteMovie(String mov){

        if (allMovies.contains(mov)){
            allMovies.remove(mov);
        }else{
            System.out.println("the movie does not exist");
        }

    }

    public void addReview(Review review){
        allMovies.add(review.getAuthor());
        allMovies.add(review.getBody());
        allMovies.add(String.valueOf(review.getRevStars()));

    }

    @Override
    public void output() {
        theaterHash.put(getMovie(), allMovies);
        all.put("Moveis",theaterHash);
        System.out.println(all);



    }


    public String tostring(){
        String result;
        result= "the name of Theater is  "+this.theaterName + "and there movies are " +this.allMovies ;
        return  result;
    }
}
