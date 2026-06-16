class Solution {
    public boolean isPalindrome(String s) {
       s =  s.toLowerCase().replaceAll("[^0-9a-z]", "");
        StringBuilder reversed = new StringBuilder(s);
        reversed.reverse();
       return reversed.toString().equals(s);
    }
}
