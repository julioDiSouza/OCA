import java.util.*;

public class Test {
	
	public static void main(String[] args){
		
		java.util.List<String> lst = new java.util.ArrayList<String>();
		lst.add("Neymar");
		lst.add("Griezmann");
		lst.add("Messi");
		
		/*
		String[] arr = new String[3];
		arr[0] = "Julio";
		arr[1] = "Julia";
		arr[2] = "Ajax";
		*/
		
		/*
		for (String n : arr){
			System.out.print(n + " ");
		}
		*/
		
		/*
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		*/
		
		/*
		for (String l : lst){
			System.out.print(l + " ");
		}		
		*/
		
		for (int i = 0; i < lst.size(); i++){
			String name = lst.get(i);
			
			System.out.print(name + " ");
		}
		
		
	}

}

