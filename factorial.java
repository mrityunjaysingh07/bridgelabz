import java.util.*; 
public class factorial{

    public static int factorial1(int a){
         int b = 1;
        for(int i = 1 ; i <= a ;i++){
            b = i * b ; 
        }
        return b;
    }
        
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println();
        System.out.println(factorial1(a));
    }
}

