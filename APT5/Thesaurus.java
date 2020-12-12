package APT5;

import java.util.*;

public class Thesaurus {

    private static class Entry {
        ArrayList<String> words;
        public Entry(String entry) {
            this.words = new ArrayList<String>(Arrays.asList(entry.split(" ")));
        }
        public int inCommon(Entry other) {
            int count = 0;
            for(int i = 0; i < words.size(); i++) 
                for(int j = 0; j < other.words.size(); j++) 
                    if(words.get(i).equals(other.words.get(j))) 
                        count++;

            return count;
        }        
        public void absorb(Entry other) {
            for(String s : other.words) 
                if(!words.contains(s))
                    words.add(s);
        }
        public String toString() {
            Collections.sort(words);
            return String.join(" ", words);
        }
    }

    public String[] edit(String[] entry) {
        ArrayList<Entry> entries = new ArrayList<Entry>();
        for(String s : entry) 
            entries.add(new Entry(s));
        
        for(int i = 0; i < entries.size() - 1; i++) {
            for(int j = entries.size() - 1; j > i; j--) {
                if(entries.get(i).inCommon(entries.get(j)) >= 2) {
                    entries.get(i).absorb(entries.get(j));
                    entries.remove(j);
                    i = j = -1;
                }     
            }                   
        }
        
        String[] res = new String[entries.size()];
        for(int i = 0; i < res.length; i++) 
            res[i] = entries.get(i).toString();
        
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        String[] entry = {"point run score","point dot","cut run tear score","cut valley","cute pretty"};
        System.out.println(Arrays.toString(new Thesaurus().edit(entry)));
    }
}
