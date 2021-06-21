package jihekuangjia;

import java.util.HashMap;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Student> studentMap=new HashMap<>();
		while (true) {
			System.out.println("请输入学生信息:学号 姓名 年龄");
			String inputData = input.nextLine();
			if ("exit".equals(inputData)) {
				break;
			}
			String[] info = inputData.split(" ");
			Student student=new Student();
			student.setId(Integer.parseInt(info[0]));
			student.setName(info[1]);
			student.setAge(Integer.parseInt(info[2]));
			studentMap.put(student.getId(),student);
			  System.out.println("请输入学生学号、姓名和年龄,按照顺序中间以空格隔开");
			  inputData=input.nextLine();  
			}
		  for(Integer i=1;i<=studentMap.size();i++) {
			  System.out.println(studentMap.get(i.toString()));
			  }
		  }
}