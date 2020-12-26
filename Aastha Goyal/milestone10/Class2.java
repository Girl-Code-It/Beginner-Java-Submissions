package milestone10;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        class Student 
        {
        	int roll;
        	int phone;
        	
        }
        Student Sam=new Student();
       Student John=new Student();
        
        Sam.roll=46;
        Sam.phone=123456789;
      //  Sam.address=ShastriNagar;
        
        John.roll=55;
        John.phone=224456789;
        //John.address=PreetNagar;
        
        System.out.println("Sam roll no is "+Sam.roll+", phone no is "+Sam.phone);
        System.out.println("John roll no is "+John.roll+", phone no is "+John.phone);
	}

}
