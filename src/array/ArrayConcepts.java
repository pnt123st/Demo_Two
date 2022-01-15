package array;

public class ArrayConcepts {

    public static void main(String[] args) {
        try {
            int [] arr;
            arr = new int[10];

            arr[0] =200;
            arr[8] =2000;
            arr[6] =5000;
            System.out.println(arr[6]);
            System.out.println(arr.length);
            System.out.println(arr[11]);
        }catch (Exception e){
            System.out.println("Array Index Out Of Bounds Exception");
        }

    }
}
