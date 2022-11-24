public class Main {
    static int power(int a, int b){
        if (b==0)
            return 1;
        if (a==0)
            return 0;
        if (a==1)
            return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        System.out.println("üs alma: "+power(3,4));
    }
}
