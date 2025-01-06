package Exercise;

public class fibonaccidequy {
    public static int fibonacci(int k){
        int f0 = 0, f1 = 1, fn = 1;
        if (k < 0){
            return -1;
        } else if((k == 0 || k == 1)){
            return k;
        } else {
            for (int i=2; i < k; i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    public static void main(String[] args){
        System.out.println("10 so fibonacci dau tien: ");
        for (int i = 0; i < 10; i++){
            System.out.print(String.valueOf(fibonacci(i))+ "\t");
        }
    }
}
