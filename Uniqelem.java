import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Uniqelem {

    public static boolean found(String item, String[] list) {
        for (int i = 0; i < list.length; ++i) {
            if (list[i] != null && list[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getUniqueElements(String line) {
        String[] lineArray = line.split(",");
        String[] uniqueArray = new String[lineArray.length];
        int count = 0;

        for (int i = 0; i < lineArray.length; ++i) {
            if (!found(lineArray[i], uniqueArray)) {
                uniqueArray[count] = lineArray[i];
                ++count;
            }
        }

        List<String> result = new ArrayList<>();
        for (String s : uniqueArray) {
            if (s != null) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        Uniqelem uniqelem = new Uniqelem();

        while ((line = in.readLine()) != null) {
            List<String> uniqueElements = uniqelem.getUniqueElements(line);
            System.out.println(String.join(",", uniqueElements));
        }
    }
}
