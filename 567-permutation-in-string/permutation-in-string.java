class Solution {
   public boolean checkInclusion(String s1, String s2) {
       int n = s1.length();
       int m = s2.length();
       if (n > m) return false;


       char[] s1Arr = s1.toCharArray();
       Arrays.sort(s1Arr);


       for (int i = 0; i <= m - n; i++)
       {
           char[] temp = s2.substring(i, i + n).toCharArray();
           Arrays.sort(temp);
           if (Arrays.equals(temp, s1Arr))
           return true;
       }
       return false;
   }
}
