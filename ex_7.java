package laba2;

public class ex_7 {
    public static void main(String[] args) {
        int n=10;
        char[] c =new char[n];
        char b = 'a';
        for(int i =0; i<c.length; i++){
        c[i] = b;
        b+=2;
        System.out.print((c[i]) + "\t");
        }
        System.out.println();
        for (int i = c.length-1; i>=0; i--){
            System.out.print(c[i] + "\t");
    }



    }
}
