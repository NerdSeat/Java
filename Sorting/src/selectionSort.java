public class selectionSort
{
    public static void main(String[] args) 
    {
        int [] intArray = {20,35,-15,7,55,1,-22};
        for(int i = 0;i<intArray.length;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<intArray.length;j++)
            {
                if(intArray[j]<intArray[minIndex])
                    minIndex=j;
            }
            swap(intArray, minIndex,i);
        }
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i]+"\t");
    }
    
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}