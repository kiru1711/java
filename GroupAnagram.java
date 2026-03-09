import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.nextInt();
        }
        HashMap<String, List<String>> map = new HashMap<>(); // key word , anagrams
        for(String word : words){
            char[] c = word.toCharArray(); 
            Arrays.sort(c); // every anagram word same sorted order
            String key = new String(c); // shift to string 
            map.putIfAbsent(key , new ArrayList<>());
            map.get(key).add(word); //same position , but the actual word
        }
        for(List<String> group : map.values()){
            System.out.println(group);  
        }
    }
}
