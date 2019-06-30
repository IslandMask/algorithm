import  java.util.*;
/*
*
* 有效的字母异位词
*
* */
public class LeetCode_242_36 {
    /*
    * 解法1
    * */
  public boolean isAnagram(String a,String b){
      if (a.length() != b.length())
          return false;
      char[] stra = a.toCharArray();
      char[] strb = b.toCharArray();
      Arrays.sort(stra);
      Arrays.sort(strb);
      return  Arrays.equals(stra,strb);
  }

    /*
     * 解法2
     * */
    public boolean isaAnagram(String a,String b){
        if (a.length() != b.length())
            return false;
        int[] arr = new int[26];
        for (int i = 0;i< 26;i++){
            arr[a.charAt(i) - 'a'] ++;
            arr[b.charAt(i) - 'a'] --;
        }
        for (int i = 0;i<26;i++){
            if (arr[i] !=0){
                return false;
            }
        }
        return true;
    }
}
