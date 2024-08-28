public class Array2D {
    //sum of 2d array
    public static void sumOf2Darray(int arr [][]){
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                sum +=arr[i][j];
            }
        }
        System.out.println("the sum is: "+sum);
    }

    // transpose
    public static void transpose2Darray(int arr [][]) {
        int[][] tranpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tranpose[j][i] = arr[i][j];
            }
        }
        System.out.println("array after transpose");
        for (int i = 0; i < tranpose.length; i++) {
            for (int j = 0; j < tranpose[i].length; j++) {
                System.out.print(tranpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Checking for Symmetry in a Square Matrix
    public static boolean isSymmetry(int arr[][]) {
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] arr= {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sumOf2Darray(arr);
        transpose2Darray(arr);
        System.out.println(isSymmetry(arr));
    }
}