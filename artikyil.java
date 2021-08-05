import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Yılı giriniz:");
        yil = input.nextInt();
        boolean artik = false;

        if(yil % 4 == 0){
            if (yil % 100 == 0){
                if (yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else{
            artik = false;
        }
        if(artik == true)
            System.out.println(yil + "artık bir yıldır");
        else
            System.out.println(yil + "artık bir yıl değildir");
    }
}
