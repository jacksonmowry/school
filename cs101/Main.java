
public class Main {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        i = j++;
        System.out.println("i is set to j before incrementing");
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        i = ++j;
        System.out.println("i is set to j after incrementing");
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }
}