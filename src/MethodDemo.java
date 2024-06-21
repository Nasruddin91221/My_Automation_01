 
public class MethodDemo {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
				
		// mention the new method name with object 
		MethodDemo d =new MethodDemo();
		String name= mydata();
		System.out.println(name);
		// From the another page add object with the new    method name 
		MethodDemo2 d2=new MethodDemo2();
		d2.myData();
		// by apply of Static method we can direct call and run 
		mydata2();
		
		
		 }
	
		public static String mydata() {
		
		System.out.println("Hello World");
		return "This Is Nasruddin";
		}
		public static String mydata2() {
			
			System.out.println("Hello World");
			return "This Is Nasruddin";
				
			
			
 
	}
		}
	


