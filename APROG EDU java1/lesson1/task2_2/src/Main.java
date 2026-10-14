public class Main {
    public static void main(String[] args) {
        int i = 729135;
        int j;
        j = 0;
        while (i != 0) {
            j++;
            i = i / 10;
        }
        System.out.println("msg = " + j);
    }
}