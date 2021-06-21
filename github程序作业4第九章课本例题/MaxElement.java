import java.awt.SystemColor;
import java.util.Scanner;
public class MaxElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);{
		try {
			System.out.print("Enter the number of rows ans columns of the Array:");
			int row=input.nextInt();
			int column=input.nextInt();
			System.out.println("Enter the Array");
			double num[][]=new double[row][column];
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					num[i][j]=input.nextDouble();
				}
			}
			int[] location=locateLargest(num);
			int index_i=location[0];
			int index_j=location[1];
			System.out.print("The location of the largest element is at ("+index_i+","+index_j+")");
			
		}finally {
			input.close();
		}
			
		}
	}
	public static int[] locateLargest (double[][] a) {  
		int[] max= {0,0};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>a[max[0]][max[1]]) {
					max[0]=i;
					max[1]=j;
				}
			}
		}
		return max; //返回数组
	}
}
//23.5 35 2 10 
//4.5 3 45 3.5
//35 44 5.5 9.6
