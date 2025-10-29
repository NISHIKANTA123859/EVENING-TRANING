public class arrEX4 {
    public static void main(String[] args) {
        int arr[]={2,6,7,9,10,13};  
        int temp;
        for(int i=0;i<arr.length;i+=2){
        temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
