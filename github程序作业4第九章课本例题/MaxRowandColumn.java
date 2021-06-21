import java.util.Scanner;
public class MaxRowandColumn{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);{
		try {
			int[][] a= new int[4][4];
			String s=new String();
			
			int ansi=-1,totali=0;
			for(int i=0;i<4;i++) {
				s=input.nextLine();			//String閻ㄥ嫯绶崗锟�
				int tempi=0;
				for(int j=0;j<4;j++) {
					char c = s.charAt(j);   //String娑擃叀骞忛崣鏈縣ar閻ㄥ嫭鏌熷▔锟�
					if(c=='1') {
						a[i][j]=1;
					}
					else {
						a[i][j]=0;
					}
					if(a[i][j]==1) {
						tempi++;
					}
				}
				if(tempi>totali) {
					ansi=i;
					totali=tempi;
				}
			}
			
			int ansj=-1,totalj=0;
			for(int i=0;i<4;i++) {
				int tempj=0;
				for(int j=0;j<4;j++) {
					if(a[j][i]==1) {
						tempj++;
					}
				}
				if(tempj>totalj) {
					ansj=i;
					totalj=tempj;
				}
			}
			System.out.println("The largest row index閿涳拷"+ansi);
			System.out.println("The largest column index:"+ansj);
		}finally {
			input.close();
		}
		}
	}
}
