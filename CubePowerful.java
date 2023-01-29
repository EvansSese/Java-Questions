public class CubePowerful {
    public static void main(String[] args) {
        System.out.println(isCubePowerful(0));
    }

    public static int isCubePowerful(int n) {
        int sum = 0; // initialize sum
        int step = 10;
        int num = n;
        if (n > 0) {
            while (step <= n * 10) {
                int digit = num % 10;
                sum = sum + (int) Math.pow(digit, 3);
                num = num / 10;
                step = step * 10;
            }

            if (sum == n) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
