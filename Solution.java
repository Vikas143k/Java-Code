import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int min=0;
        int max=0;
        int temp=0;
        int temp1=0;
        int mini=0;
        int maxi=0;
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(i==0){
                min=s.charAt(i);
                max=s.charAt(i);
                mini=i;
                maxi=i;
            }
            if(s.length()-k>0){
                temp=s.charAt(i);
                if(min>temp){
                    min=temp;
                    mini=i;
                }
                if(max<temp){
                   max=temp;
                   maxi=i; 
                }
                if(i<=s.length()-k){
                    if (min==temp) {
                        temp=s.charAt(i+1);
                        temp1=s.charAt(mini+1);
                        if(temp1>temp){
                        min=s.charAt(i);
                        mini=i;
                        }}
                    while (max==temp&&) {
                        i+=1;
                        temp=s.charAt(i+1);
                        temp1=s.charAt(mini+1);



                        // temp=s.charAt(i+1);
                        // temp1=s.charAt(maxi+1);
                        // if(temp1<temp){
                        //     max=s.charAt(i);
                        //     maxi=i; 
                        // //     System.out.println(maxi);
                        // //     System.out.println("hello");
                        // }
                        
                    }
                }
            }
        }
        smallest+=s.substring(mini, mini+k);
        largest+=s.substring(maxi, maxi+k);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}