public class q1 {
    
        public static void main(String[] args) {
            String str = "Neeraj123@";
            int n= str.length();
    
            int uppercount = 0, numbercount = 0, specialcount = 0;
    
            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);
    
                if (Character.isUpperCase(c)) {
                    uppercount++;
                } else if (Character.isDigit(c)) {
                    numbercount++;
                } else if (!Character.isLetterOrDigit(c)) {
                    specialcount++;
                }
            }
    
            System.out.println("Uppercase count: " + uppercount);
            System.out.println("Number count: " + numbercount);
            System.out.println("Special count: " + specialcount);
        }
    }
    