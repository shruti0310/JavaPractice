
public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		
		int[][] twodim = new int [4][3];
		int temp = 10;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				twodim[i][j]=temp;
				temp+=10;
				
				
			}
			
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(twodim[i][j]);
			}
		}
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print("twodim["+i+","+j+"]"+"= "+twodim[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
