package programs;

public class ArraySort {

	
		// TODO Auto-generated method stub
		
		
//		public static boolean isSorted(int[] a) 
//		{
//			System.out.println(a.length);
//		    int i;
//		    for (i = 0; i < a.length; i++); { 
//		        if (a[i] < a[i + 1]) {
//		            return true;
//		        }
//		        else {
//		            return false;
//		        }
//		    }
//		}
//		public static void main(String[] args)
//		{
//		    int ar[] = {3,5,6,7};
//		    System.out.println(isSorted(ar));   
//		}
//		
	public static void main(String[] args)
	{	 
	int[] values = {1,3,4,5};
	int temp = values[0];
	boolean flag =false;
	
	for(int i=1; i< values.length;i++)
	{
		if(temp<values[i])
		{
			temp=values[i];
		}
		else
		{
			flag = true;
			break;
		}
	}
	if(flag)
		System.out.println("Not sorted");
	else
		System.out.println("sorted");
	}
}
