public class arrEx3 {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,1,1,0,1,1,0,0,0,0,0};
        int max0=0;
        int max1=0;
        int count =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                if(arr[i-1]==0){
                    max0=Math.max(max0,count);

                }
                else{
                    max1=Math.max(max1,count);
                }
                count=1;
            }
        }
        if(arr[arr.length-1]==0){
            max0=Math.max(max0,count);
        }
        else{
            max1=Math.max(max1,count);
        }
    }
}
