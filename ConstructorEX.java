package mc;

public class ConstructorEX {
	int rollNum;
	String name;
	char grade;
	ConstructorEX(){//default
		System.out.println("Default values :" +name+rollNum+grade);
	}
	
	                                                                                                      
	//parameterized 
	ConstructorEX(int roll, String nam, char gde){
		this.rollNum = roll;
		this.name = nam;
		this.grade = gde;
	}
	void dispInfo() { 
		System.out.println("RollNum: "+rollNum);
		System.out.println("Student Name: "+name);
		System.out.println("Student Grade: "+grade);
	}
	
	//Copy
	ConstructorEX(ConstructorEX copy){
		this.rollNum = copy.rollNum;
		this.name = copy.name;
		this.grade = copy.grade;
	}
	                                                                                                  
	public static void main(String[] args) {
		ConstructorEX df = new ConstructorEX();
		
		//parameterized 
		ConstructorEX para = new ConstructorEX(23232,"Arin",'D');
		para.dispInfo();
		
		//copy
		ConstructorEX copy = new ConstructorEX(para);
		copy.dispInfo();
	}
	
	

}
