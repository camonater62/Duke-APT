package APT5;

import java.util.*;

public class SetAside {

    private List<String> commonElements(List<String> a, List<String> b) {
        List<String> res = new ArrayList<String>();
        for(String s : a) {
            if(b.contains(s) && !res.contains(s))
                res.add(s);
        }
        return res;
    }

    public String common(String[] list) {
        List<String> words = Arrays.asList(list[0].split(" "));
        for(String s : list) {
            words = commonElements(words, Arrays.asList(s.split(" ")));
        }
        Collections.sort(words);
        return String.join(" ", words);
    }
    
    public static void main(String[] args) {
        String[] list = {"a b c d", "b c d", "b c d e", "b c f"};

        System.out.println(new SetAside().common(list));
    }
}