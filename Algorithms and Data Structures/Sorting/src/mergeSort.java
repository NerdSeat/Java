public class mergeSort
{
    public static void main(String[] args)
    {
        int [] intArray = {20,35,-15,7,55,1,-22};

        sort(intArray, 0, intArray.length);
        for(int i = 0;i<intArray.length;i++)
            System.out.print(intArray[i]+"\t");
    }

    public static void sort(int arr[],int start,int end)
    {
        int mid = (start+end)/2;
        if((end-start)<2)
            return;
        sort(arr, start, mid);
        sort(arr, mid, end);
        merge(arr, start,mid, end);
    
    }
    public static void merge(int arr[],int start,int mid,int end)
    {
        if(arr[mid-1]<=arr[mid])
            return;
        
        int i = start;
        int j =mid;
        int [] temp = new int[end-start];
        int index = 0;
        while(i<mid && j<end)
        {
            temp[index++] = arr[i]<=arr[j]? arr[i++]:arr[j++];
        }
        
        System.arraycopy(arr, i, arr, start+index, mid-i);
        System.arraycopy(temp, 0, arr, start, index);
    }
}