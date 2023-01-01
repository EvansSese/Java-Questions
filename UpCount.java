class UpCount {
    public static void main(String[] args) {
        int[] arrayA = { 2, 3, 1, -6, 8, -3, -1, 2 };
        int aRes = nUpCount(arrayA, 5);
        System.out.println("5 - Upcount for array {2,3,1,-6,8,-3,-1,2} is " + aRes);

        int[] arrayB = { 6, 3, 1 };
        int bRes = nUpCount(arrayB, 6);
        System.out.println("6 - Upcount for array {6,3,1} is " + bRes);

        int[] arrayC = { 1, 2, -1, 5, 3, 2, -3 };
        int cRes = nUpCount(arrayC, 20);
        System.out.println("20 - Upcount for array {1,2,-1,5,3,2,-3} is " + cRes);
    }

    static int nUpCount(int[] a, int n) {
        int partialSum = 0;
        int prevPartialSum = 0;
        int upCount = 0;
        for (int i = 0; i < a.length; i++) {
            partialSum += a[i];
            prevPartialSum = (partialSum - a[i]);

            if (partialSum > n && prevPartialSum <= n) {
                upCount++;
            }
        }

        return upCount;
    }
}