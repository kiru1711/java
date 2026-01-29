class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,max=0;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right); //character
            if(mp.containsKey(c)){ //already existing
                if(mp.get(c)>=left){ //get the frequency
                    left=mp.get(c)+1; //shift the left to the last occurred repeating letter : shrinking
                }
            }max=Math.max(max,right-left+1); //find the window size
            mp.put(c,right); //increase the frequency of the repeated character to avoid further loops
        }return max;
    }
}
