public class swapAdd {
    public static int add(int x){
        int result=0;
        result+=x%10;
        result+=x/10;
        return result;
    }
    public static void reverse(int num){
        int reverse=0;
        int temp=1;
        while (num>0) {
            reverse=num%10+reverse*temp;
            System.out.println(reverse);
            num/=10;
            temp*=10;
            System.out.println(num);

        }
    }
    public static void main(String[] args) {
        int num = 978;
    //     while (num>9) {
    //     int reverse=reverse(num);
    //     num =add(reverse);

    // }
    reverse(num);
    }
    
}