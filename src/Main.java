public class Main {
    public static void main(String[] args) {
        for (int i=0; i<=100; i=i+10)
        {
            //modulus is the remainder after doing integer division
            //20 / 20 = 1 with a remainder of 0  Modulus is 0
            //30 / 20 = 1 with a remainder of 10 Modulus is 10
            System.out.printf("i=%3d %s %n",i,(i%20==0)?"Java":"");
        }
    }
}