import java.util.Scanner;

public class Main {
    public static int toplama(int a, int b) {
        return a+b;
    }

    public static int cikarma(int a, int b) {
        return a-b;
    }

    public static int carpma(int a, int b) {
        return a*b;
    }

    public static int bolme(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String islemler = "1. TOPLAMA \n"
                        + "2. ÇIKARMA \n"
                        + "3. ÇARPMA \n"
                        + "4. BÖLME \n"
                        + "Çıkış İçin q' ya basınız.";
        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");
        System.out.println("Yukarıdan İşlem Seçiniz:");
        while (true) {
            String islem = scan.nextLine();
            if(islem.equals("q")) {
                System.out.println("Çıkış Yapılıyor....");
                break;
            }
            else if(islem.equals("1")) {
                System.out.println("Toplama İslemi Seçildi..");
                System.out.print("a: ");
                int a = scan.nextInt();
                System.out.print("b: ");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println(a + " + " + b +" = " + toplama(a,b));
                System.out.println("Tekrar İşlem Seçiniz");

            }
            else if(islem.equals("2")) {
                System.out.println("Çıkarma İslemi Seçildi..");
                System.out.print("a: ");
                int a = scan.nextInt();
                System.out.print("b: ");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println(a + " - " + b +" = " + cikarma(a,b));
                System.out.println("Tekrar İşlem Seçiniz");
            }
            else if(islem.equals("3")) {
                System.out.println("Çarpma İslemi Seçildi..");
                System.out.print("a: ");
                int a = scan.nextInt();
                System.out.print("b: ");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println(a + " x " + b +" = " + carpma(a,b));
                System.out.println("Tekrar İşlem Seçiniz");
            }
            else if(islem.equals("4")) {
                System.out.println("Bçlme İslemi Seçildi..");
                System.out.print("a: ");
                int a = scan.nextInt();
                System.out.print("b: ");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println(a + " / " + b +" = " + bolme(a,b));
                System.out.println("Tekrar İşlem Seçiniz");
            }
            else {
                System.out.println("HATALI İŞLEM!!!");
                System.out.println("Tekrar İşlem Seçiniz");
            }
        }
    }
}