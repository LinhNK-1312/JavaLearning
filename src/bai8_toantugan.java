public class bai8_toantugan {
    public static void main(String[] args) {
        //gan cong
        int x=8;
        //x+=5; x=x+5;
        x=x+5;
        System.out.println("x= "+x);

        //gan tru
        int x2=8;
        x2-=5; //x2=x2-5;
        System.out.println("x2= "+x2);

        //gan nhan
        int x3=8;
        x3*=5; //x3=x3*5;
        System.out.println("x3= "+x3);

        int a=7; //tam coi la kqua cua phep tinh nao do
        int b=9; //tam coi la kqua cua phep tinh nao do
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);


        //BTVN
        //A gan cong
        int a1=6;
        a1+=3;
        System.out.println("a1 "+a1);

        //A gan tru
        int a2=6;
        a2-=5;
        System.out.println("a2 "+a2);

        //A gan nhan
        int a3=6;
        a3*=2;
        System.out.println("a3 "+a3);

        //A gan chia
        int a4=6;
        a4%=5;
        System.out.println("a4 "+a4);

        //A gan chia
        int a5=6;
        a5/=5;
        System.out.println("a5 "+a5);

        //
        int a6=6;
        int b6=2;
        a6=a6-(b6+7);
        System.out.println("a6 "+a6);


    }
}
