public class pattern {
    public static void main(String[] args) {
        for(int line=1;line<=10  ;line++){
            for(int star=1; star <=line; star++){
                   System.out.print("*");   // remember that here only use print not println -
            }                                 // - if use then * print into next line     
            System.out.println();   // this use for next line                            
        }
    }
}
