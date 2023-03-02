public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Not enough arguments");
            System.exit(-1);
        }
        int n = Integer.parseInt(args[0]);
        int matrix[][]=new int[n][n];
        System.out.println(n);
    }
}