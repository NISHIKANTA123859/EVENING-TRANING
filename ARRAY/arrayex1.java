public class arrayex1 {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,1,1,0,0,1,1,0,0};
        int maxcount=0;
        int count =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;

            }
            else{
                maxcount=Math.max(maxcount,count);
                count =1;
            }

        }
        System.out.println(maxcount);

    }
}
