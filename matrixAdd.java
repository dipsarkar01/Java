import java.util.Scanner;
public class matrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, m, n;
        
        System.out.print("Enter number of Rows: ");
        m = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        n = sc.nextInt();
        
        int[][] ar1 = new int[m][n];
        int[][] ar2 = new int[m][n];
        int[][] sum = new int[m][n];
        
        // Input for 1st matrix
        System.out.println("\nEnter numbers in 1st array:");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                ar1[i][j] = sc.nextInt();
            }
        }
        
        // Input for 2nd matrix
        System.out.println("\nEnter numbers in 2nd array:");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                ar2[i][j] = sc.nextInt();
            }
        }
        
        // Printing 1st matrix
        System.out.println("\n1st array is:");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print(ar1[i][j] + "\t"); // Changed println to print
            }
            System.out.println("");
        }
        
        // Printing 2nd matrix
        System.out.println("\n2nd array is:");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print(ar2[i][j] + "\t"); // Changed println to print
            }
            System.out.println("");
        }
        
        // Calculating sum
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                sum[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        
        // Printing the Sum matrix
        System.out.println("\nSum of 2 array is:");
        for(i = 0; i < m; i++){ // Fixed infinite loop here (changed j++ to i++)
            for(j = 0; j < n; j++){
                System.out.print(sum[i][j] + "\t"); // Changed println to print
            }
            System.out.println("");
        }
        
        sc.close();
    }
}