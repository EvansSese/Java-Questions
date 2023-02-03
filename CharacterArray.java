import java.util.Arrays;

public class CharacterArray {
    public static void main(String[] args) {
        char[] a = { 'a', 'b', 'c' };
        System.out.println(Arrays.toString(f(a, 0, 0)));
    }

    public static char[] f(char[] a, int start, int len) {
        if (start < 0 || len < 0 || len > a.length || ((a.length - start) < len)) {
            return null;
        }

        char[] b = new char[len];

        for (int i = start, j = 0; j < len; i++, j++) {
            b[j] = a[i];
        }
        return b;
    }
}
