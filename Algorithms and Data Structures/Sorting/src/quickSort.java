public class quickSort
{
    public static void main(String[] args)
    {
        int [] intArray = {20,35,-15,7,55,1,-22,10};

        sort(intArray, 0, intArray.length);
        for(int i = 0;i<intArray.length;i++)
            System.out.print(intArray[i]+"\t");
    }
    public static void sort(int [] arr,int start,int end )
    {
        if(end-start<2)
            return;
        int pivotIndex = partition(arr, start, end);
        sort(arr, start, pivotIndex);
        sort(arr, pivotIndex+1, end);
        
    }
    public static int partition(int arr[],int start,int end)
    {
        int pivot = arr[start];
        int i=start,j=end;
        while(i<j)
        {
            //empty loop body
            while(i<j&&pivot<=arr[--j]);
            if(i<j)
                arr[i]=arr[j];
            while(i<j&& arr[++i]<=pivot);
            if(i<j)
                arr[j]=arr[i];
        }
        arr[j]=pivot;
        return j;
    }
}