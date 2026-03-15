package Arrays.Easy;

public class RemoveDuplicates {
    static int remove(int[] arr){
        if(arr.length==0) return 0;
        int write = 1;
        for(int read=1;read<arr.length;read++){
            if(arr[read]!=arr[read-1]){
                arr[write] = arr[read];
                write++;
            }
        }
        return write;
    }
    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,30,30};
        System.out.println(remove(arr));
    }
}
