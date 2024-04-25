public class exp {
    //34543 or 3456543
    public static void main(String[] args) {

        int x=12345;
        int temp=0;
        int result=0;
        // int x=34543;
        if (temp<5) {
            if (temp==0 || temp==4) {
                result+=x%10;                
                x=x/10;
            }
            else if (temp==1 || temp==3) {
                result+=(x%10)*(x%10);
                x=x/10;
            }
            x=x/10;
            temp+=1;
        }
        System.out.println(result);
        // String a=Integer.toString(x);
        // int b= a.charAt(4);
        // System.out.println(b);
        // System.out.println(b);



    }
}
