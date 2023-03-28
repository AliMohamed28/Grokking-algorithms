package chapter3;


public class quicksort 
{
    public int sum(int []arr,int n)
    {
        if(n<=0)
        {
            //System.out.println();
            return 0;
        }

        return (sum(arr,n-1)+arr[n-1]);
    }

    public int binary_search(int target,int []arr2,int low,int high)
    {
      
        if(low>=high)
        {
            return 0;
        }

        int guess=(low+high/2);
        if((arr2[guess]==target))
        {
            return 1;
        }
       
        //too low
        if(arr2[guess]<target)
        {
            return binary_search(target, arr2,guess+1,high);
        }
        //too high
        else
        {
            return binary_search(target, arr2,low,guess-1);
        }
    }

    public void quick_sort(int []arr,int low,int high)
    {
        if(low<high)
        {
            int pi=part(arr,low,high);

            quick_sort(arr, low, pi-1);
            quick_sort(arr, pi+1, high);        
        }

    }
    public int part(int[]arr,int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }



}
