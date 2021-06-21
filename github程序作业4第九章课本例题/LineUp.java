import java.util.Scanner;
import java.util.*;
public class LineUp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int[][] m= {{1,2},{3,4},{5,6},{7,8},{9,10}};
			shuffle(m);
		}finally {
			input.close();
		}
	}
	public static void shuffle(int [][]m) {
		ArrayList<Integer> list = null;
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
        
		for(int i=0;i<m.length;i++) { 		//鏋勯�犱互灏忓垪琛ㄤ负鍏冪礌鐨勫ぇ鍒楄〃
			list=new ArrayList<Integer>();
			for(int j=0;j<m[i].length;j++) {
				list.add(m[i][j]);
			}
			list2.add(list);
		}
		
		Collections.shuffle(list2);	   //浣跨敤Collection绫婚殢鏈烘墦涔卞ぇ鍒楄〃
		
		Iterator it = list2.iterator();  //杩唬鍣ㄨ緭鍑哄ぇ鍒楄〃鍏冪礌
        while (it.hasNext()) {
            System.out.println(it.next());
        }
	}
}
