public class permutation {
   
        public static void Permutation(String str, String perm)
        {
     
            if (str.isEmpty()) {
                System.out.print(perm);
                return;
            }
     
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String rem = str.substring(0, i) +
                            str.substring(i + 1);
                            Permutation(rem, perm + ch);
            }
        }
     
        public static void main(String[] args)
        {
            String s = "abc";
           
            Permutation(s, " ");
        }
    }
    

