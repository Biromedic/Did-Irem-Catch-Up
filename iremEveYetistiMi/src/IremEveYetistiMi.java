import java.util.Scanner;

public class IremEveYetistiMi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eve yetiştin mi?");
        String yetismek = scanner.nextLine();

        MuzikCal muzikCal = new MuzikCal();


        if (yetismek.equals("evet") || yetismek.equals("yes") || yetismek.equals("yetistim") || yetismek.equals("he")){
            System.out.println("Eve yetiştim .d");
            muzikCal.muzikOynat();
        }
        else {
            System.out.println("yetismemek :'(");
            muzikCal.muzikOynat2();
        }
        scanner.close();
    }
}
