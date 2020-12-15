public class insertionSort
{
    public static void main(String[] args) 
    {
        int [] intArray = {20,35,-15,7,55,1,-22};
        int firsUnsortedIndex;
        int newElement;
        for(int i = 0;i<intArray.length-1;i++)
        {
           firsUnsortedIndex = i+1;
           if(intArray[firsUnsortedIndex]<intArray[i])
           {
               newElement = intArray[firsUnsortedIndex];
               int j = firsUnsortedIndex;
               while(j>0)
               {
                   if(intArray[j-1]<newElement)
                        break;
                    intArray[j]=intArray[j-1];
                    j--;
               }
               intArray[j]=newElement;
           }
        }
        for(int i=0;i<intArray.length;i++)
        {
            System.out.print(intArray[i]+"\t");
        }

    }
}