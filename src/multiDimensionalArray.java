
public class multiDimensionalArray {
// find the max number in multidimensional array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,2},{3,11}};
		int max = 0;
		
		for( int i=0;i< 2;i++) 
		{
			for (int j=0;j<2;j++) 
			{
				if( a [i][j]>max) 
				{
					max = a[i][j]; 	
				}	
			}
		}
		
		System.out.println(max);
		
		// find the minimum number in multidimensional array
		
		int b[][]= {{2,2},{3,11}};
		int min = b[0][0];
		
		for( int i=0;i< 2;i++) 
		{
			for (int j=0;j<2;j++) 
			{
				if( b [i][j]<min) 
				{
					min = b[i][j]; 	
				}	
			}
		}
		System.out.println(min);
	}
	
		
		
	}

