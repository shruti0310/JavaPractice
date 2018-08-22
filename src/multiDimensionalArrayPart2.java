
public class multiDimensionalArrayPart2 {
	
	public static void main(String[] args) {
		int b[][]= {{2,2},{3,11}};
		int min = b[0][0];
		int mincolumn ;
		
		for( int i=0;i< 2;i++) 
		{
			for (int j=0;j<2;j++) 
			{
				if( b [i][j]<min) 
				{
					min = b[i][j]; 
					
					mincolumn = j;					
				}	
			}
		}
		
		
		System.out.println(min);
	}

}
