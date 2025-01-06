package SortInJava;

import java.util.Scanner;

public class BubbleSort {
    private static void nhap_mang(int []A, int n){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            System.out.println("A[ "+i+" ]:");
            A[i] = scanner.nextInt();
        }
    }

    private static void xuat_mang(int []A, int n){
        for(int i = 0; i < n; i++){
            System.out.println("A[ "+i+" ]"+ A[i]);
        }
    }

    private static void hoan_vi(int []A, int a, int b){
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    private static void sap_xep_noi_bot(int []A, int n) {
        for(int i=0; i<n-1; i++) {
            for(int j=n-1; j>i; j--) {
                if(A[j]<A[j-1]) {
                    hoan_vi(A, j, j-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []A;
        int n = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        n = scn.nextInt();
        A = new int[n];
        nhap_mang(A, n);
        System.out.println("Mảng sau khi sắp xếp (Bubble Sort)");
        sap_xep_noi_bot(A, n);
        xuat_mang(A, n);
    }
}
