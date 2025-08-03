import java.util.Scanner;

public class bai12_toantu3ngoi_btjava10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap DTB");
        double n = sc.nextDouble();
        String cautraloi = (n>=8)?"Gioi" :
                ((8>n && n>=6.5)?"Kha" :
                        (6.5>n && n>=5)?"Trung binh" : "Yeu");
        System.out.println("Ket qua xep loai la " + cautraloi);
    }
}
