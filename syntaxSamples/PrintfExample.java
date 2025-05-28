public class PrintfExample {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double salary = 60000.75;

        // Basic usage: printing formatted string
        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);

        // Using different format specifiers
        System.out.printf("Integer: %d, Hex: %x, Octal: %o%n", 255, 255, 255);
        System.out.printf("Floating point: %f, Exponential: %e%n", 123.456, 123.456);
        System.out.printf("Character: %c, String: %s%n", 'A', "Hello");

        // Formatting flags
        System.out.printf("Left-justified: %-10s, Right-justified: %10s%n", "left", "right");
        System.out.printf("Zero-padded integer: %05d%n", 123);
        System.out.printf("Positive number with sign: %+d%n", 123);
        System.out.printf("Number with commas: %,d%n", 1234567);

        // Using argument index
        System.out.printf("Second arg: %2$s, First arg: %1$s%n", "first", "second");

        // Printing percentage and newline
        System.out.printf("Percentage: %d%%, Newline: %n", 100);
        // format a double variable to display with two decimal places using printf
        double number = 123.45678;
        System.out.printf("%.2f", number);
    }
}