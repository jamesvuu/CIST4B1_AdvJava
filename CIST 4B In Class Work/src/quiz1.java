public class quiz1 {

    public static String reverseString(String s) {
        
        // base case
        // string is empty or only has one character
        // therefore cant be reversed
        if (s.length() <= 1) {
            return s;
        }

        // recursive case
        // this will reverse everything but the first character
        // and then it will add first character to the end of string
        return reverseString(s.substring(1)) + s.charAt(0);

    }

    public static int countOccurences(String s, char c) {

        // base case
        // if the string is empty 
        // then there are no characters to count 
        if (s.length() == 0) {
            return 0;
        }

        // check the first character
        int add = 0;
        if(s.charAt(0) == c) {
            add = 1;
        }

        //recursive case 
        //this is to count the rest of the string 
        // which is everything after the first character
        return add + countOccurences(s.substring(1), c);
    }

}
