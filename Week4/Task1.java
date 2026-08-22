package Week4;

public class Task1{
    static boolean isvowel(char c){
        return c =='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public static void main(String[] args) {
       scanner sc = new scanner(System.in);
       String s = sc.nextLine();
       int mid = s.length()/2;
       int countA = 0;
       int countB = 0;
       for(int i=0;i<mid;i++){
           if(isvowel(s.charAt(i))){
               countA++;
           }
       }
       for(int i=mid;i<s.length();i++){
           if(isvowel(s.charAt(i))){
               countB++;
           }
       }
       System.out.println("Number of vowels in the first half: " + countA);
       System.out.println("Number of vowels in the second half: " + countB);
    }
}