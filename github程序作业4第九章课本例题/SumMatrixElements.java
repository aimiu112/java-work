package 第4次作业;
import java.util.Scanner;
public class SumMatrixElements{
	public static double sumMajorDiagonal(double[][] m){
		double sum=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					sum+=m[i][j];
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		try {
			double[][] elem=new double[4][4];
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					elem[i][j]=input.nextDouble();
				}
			}
			System.out.format("Sum of the element in the major diagonal is ");
			System.out.println(sumMajorDiagonal(elem));
		}finally {
			input.close();
		}
	}
}
