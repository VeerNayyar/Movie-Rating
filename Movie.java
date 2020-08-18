import java.util.Scanner;
public class Movie{
    private String movie;
    private String mpaa;
    private int rating;

    public void setMovie(String newMovie){
        movie = newMovie;
    }

    public void setMpaa(String newMpaa){
        mpaa = newMpaa;
    }

    public void addRating(int input){

    }

    public String getMovie(){
        return movie;
    }

    public String getMpaa(){
        return mpaa;
    }

    public static void main(String[] args){
        Movie object1 = new Movie();
        Movie object2 = new Movie();
        
        Scanner kbd = new Scanner(System.in);
        System.out.println("What is the name of the first movie?");
        String movie1 = kbd.nextLine();
        object1.setMovie(movie1);
        
        String movier = kbd.nextLine();
        
        if ((movier.equalsIgnoreCase("G") == false) && (movier.equalsIgnoreCase("PG") == false) && (movier.equalsIgnoreCase("PG-13") == false) && (movier.equalsIgnoreCase("R") == false)){
            System.out.println("Please enter a valid MPAA rating.");
        }
    }
}