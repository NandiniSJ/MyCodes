import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfSentences = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numOfSentences; i++) {
            String sentence = bufferedReader.readLine();
            LinkedHashSet<String> strings = new LinkedHashSet<>();
            String[] words = sentence.split(" ");
            for (int j = 0; j < words.length; j++) {
                strings.add(words[j].toLowerCase());
            }

            StringBuilder stringWithoutDuplicate = new StringBuilder();
            for (int j = 0; j < words.length; j++) {
                if(strings.contains(words[j].toLowerCase())){
                    stringWithoutDuplicate.append(words[j]).append(" ");
                    strings.remove(words[j].toLowerCase());
                }
            }
            if(i == numOfSentences-1){
                System.out.print(stringWithoutDuplicate.toString().trim());
            } else {
                System.out.println(stringWithoutDuplicate.toString().trim());
            }
        }
    }
}
