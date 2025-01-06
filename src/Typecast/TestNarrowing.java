package Typecast;

public class TestNarrowing {
    public static void main(String[] args){
        double d = 100.04;
        long l = (long) d; //yeu cau chi dinh kieu du lieu
        int i = (int) l; //yeu cau chi dinh kieu du lieu
        System.out.println("Gia tri Double:" + d);
        System.out.println("Gia tri Long:" + l);
        System.out.println("Gia tri Int:" + i);

    }
}
