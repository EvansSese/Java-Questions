import java.util.Arrays;

/**
 * HMS
 */
public class HMS {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3600)));
    }

    public static int[] computeHMS(int seconds){
        int[] HMS = new int[3];

        int hours = (int)seconds/3600;
        int minutes = seconds%3600;
        int min = (int)minutes/60;
        int sec = minutes%60;

        HMS[0] = hours;
        HMS[1] = min;
        HMS[2] = sec;

        return HMS;

    }
    
}