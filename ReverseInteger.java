public class ReverseInteger {
    
    public static void main(String[] args) {
        System.out.println(reverseInteger(15));     // 51
        System.out.println(reverseInteger(36));     // 63
        System.out.println(reverseInteger(5));      // 5
        System.out.println(reverseInteger(65432));  // 23456
    }

    public static int reverseInteger(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
