public class backtracing_string_11 {
    public static void Singlesubstring(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
        char s=str.charAt(i);
         String result=str.substring(0,i)+str.substring(i+1);
         Singlesubstring(result,ans+s);
        }
    }
    public static void main(String[] args){
        String str="ABC";
        Singlesubstring(str,"");
    }
  
}