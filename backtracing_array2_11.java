public class backtracing_array2_11 {
    public static void Singlesubarray(int[] arr,int index){
        if(index==arr.length){
            for(int num:arr){
            System.out.print(num+" ");
            }
            System.out.println();
            return;
        }
        for(int j=index;j<arr.length;j++){
         int temp=arr[index];
         arr[index]=arr[j];
         arr[j]=temp;
         Singlesubarray(arr,index+1);
         temp=arr[index];
         arr[index]=arr[j];
         arr[j]=temp;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        Singlesubarray(arr,0);
    }
  
}

