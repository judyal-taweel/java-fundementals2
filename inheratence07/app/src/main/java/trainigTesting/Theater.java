package trainigTesting;

import java.util.ArrayList;
import java.util.HashMap;
//the key of the Hash map : 1 for Resturant , 2
public class Theater extends Review implements OutputInterface,ToStringInterFace {
    private String theaterName;
    private String movie ;
    private boolean isOnShow;
HashMap<Boolean,String> onTheSow = new HashMap<>() ;

    public Theater() {

    }

    public boolean isOnShow() {
        return isOnShow;
    }

    public void setOnShow(boolean onShow) {
        isOnShow = onShow;
    }

    ArrayList<String> allMovie = new ArrayList<>();
    private HashMap<String,HashMap<String,ArrayList<String>>> all;
    HashMap<String, ArrayList<String>> movieMap=new HashMap<>();
    public Theater(String body, String author, String stars,String movie,HashMap all) {
        super(body, Integer.parseInt(stars),author,all );
        this.all=all;
        this.movie=movie;
        allMovie.add(movie);

    }
    public Theater(String movie,boolean isOnShow){
        this.movie=movie;
        this.onTheSow.put(isOnShow,movie);
        if(!allMovie.contains(movie)){allMovie.add(movie);};
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
        movie = movie;
    }


    public void addMovie(String movie,boolean onSecreen){

        if(onTheSow.isEmpty() || !allMovie.contains(movie)){
            allMovie.add(movie);
            onTheSow.put(onSecreen,movie);
        }
        else {
          allMovie.add(movie);
          onTheSow.put(onSecreen,movie);
        }
    }
    public void whichMovieOnSecreen(){
        System.out.println( "the movie on the show is : " +onTheSow.get(true));

    }
    public void removeMovie(String movie){
        if(allMovie.contains(movie)){
            allMovie.remove(movie);
            onTheSow.put(false,movie);

        }
        else {
            System.out.println(movie + "Does not exisit");
        }

    }
    @Override
    public String tostring(){
  for (int i=0;i< allMovie.size();i++){
      System.out.println(allMovie.get(i));
  }
  return "";
    }
    public void addReview(Review review){

        allMovie.add(review.getAuthor());
        allMovie.add(review.getBody());
        allMovie.add(String.valueOf(review.getStars()));
        output();
    }
    @Override
    public void output() {
        movieMap.put(getMovie(),allMovie);
        System.out.println("");
        all.put("Movie", movieMap);
        System.out.println(all.get("Movie"));
    }
}
