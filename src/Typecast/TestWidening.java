package Typecast;

public class TestWidening {
    public static void main(String[] args){

        int i = 100;
        long l = i; // Khong yeu cau chi dinh ep kieu
        float f = l; // Khong yeu cau chi dinh ep kieu
        System.out.println("Gia tri Int: " + i);
        System.out.println("Gia tri Long: " + l);
        System.out.println("Gia tri Float: " + f);
    }
}
