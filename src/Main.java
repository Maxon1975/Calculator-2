public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(5, 7));
        System.out.println(intsCalc.mult(9, 56));
        System.out.println(intsCalc.pow(4, 8));
    }
}