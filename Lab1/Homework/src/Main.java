public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        if (args.length < 1) {
            System.out.println("Not enough arguments");
            System.exit(-1);
        }
        int n = Integer.parseInt(args[0]);
        String[] lines = new String[n];
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            lines[i] = "";
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            matrix[0][i] = i + 1;
            lines[0] += Integer.toString(matrix[0][i]);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (matrix[i - 1][j] % n) + 1;
                lines[i] += Integer.toString(matrix[i][j]);
            }
        }
        long end = System.nanoTime();
        long execution = end - start;
        if(n>1000)
        System.out.println("Execution time: " + execution + " nanoseconds");
        else
            for (String str : lines
            ) {
                System.out.println(str);
            }
    }
}