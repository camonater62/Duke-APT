package APT5;

import java.util.ArrayList;
import java.util.Collections;

public class Closet {
    
    public String anywhere(String[] list) {
        ArrayList<String> words = new ArrayList<String>();
        for(String sentence : list) {
            for(String word : sentence.split(" ")) {
                if(!words.contains(word)) {
                    words.add(word);
                }
            }
        }
        Collections.sort(words);
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String[] list = { "blue blue water", "blue skies are blue", "blue is blue" };

        System.out.println(new Closet().anywhere(list));
    }
}
