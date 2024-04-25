import java.util.Scanner;
public class stringcompare {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int x= Math.min(A.length(), B.length());
        System.out.println(A.length()+B.length());
        int temp=0;
        for(int i=0;i<x;i++){
            int ASCII1=A.charAt(i);
            int ASCII2=B.charAt(i);
            if(ASCII1>ASCII2){
                temp=1;
                break;
            }
            else if(ASCII1<ASCII2){
                break;
            }
        }
        if(temp==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1)+ " "+Character.toUpperCase(B.charAt(0))+B.substring(1));
    }
}
