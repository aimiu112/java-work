package 第4次作业;
import java.util.Scanner;
public class SumColumnElements {
	public static double sumMajorDiagonal(double[][] m,int columnIndex){
		double sum=0;
		for(int i=0;i<3;i++) {
			sum+=m[i][columnIndex];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		try {
			double[][] elem=new double[3][4];
			for(int i=0;i<3;i++) {
				for(int j=0;j<4;j++) {
					elem[i][j]=input.nextDouble();
				}
			}
			for(int i=0;i<4;i++) {
				System.out.format("Sum of the element  at column %d is ",i);
				System.out.println(sumMajorDiagonal(elem,i));
			}
		}finally {
			input.close();
		}
	}
}
