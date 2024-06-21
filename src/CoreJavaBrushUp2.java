
public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is an Object // String Literal
		
		
		String name1= "Hii Nasruddin Welcome  ";
		String name2= "Hii Nasriddin Welcome ";
		
		System.out.println(name1);
		
		
		String name3=new String("Medona");
		String name4=new String("Medona");
		 
		String s = "Hii Nasruddin Welcome ";
		String[] SplittedString = s.split("Nasruddin");
		System.out.println(SplittedString);
		
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[1].trim());

		
		for (int i=s.length()-1;i>=  0;i--){ 
			System.out.println(s.charAt(i));
			
		}
		
		
		
	}

}
 