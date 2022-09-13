class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(charCount.containsKey(temp)) {
                charCount.put(temp, charCount.get(temp) + 1);
            } else {
                charCount.put(temp, 1);
            }
        }
        boolean singleCounted = false;
        int palLength = 0;
        for (Map.Entry<Character, Integer> set : charCount.entrySet()){
            int val = set.getValue();
          if( val % 2 != 0 && !singleCounted) {
              singleCounted = true;
              palLength += 1;
          }
          palLength += (val/2) * 2;
        }
        
        return palLength;
    }
}