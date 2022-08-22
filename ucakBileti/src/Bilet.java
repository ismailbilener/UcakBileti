import java.util.Scanner;
public class Bilet {
    public static void main(String[] args) {
        int km, yas;
        String yolculukTipi;
        Scanner input = new Scanner(System.in);

        System.out.println("Yolculuk tipini seçiniz: ");
        yolculukTipi = input.nextLine();

        System.out.print("Gideceğiniz mesafe kaç km giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();



        double normalTutar = km*(0.10);
        double yasIndirimi, toplamTutar, gidisDonus;

        if (yolculukTipi.equals("1")){
            if (yas>0 && yas<12) {
                yasIndirimi = normalTutar*0.5;
                toplamTutar = normalTutar-yasIndirimi;
                System.out.println(toplamTutar);
            } else if (yas>12 && yas<24) {
                yasIndirimi = normalTutar*0.10;
                toplamTutar = normalTutar-yasIndirimi;
                System.out.println(toplamTutar);
            } else if (yas<65) {
                normalTutar = km*(0.10);
                System.out.println(normalTutar);
            } else {
                yasIndirimi = normalTutar*0.3;
                toplamTutar = normalTutar-yasIndirimi;
                System.out.println(toplamTutar);
            }
        }
        else if (yolculukTipi.equals("2")) {
            if (yas>0 && yas<12) {
                yasIndirimi = normalTutar*0.5;
                toplamTutar = normalTutar-yasIndirimi;
                gidisDonus = toplamTutar*0.20;

                System.out.println((toplamTutar-gidisDonus)*2);

            } else if (yas>12 && yas<24) {
                yasIndirimi = normalTutar*0.10;
                toplamTutar = normalTutar-yasIndirimi;
                gidisDonus = toplamTutar*0.20;
                System.out.println(gidisDonus);
                System.out.println((toplamTutar-gidisDonus)*2);

            }else {
                yasIndirimi = normalTutar*0.3;
                toplamTutar = normalTutar-yasIndirimi;
                gidisDonus = toplamTutar*0.20;
                System.out.println((toplamTutar-gidisDonus)*2);
            }
        }
        else {
            System.out.println("Hatalı giriş yaptınız");
        }
    }
}
