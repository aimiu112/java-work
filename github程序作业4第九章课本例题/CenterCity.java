import java.util.Scanner;
public class CenterCity{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);{
		try {
			System.out.print("Enter the number of cities:");
			int pair=input.nextInt();
			double [][] points=new double[pair][pair];
			System.out.println("Enter the coordinates of cities:");
			for(int i=0;i<points.length;i++) {
				points[i][0]=input.nextDouble();
				points[i][1]=input.nextDouble();
			}
			double shortestDistance=distance(points[0][0],points[0][1],points);
			int center=0;
			
			for(int i=1;i<points.length;i++) {
				double distance=distance(points[i][0],points[i][1],points);
				if(shortestDistance>distance) {
					center=i;
					shortestDistance=distance;
				}
			}
			System.out.println("The central city is at "+"("+points[center][0]+","+points[center][1]+")");
			System.out.format("The total distance to all other city is %.2f\n" ,shortestDistance);
		}finally {
			input.close();
		}
		}
	}
	public static double distance(double x1,double y1,double[][] points) {
		double distance=0;
		for(int i=0;i<points.length;i++) {
				distance+= Math.sqrt((points[i][0]-x1)*(points[i][0]-x1)+(points[i][1]-y1)*(points[i][1]-y1));
		}
		return distance;
	}
}
//2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
