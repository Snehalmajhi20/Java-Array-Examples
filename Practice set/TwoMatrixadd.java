public class TwoMatrixadd {
    public static void main(String[] args) {
        int [][] num1 = {{1,2,3},{4,5,6}};
        int [][] num2 = {{7,8,9},{5,3,9}};
        int [][] result = {{0,0,0},{0,0,0}};
        for (int i=0; i<num1.length;i++){
            for (int j=0; j<num1[i].length; j++){
                System.out.format("setting value for i=%d and j =%d",i,j);
                result[i][j] = num1[i][j] + num2[i][j];
            }
            System.out.println("");
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
