
import java.util.Scanner;

/*public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if( age >=18){
            System.out.println("are you adult");
        }
         else if(age>=13 && age<18){
            System.out.println("are you teenager");
        }

        else{
            System.out.println("are you child or not adult");
        }

    }
}*/


/*public class condition {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();
      System.out.println(" value a : "+ a);
      int b=sc.nextInt();
      System.out.println("value b : "+b);
            if(a>b){
        System.out.println("a is largest number");
      }
      else{
        System.out.println("b is largest number");
      }
      
    }
}*/

/*public class condition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        if((num%2)==0){
            System.out.println("Number is even");
        } 
        else{
            System.out.println("Number is odd");
        }
    }
}*/

/*public class condition{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int income =sc.nextInt();
      int tax;
      if(income<=50000){
        System.out.println("Congratulation for you 0% tax ");
        tax=0;
    }
    else if(income>50000 && income<2000000){
        System.out.println("Congratulation for you 15% tax ");
         tax = (int)(income*0.15);
    }
    else{
        System.out.println("Hello Rich people for you only 30% tax ");
         tax =(int)(income*0.3);
    }
    System.out.println("Your tax is " + tax);
 }
}*/

// find largest of 3 number 

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        
        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is the largest number");
        } else if (b > c && b > a) {
            System.out.println("b is the largest number");
        } else if (c > a && c > b) {
            System.out.println("c is the largest number");
        } else {
            System.out.println("Two or more numbers are equal and largest");
        } sc.close();
         sc.close(); 
        
    }
}
