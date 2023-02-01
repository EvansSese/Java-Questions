import java.util.Arrays;

/**
 * HMS
 */
public class HMS {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3600)));
    }

    public static int[] computeHMS(int seconds){

        //create a new array, with length 3
        int[] HMS = new int[3];

        //get the quotient of the seconds as hours after dividing by 3600
        int hours = (int)seconds/3600;

        //get the remainder/modulo as minutes (in seconds)
        int minutes = seconds%3600;

        //get the quotient as minutes
        int min = (int)minutes/60;

        //get the modulo as seconds
        int sec = minutes%60;

        //assign the hours, min, and seconds to the HMS array
        HMS[0] = hours;
        HMS[1] = min;
        HMS[2] = sec;

        //return the array
        return HMS;

    }
    
}