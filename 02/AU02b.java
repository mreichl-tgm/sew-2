import javax.swing.JOptionPane;
public class AU02b {
    public static void main(String[] args) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9 A B C D E F");
        System.out.print("0");
        for (int i = 1; i <= 16; i++) {
            for (int j = 0; j < 16; j++) {
                int dez = i * 16 + j;
                char c = (char) dez;
                System.out.print(" " + c);
            }
            System.out.println();
            System.out.print(hex(i));
        }
    }
    public static String hex(int dez) {
        switch (dez) {
            case 10: return "A";
            case 11: return "B";
            case 12: return "C";
            case 13: return "D";
            case 14: return "E";
            case 15: return "F";
            case 16: return "";
            default: return dez + "";
        }
    }
}