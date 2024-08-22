public class maxAscend {

    public static void main(String[] args) {
        int [] arr={10,20,30,5,10,50};
        int result=maxAscSum(arr);
        System.out.println("the sum of the max Ascending array is: "+result);
    }

    public static int maxAscSum(int arr[]){
        int max=arr[0];
        int crmax=arr[0];

        for (int i =1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]) {
                crmax=crmax+arr[i];
            }else {
                max = Math.max(max,crmax);
                crmax = arr[i];
            }
        }
        max=Math.max(crmax,max);
        return max;
    }
}
