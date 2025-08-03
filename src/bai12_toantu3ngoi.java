import java.util.Scanner;
public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        //nhap vao ban phim 1 so, kiem tra chan le
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 so nguyen n: ");
        int n = sc.nextInt();
        String traloi = (n%2 ==0)?"Chan" : "Le";
        System.out.println("So" +n+ "la so" + traloi);

    }

}
