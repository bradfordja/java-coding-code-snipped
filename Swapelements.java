import java.util.Arrays;

public class Swapelements {

    public static String[] swapElements(String line) {
        String[] numArray = line.substring(0, line.indexOf(":")).split(" ");
        String[] swapArray = line.substring(line.indexOf(":") + 1).split(",");
        for (int i = 0; i < swapArray.length; ++i) {
            String[] swaps = swapArray[i].split("-");
            Integer firstswap = Integer.parseInt(swaps[0].trim());
            Integer secondswap = Integer.parseInt(swaps[1].trim());
            String temp = numArray[firstswap];
            numArray[firstswap] = numArray[secondswap];
            numArray[secondswap] = temp;
        }
        return numArray;
    }

    public static void main(String[] args) throws java.io.IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = in.readLine()) != null) {
            if (line.length() > 0) {
                String[] result = swapElements(line);
                System.out.println(String.join(" ", result));
            }
        }
    }
}
