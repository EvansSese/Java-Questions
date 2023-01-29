public class DecodeArray {
    public static void main(String[] args) {
        int[] a = { 1, 1 };
        System.out.println(decodeArray(a));
    }

    public static int decodeArray(int[] a) {
        String s = Integer.toString(0);
        for (int i = 1; i < a.length; i++) { // start at second element, so that we can get the first and find the
                                             // diff
            int prev_element = a[i - 1];
            int current_element = a[i];
            int element_difference = Math.abs(prev_element - current_element); // abs difference between the two
                                                                               // elements

            String num_string = Integer.toString(element_difference); // convert to string so that we can concatenate
            s = s + num_string; // concatenate the string
        }

        int encodedNum = Integer.parseInt(s); // convert back to integer

        if (a[0] < 0) {
            encodedNum = -1 * encodedNum; // check if first element is negative, then encoded number is also negative
        }

        return encodedNum; // return encoded number
    }
}
