package chapter3;


public class Main
{
	public static void main(String[] args) 
	{
		quicksort x=new quicksort();
		int arr[]={2,4,6};
		int result=x.sum(arr,arr.length);

		System.out.println("exersice 1: " + result);
		
		int arr2[]={2,4,6,12};
		quicksort y=new quicksort();
		if(y.binary_search(4,arr2,0,arr2.length-1)==1)
		{
			System.out.println("Target found");
		}
		else
		{
			System.out.println("Target not found");
			
		}
		int arr3[]={20,4,14,12};
		quicksort z=new quicksort();
		z.quick_sort(arr3, 0, 3);
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(" "+arr3[i]);
		}
		
		
	}
}
