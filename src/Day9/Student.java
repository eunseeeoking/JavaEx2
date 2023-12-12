package Day9;

public class Student {

	int age;
	String stuName;
	int stuNo;
	String stuDept;
	Student(){}
	Student(int stuNo, String stuName){
		this(stuNo,stuName,"");//	this ( ) = 생성자에서 다른 생성자 호출
		
		
	}

	Student(int stuNo, String stuName,String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
	
}