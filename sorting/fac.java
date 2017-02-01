package other;

public class fac {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
    
    public static int fac(int n) {
        if (n > 1) return n*fac(n - 1);
        return 1;
    }
}
