import java.util.Scanner;
public class Movie{
    private String name;
    private String mpaa;
    private int rating;
    private double average;

    public void setName(String newName){
        name = newName;
    }

    public String getMovie(){
        return name;
    }

    public void setMpaa(String newMpaa){
        mpaa = newMpaa;
    }

    
    public void addRating(int input){
        input = input + input;
    }


    public String getMpaa(){
        return mpaa;
    }

    public static void main(String[] args){
        Movie object1 = new Movie();

        Scanner kbd = new Scanner(System.in);
        System.out.println("What is the name of the first movie?");
        String movie1 = kbd.nextLine();
        object1.setName(movie1);
        
        boolean rating = true;
        while(rating){
            System.out.println("What is the MPAA rating of " + movie1 + " ?");
            String movieRating = kbd.nextLine();
                       
            if ((movieRating.equalsIgnoreCase("G") == false) && (movieRating.equalsIgnoreCase("PG") == false) && (movieRating.equalsIgnoreCase("PG-13") == false) && (movieRating.equalsIgnoreCase("R") == false)){
                System.out.println("Please enter a valid MPAA rating.");
                continue;
            } 
            else
                break;
        }        
        
        while(rating){
        System.out.println("Would you rate this movie a 1, 2, 3, 4, or 5?");
            int opinion = kbd.nextInt();
            
            if (((opinion == 1) == false) && ((opinion == 2) == false) && ((opinion == 3) == false) && ((opinion == 4) == false) && ((opinion == 5) == false)){
                System.out.println("Please enter a valid rating from 1-5");
                continue;
            }
            else 
                break;
            //System.out.println("The movie " + movie1 + ", rated" + movieRating + "has an average movie rating of: ");
        }
        
        }
    }
