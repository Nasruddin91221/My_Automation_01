import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num=5;
		String SocialMedia	="Facebook";
		char Letter='N';
		double  dec=12.555;
		boolean card=true;
		
		
		System.out.println(" is the Number ");
		System.out.println(SocialMedia);
		
		//Array 
		int[] Arr = new int[5];
		
		Arr[0]=1;
		Arr[1]=2;
		Arr[2]=3;
		Arr[3]=4;
		Arr[4]=5;
		
		 Arr[3]=25;
		
		System.out.println(Arr[3]);		
		
		
		int[] array= {9,8,7,6,5,4};
		System.out.println(array[3]);	
		
//		forLoop
		
		
		for (int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
//				
 				System.out.println(array[i]+ " is Multiple with 2 ");
 				break;

		}
			else{
				System.out.println(array[i]+ " is Not Multiple with 2 ");
			};
		}
//		for (int i=0;i<Arr.length;i++) {
//			
//			
//			System.out.println(Arr[i]);
//			
//		}
//		String[] Names= {"Rose","Michel","Amanda","John","Madona"};
//		
//		for(int j=0;i<Names.length;i++) {
//			
//			System.out.println(Names[i]);
//		};
//		
//		for(String s:Names) {
//			
//			
//			System.out.println(s);
//
//			
//		}
//
//}  
		
		// ArrayList 
		List<String> a = new ArrayList<String>();
		a.add("Madhu");
		a.add("Siddu");
		a.add("Jaadu");
		a.add("Muddu");
		a.add("Guddu");
		a.add("Mani");
		a.add("Kani");
		a.add("Jani"); 
		System.out.println(a.get(6));
		
		for(String val:a) {
		System.out.println(val);
		}
		// By the using Of Contains Word we will be Find & As a Result print in Bollean
		System.out.println(a.contains("Kani"));
		
		
		//Items Present in the ArrayList
		String[] Names= {"Rose","Michel","Amanda","John","Madona"};
		List<String>NamesArrayList=Arrays.asList(Names);
		 System.out.println(NamesArrayList.contains("Rose"));
		
		 
	}
}
