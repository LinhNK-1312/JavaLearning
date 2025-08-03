import java.util.Scanner;

public class bai11_ifelse
        //
{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //giaiBai1(sc);

        Scanner sc = new Scanner(System.in);
        giaiBai7(sc);

        //Scanner sc = new Scanner(System.in);
        //giaiBai6(sc);

        //Scanner sc = new Scanner(System.in);
        //giaiBai7(sc);

        System.out.println("Moi nhap vao dtb ");
        double dtb = sc.nextDouble();
        //kiem tra dieu kien
        if (dtb >= 8 && dtb < 10) {
            System.out.println("Ban xl gioi");
        } else if (dtb >= 7 && dtb < 8) {
            System.out.println("Ban xl kha");
        } else {
            System.out.println("Ban xl TB");
        }
    }

    //BTVN1
    public static void giaiBai1(Scanner sc) {
        System.out.println("Nhap vao tong hai so: ");
        float tong = sc.nextInt();
        System.out.println("Nhap vao hieu hai so: ");
        float hieu = sc.nextInt();
        float x = (tong + hieu) / 2;
        float y = tong - x;
        System.out.println("x = " + x + ", y = " + y);

    }

    //BTVN2
    public static void giaiBai2(Scanner sc) {
        System.out.println("Nhap vao chieu cao: (m)");
        int Chieucao = sc.nextInt();
        System.out.println("Nhap vao can nang: (kg)");
        int Cannang = sc.nextInt();
        int BMI = Cannang / (Chieucao ^ 2);
        //kiem tra dieu kien
        if (BMI < 15) {
            System.out.println("Than hinh qua gay");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("Than hinh gay");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("Than hinh hoi gay");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Than hinh binh thuong");
        } else if (BMI >= 25 && BMI < 35) {
            System.out.println("Than hinh hoi beo");
        } else if (BMI >= 35) {
            System.out.println("Than hinh qua beo");
        }

    }


    //BTVN3
    public static void giaiBai6(Scanner sc) {

        // Nhập năm
        System.out.print("Nhập vào 1 năm dương lịch: ");
        int nam = sc.nextInt();

        // Kiểm tra năm nhuận
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            System.out.println(nam + " là năm nhuận.");
        } else {
            System.out.println(nam + " không phải là năm nhuận.");
        }
    }


    public static void giaiBai7(Scanner sc) {
        System.out.println("Nhap vao thang: ");
        int Thang = sc.nextInt();

        //kiem tra dieu kien
        if (Thang == 1 || Thang == 3 || Thang == 5 || Thang == 7 || Thang == 8 || Thang == 10 || Thang == 12) {
            System.out.println("Thang" + " " + Thang + " " + "co 31 ngay");
        } else if (Thang == 4 || Thang == 6 || Thang == 9 || Thang == 11) {
            System.out.println("Thang" + " " + Thang + " " + "co 30 ngay");
        } else if (Thang == 2) {
            System.out.println("Nhap vao nam: ");
            int nam = sc.nextInt();
            // Kiểm tra năm nhuận
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                System.out.println("Thang 2 nam " + nam + " co 29 ngay");
            } else {
                System.out.println("Thang 2 nam " + nam + " co 28 ngay");
            }
        } else {
            System.out.println("Ban nhap tao lao");
        }
    }
}



