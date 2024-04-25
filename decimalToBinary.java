public class decimalToBinary {
    public static void main(String[] args) {    
        for(long i=0;i<Math.pow(2,20);i++){
            System.out.println(i+"-->"+ Long.toBinaryString(i));
        }
    }
}
