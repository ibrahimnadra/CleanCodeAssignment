// Java Program to convert an numberArrayArrayay
// to reduced form
import java.util.*;

class ReducedForm
{
    public static void printNumberArray(int numberArray[], int arrayLength)
    {
        System.out.println("The Modified Array : ");
        for (int index= 0; index< arrayLength; index++)
            System.out.print(numberArray[index] + " ");
    }
    public static void fillHashMapWithRank(HashMap<Integer, Integer> numbersWithRankMap, int sortedTemporaryArray[], int arrayLength)
    {
        int rank = 0;
        for (int index= 0; index < arrayLength; index++){
            numbersWithRankMap.put(sortedTemporaryArray[index], rank++);
        }
    }
    public static void convertIntoReducedForm(int numberArray[],int arrayLength)
    {
        // creating a temporary array to store sorted elements of the numberArray
        int sortedTemporaryArray[] = numberArray.clone();
        Arrays.sort(sortedTemporaryArray);
        
        //hashmap to store the sorted array and their ranks
        HashMap<Integer, Integer> numbersWithRankMap = new HashMap<>();
        fillHashMapWithRank(numbersWithRankMap, sortedTemporaryArray, arrayLength);

        // Convert numberArray by taking positions from numbersWithRankMap
        for (int index= 0; index< arrayLength; index++){
            numberArray[index] = numbersWithRankMap.get(numberArray[index]);
        }
    }

    public static void main(String[] args)
    {
        //scanner object to input the length and elements of the array
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the count of elements : \n");
        int arrayLength = scannerObject.nextInt();

        int numberArray[] = new int[arrayLength];
        System.out.println("Enter the elements : \n");
        for(int index = 0; index < arrayLength; index++){
            numberArray[index] = scannerObject.nextInt();
        }

        convertIntoReducedForm(numberArray, arrayLength);
        printNumberArray(numberArray, arrayLength);
    }
}
