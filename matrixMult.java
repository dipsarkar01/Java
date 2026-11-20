import java.util.Scanner;
public class matrixMult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar1[][],ar2[][],mul[][],i,j,k;
        ar1=new int[3][2];
        ar2=new int[2][4];
        mul=new int[3][4];
        System.out.println("Enter numbers in 1st array: ");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                ar1[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Enter numbers in 2nd array: ");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                ar2[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("1st array is: ");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.print(ar1[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("\n2nd array is: ");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(ar2[i][j]+"\t");
            }
            System.out.println("");
        }
        //initialization of mul-matrix with 0
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                mul[i][j]=0;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<2;k++){
                    mul[i][j]+=ar1[i][k]*ar2[k][j];
                }
            }
        }
        System.out.println("\nMul of 2 arrays is:");
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.print(mul[i][j]+"\t");
            }
            System.out.println("");
        }
        sc.close();
    }
}