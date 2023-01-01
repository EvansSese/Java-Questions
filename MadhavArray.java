class MadhavArray {
    public static void main(String[] args) {
        int[] a = { 18, 9, 10, 6, 6, 6 };
        int res = isMadhavArray(a);
        System.out.println(res);
    }

    static int isMadhavArray(int[] a) {
        // check if it meets n*(n+1)/2
        int isMadhav = 0;
        int arrayLength = a.length;
        int startIndex = 0;
        int endIndex = 0;
        int n = 1; // track the current length of aaray elements between start and end
        int currentSum = 0; // current sum of array elements
        int sum = 0; // sum of elements of array between start and end
        int currentLengthOfArray = 1; // length of array between 0 to endIndex
        int calculatedLengthOfArray = 1; // length calculating n*(n+1)/2

        while (currentLengthOfArray <= arrayLength) {
            if (currentLengthOfArray == calculatedLengthOfArray) {
                for (int index = startIndex; index <= endIndex; index++) {
                    sum += a[index];
                }
            } else {
                // fail:: length of madhav array should be n*(n+1)/2
                isMadhav = 0;
                break;
            }

            if ((currentSum == sum) || (startIndex == endIndex)) {
                currentSum = sum;
                sum = 0;
                isMadhav = 1;
            } else {
                // Fail:: sum is not equal
                isMadhav = 0;
                break;
            }

            if (currentLengthOfArray == arrayLength) {
                // already at the end of array
                break;
            } else {
                startIndex = endIndex + 1;
                endIndex = startIndex + n;

                if ((startIndex < arrayLength && endIndex < arrayLength)) {
                    // operating inside array boundaries
                    n++;
                } else {
                    // adjusting boundaries so that lastIndex points to last element of array
                    endIndex = arrayLength - 1;
                    n = endIndex - startIndex;
                }
                calculatedLengthOfArray = n * (n + 1) / 2;
                currentLengthOfArray = endIndex + 1;
            }
        }

        return isMadhav;
    }
}