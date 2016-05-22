import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class KeywordParser {
    public static void main(String ... args) throws FileNotFoundException {
        Scanner s = new Scanner(new File(args[0]));
        ArrayList<String> keywords = new ArrayList();
        ArrayList<String> keywordCode = new ArrayList();
        int count = -1;

        while (s.hasNextLine()) {
            Scanner s2 = new Scanner(s.nextLine()).useDelimiter(" ");
            while(s2.hasNext()) {
                keywords.add(s2.next());
            }
        }

        for (String u: keywords) {
            String keywordCodeConstruct = "tok_" + u + " = " + Integer.toString(count) + ",";
            if (!keywordCodeConstruct.contains("tok_ =")){
                keywordCode.add(keywordCodeConstruct);
                count--;
            }
        }

        for (String t: keywordCode) {
            System.out.println(t);
        }
    }
}
