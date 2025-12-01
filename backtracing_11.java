public class backtracing_11 {
    public static void random(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        random(n-1,ans+"1");
        random(n-1,ans+"0");
    }
    public static void main(String[] args){
        random(3," ");
    }

    
}
