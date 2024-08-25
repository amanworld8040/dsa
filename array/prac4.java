import java.util.Arrays;

public class prac4 {
    public static int[] deleteElement(int arr[],int element) {
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (element == arr[i]){
                count++;
            }
        }
        if (count==0){
            return arr;
        }

        int[] newArray = new int[arr.length - count];
        int index = 0;

        // Copy all elements except the one to be removed
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                newArray[index++] = arr[i];
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 2};
        int elementToRemove = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] resultArray = deleteElement(arr, elementToRemove);

        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(resultArray));
    }

}
