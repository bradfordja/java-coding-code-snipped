import java.io.*;

public class LongestWord {

    public String findLongestWordInLine(String line) {
        String[] lineArray = line.split(" ");
        Integer largestIndex = 0;

        if (lineArray.length > 0) {
            for (int i = 0; i < lineArray.length; ++i) {
                if (lineArray[largestIndex].length() < lineArray[i].length())
                    largestIndex = i;
            }
            return lineArray[largestIndex];
        }

        return "";  // empty line or no words
    }

    public void processFile(BufferedReader in) throws IOException {
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(findLongestWordInLine(line));
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        new LongestWord().processFile(in);
    }
}

