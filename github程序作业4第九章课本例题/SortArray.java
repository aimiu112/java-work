package 第4次作业;
import java.util.Scanner;
public class SortArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);{
		try {
			System.out.print("Enter the number of pair:");
			int pair=input.nextInt();
			System.out.println("sort before:");
			int[][] num=new int[pair][pair];
			for(int i=0;i<pair;i++) {
				num[i][0]=input.nextInt();
				num[i][1]=input.nextInt();
			}
			sort(num);
		}finally {
			input.close();
		}
		}
	}
	public static void sort(int m[][]) {     //java鍐掓场鎺掑簭
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length-i-1;j++) {
				if(m[j][0]>m[j+1][0]) {
					int tempx=m[j][0],tempy=m[j][1];
					m[j][0]=m[j+1][0];
					m[j][1]=m[j+1][1];
					m[j+1][0]=tempx;
					m[j+1][1]=tempy;
				}
				else if(m[j][0]==m[j+1][0] &&  m[j][1]>m[j+1][1]){
					int tempy=m[j][1];
					m[j][1]=m[j+1][1];
					m[j+1][1]=tempy;
				}
			}
		}
		System.out.println("sort after:");
		for(int i=0;i<m.length;i++) {
			System.out.println("("+m[i][0]+","+m[i][1]+")");
		}
	}
}
//4 2 
//1 7
//4 5
//1 2
//1 1
//4 1
