import java.util.Scanner;
public class IsInALine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);{
		try {
			System.out.print("Enter five points:");
			double[][] points=new double[5][2];
			while(input.hasNext()) {        //多组输入
				for(int i=0;i<5;i++) {
					for(int j=0;j<2;j++) {
						points[i][j]=input.nextDouble();
					}
				}
				if(sameline(points)) {
					System.out.println("The five points are on the same line");
				}
				else {
					System.out.println("The five points are not on the same line");
				}
				System.out.print("Enter five points:");
			}
		}finally {
			input.close();
		}
		}
	}
	public static boolean sameline(double[][] points) {
		double x0=points[0][0],y0=points[0][1];
		double x1=points[1][0],y1=points[1][1];
		for(int i=2;i<5;i++) {
			double x2=points[i][0],y2=points[i][1];
			if( (x1-x0)*(y2-y0) - (x2-x0)*(y1-y0) != 0 ) {
				return false;
			}
		}
		return true;
	}
}
//3.4 2 6.5 9.5 2.3 2.3 5.5 5 -5 4
//1 1 2 2 3 3 4 4 5 5
