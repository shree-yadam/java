class ReverseWordsInStr {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int len = s.length();
        if(len <= 1) {
            return s;
        }
        
        int prevSpc = -1;
        for(int i = 0; i < len; i++) {
            if(i == len - 1 || s.charAt(i) == ' '){
                int stopPos = (i == len - 1)? i: i - 1;
                while(stopPos > prevSpc) {
                    result.append(s.charAt(stopPos));
                    stopPos--;
                }
                if(i != len - 1) {
                    result.append(' ');
                }
                prevSpc = i;
            }
        }
        return result.toString();
    }
}