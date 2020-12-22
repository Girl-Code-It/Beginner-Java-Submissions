package milestone10;

public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        class 	Employee
        {
        	String name;
        	int yearofjoining;
        	int address;
        }
	
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        
        e1.name="RobertWallStreat";
        e1.yearofjoining=1994;
        e1.address=64;
        e2.name="RobertWallStreat";
        e2.yearofjoining=1994;
        e2.address=68;
        e3.name="JohnWallStreat";
        e3.yearofjoining=1994;
        e3.address=26;
        System.out.println("joining year of "+e1.name+" is "+e1.yearofjoining+" having address "+e1.address) ;
        System.out.println("joining year of "+e2.name+" is "+e2.yearofjoining+" having address "+e2.address) ;
        System.out.println("joining year of "+e3.name+" is "+e3.yearofjoining+" having address "+e3.address) ;
        
	}

}
