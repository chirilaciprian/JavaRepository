import java.util.Arrays;

public class Main {
    public static int SumCif(int n) {
        int res = 0;
        while (n != 0) {
            res = res + n % 10;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        System.out.println(Arrays.toString(languages));
        int n = (int) (Math.random() * 1_000_000);
        n = n * 3;
        n += 0b10101;
        n += 0xFF;
        n = n * 6;
        System.out.println(n);
        int result = SumCif(n);
        while (result >= 10) {
            n = result;
            result = SumCif(n);
        }
        System.out.println(result);
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
}