class ReverseStr {
    public void reverseString(char[] s) {
        int len = s.length;
        if(len <= 1) {
            return;
        }
        for(int i = 0; i < (len + 1)/2; i++) {
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
        }
    }
}