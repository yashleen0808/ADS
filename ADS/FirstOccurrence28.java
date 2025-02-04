public class FirstOccurrence28 {
   
        public int strStr(String haystack, String needle) {
            int HL=haystack.length();
            int NL=needle.length();
            if(HL<NL)
                return -1;
            for(int i=0;i<=HL-NL;i++){
                int j=0;
                while(j<NL && haystack.charAt(i+j)==needle.charAt(j))
                    j++;
                if(j==NL){
                    return i;
                }
            }
            return -1;
        }
    }
