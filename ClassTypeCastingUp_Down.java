package basicprograms;


class ParentType{
	
}


public class ClassTypeCastingUp_Down extends ParentType
{
	public static void main(String[] args) {
		
		ParentType p1 =new ClassTypeCastingUp_Down(); //upcasting implicit
		//parent class properties
		
		ParentType p2 =(ParentType)new ClassTypeCastingUp_Down(); //upcasting explicit
		//parent class properties
		
		ClassTypeCastingUp_Down c1=(ClassTypeCastingUp_Down)p1; //downcasting
		//both parent and child class properties
	}

}
