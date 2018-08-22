
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* all the variables declared inside method are local
		 * variables and scope is within the method.
		 */
		
		int[] a = {10,20,30,40,50};
		
		/*using enhanced for loop
		 * 
		 */
		for(int temp:a)
		{
			System.out.println(temp);
		}
		
		int[] x = new int[5];
		
		 x[1]= 100;
		 x[2] = 200;
		
		for(int temp:x)
		{
			System.out.println(temp);
		}
		
		
		String[] l = new String[5];
		
		l[1] = "name";
		l[2] = "caddy";
		
		for(String s : l){
			System.out.println(s);
		}
		
		
		char[] c = new char[3];
		c[0] = 'p';
		
		for(char e : c){
			System.out.println(e);
		}
		
		String k = "Kaustubh";
		char[] j = k.toCharArray();
		
//		for(char u :j) {
//			System.out.println(u);
//		}
		
		
//		for(int count=0; count<j.length;count++) {
//			System.out.println(j[count]);
//		}
		
		
		for(int count = j.length-1 ;count >= 0;count--) {
			System.out.print(j[count]);
		}
				
				
				
				
		
		
				
		
				
		
			

	}

}
