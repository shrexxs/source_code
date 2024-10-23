//TO FIND UNIQUE
import java.util.*;  

class UniqueFindMatrix {  
    static void unique(int mat[][], int n, int m) {  
        int maximum = 0;  
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < m; j++) {  
                if (maximum < mat[i][j])   
                    maximum = mat[i][j];  
                  
            }  
        }  

        int b[] = new int[maximum + 1];  

        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < m; j++) {  
                b[mat[i][j]]++;  
            }  
        }  

        boolean flag = false;  
        System.out.print("Unique elements in the matrix: ");  
        for (int i = 1; i <= maximum; i++) {  
            if (b[i] == 1) {  
                System.out.print(i + " ");  
                flag = true;  
            }  
        }  

        if (!flag) {  
            System.out.println("No unique element in the matrix");  
        }  
    }  

    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter the number of rows: ");  
        int r = sc.nextInt();  
        System.out.print("Enter the number of columns: ");  
        int c = sc.nextInt();  

        int[][] mat = new int[r][c];  
        System.out.println("Enter the elements of the matrix:");  
        for (int i = 0; i < r; i++) {  
            for (int j = 0; j < c; j++) {  
                mat[i][j] = sc.nextInt();  
            }  
        }  

        unique(mat, r, c);  
        sc.close();  
    }  
}




