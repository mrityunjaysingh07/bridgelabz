public class pattern4 {
    public static void main(String[] args) {
        char ch='A';
        for(int line=1;line<=6;line++){
            for(int chars=1;chars<=line;chars++){  // use "chars" because char is keyword 
                            System.out.print(ch);
                ch++;   // this line use to increase the alphabet  

            }
            System.out.println();
        }
    }
}
