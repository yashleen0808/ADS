import java.util.HashMap;

public class ValidAnagram242 {
    class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> count= new HashMap<>();
        for(char c:s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);

        }
        for(char c:t.toCharArray()){
            if(!count.containsKey(c)|| count.get(c)==0){
                return false;
            }
            count.put(c,count.get(c)-1);
        }
        return true;
    }
}
    
}
