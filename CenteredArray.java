public class CenteredArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        System.out.println(isCentered(a));
    }

    public static int isCentered(int[] a) {
        // check if the length of array is odd
        if (a.length % 2 != 0) {
            int centerIndex = a.length / 2;
            for (int i = 0; i < a.length; i++) {
                if ((i != centerIndex) && a[i] <= a[centerIndex]) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;

    }
}
