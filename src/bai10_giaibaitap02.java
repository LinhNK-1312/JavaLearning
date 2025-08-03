import java.util.Scanner;

public class bai10_giaibaitap02 {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao ban kinh duong tron r: ");
        double r = sc.nextDouble(); //doc toan bo du lieu nhap ben tren
        double cv = 2*Math.PI *r;
        double dt = Math.PI *Math.pow(r,2);
        //xuat ket qua
        System.out.println("Chu vi la: "+cv);
        System.out.println("Dien tich la: "+dt);*/


        //BTVN
                Scanner sc = new Scanner(System.in);
                System.out.println("Moi nhap vao chieu dai: ");
                double a = sc.nextDouble(); //doc toan bo du lieu nhap ben tren
                System.out.println("Moi nhap vao chieu rong: ");
                double b = sc.nextDouble(); //doc toan bo du lieu nhap ben tren

                double dt = a*b;
                double cv = (a + b) * 2;
                //xuat ket qua
                System.out.println("Dien tich la: "+dt);
                System.out.println("Chu vi la: "+cv);


            }
}
