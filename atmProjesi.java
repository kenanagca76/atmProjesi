package atmProjesi;
import java.util.Scanner;

public class atmProjesiSwichCase {
    public static void main(String[] args) {
        String username, password;
        int right=3;// yanlış giriş sayısı
        int select;
        int balance = 1500;// hesaptaki miktar

        Scanner input = new Scanner(System.in);

        while (right > 0){
            System.out.print("Username : ");
            username = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();
            if(username.equals ("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {

                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seciniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı:  ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println(price+ " tl hesabınıza yatırılmıştır. \nYeni bakiyeniz :"+balance);
                            break;
                        case 2:
                            System.out.println("Para Miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz Yetersiz. Lütfen hesabınızdaki miktar kadar giriniz");
                            } else {
                                balance -= price;
                                System.out.println("Hesabınızdan "+price+" tl çekilmiştir.\nİyi günlerde kullanınız...\nKalan bakiyeniz : "+balance+" tl'dir.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                }
                    while (select != 4);
                        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.\nTekrar Görüşmek Üzere.");
                    break;
            }else{
                right--;
                System.out.println("Hatalı Giriş Yaptınız.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
