public class ContinuousFactored {

    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));

        System.out.println(isContinuousFactored(121));
        System.out.println(isContinuousFactored(99));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(13));

        System.out.println(isContinuousFactored(720));
    }

    public static int isContinuousFactored(int n) {
        // loop through factors from 2 onward
        for (int firstFactor = 2; firstFactor < n / 2; firstFactor++) {
            // divide the number to see if its a factor
            if (n % firstFactor == 0) {
                // check to see if the consecutive number is also a factor
                int secondFactor = firstFactor + 1;
                if (n % secondFactor == 0) {
                    // confirm if the number has only 2 factors
                    int currentProduct = firstFactor * secondFactor;
                    if (currentProduct == n) {
                        return 1;
                    } else {
                        // check for consecutive factors
                        for (int nextFactor = secondFactor + 1; nextFactor < secondFactor + 2; nextFactor++) {
                            // check if next Factor is a factor of the number
                            if (n % nextFactor == 0) {
                                int finalProduct = currentProduct * nextFactor;
                                if (finalProduct == n) {
                                    return 1;
                                } else {
                                    // increase currentProduct
                                    currentProduct = currentProduct * nextFactor;
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}