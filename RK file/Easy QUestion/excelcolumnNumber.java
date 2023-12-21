public class excelcolumnNumber {
    public static void main(String[] args) {
        
    }
    
}

class Solution {
    public long titleToNumber(String s) {
    long result=0;
    for(int i=0; i<s.length(); i++){
       result*=26;
       result+=(s.charAt(i)-'A'+1);
      }
      return result;
    }
}