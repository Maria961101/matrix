public class Main {
    public static void main(String[] args) {
        float[][] mat1;
        Matrix mat = new Matrix(mat1 = new float[][]{{6,2},{5,5}});
        float[][] mat2 = new float[][]{{2,7,1},{3,9,8}};
        System.out.println("сумма матриц:");
        float[][] sum = mat.sum(mat1, mat2);
        mat.print(sum);
        System.out.println("умножение матрицы на число:");
        float[][] pr = mat.pr(7);
        mat.print(pr);
        System.out.println("произведение двух матриц:");
        float[][] multiplication = mat.multiplication(mat1, mat2);
        mat.print(multiplication);
    }
}
