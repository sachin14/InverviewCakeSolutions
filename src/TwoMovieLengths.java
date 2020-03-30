import java.util.Arrays;

public class TwoMovieLengths {

    public TwoMovieLengths() {
    }

    public  boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

        // determine if two movies add up to the flight length
        boolean isTwoMovie = false;

        if(movieLengths.length<2){
            return false;
        }


        Arrays.sort(movieLengths);
        int i=0;
        int j=movieLengths.length-1;
        while(i<j){
            if(movieLengths[i]+movieLengths[j]>flightLength){
                j--;
            }
            else if(movieLengths[i]+movieLengths[j]<flightLength){
                i++;
            }
            else{
                isTwoMovie = true;
                break;
            }

        }

        return isTwoMovie;
    }
}
