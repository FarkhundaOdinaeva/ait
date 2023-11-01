public class EpceptionAppl {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        try {
            int x = solution(a, b);
            System.out.println("Solution = " + x);
        } catch (ArithmeticException e){
            System.out.println("Solution any Number");
            return;
        } finally {
            System.out.println("Bye, bye");
        }
        System.out.println("Math is great!");


    }
    public static int solution(int a, int b){
        if(a == 0 && b != 0) {
            throw new IllegalArgumentException();
        }
        if (a == 0 && b == 0){
            throw new ArithmeticException();

        }
        int res = b / a;
        return res;
    }
}
