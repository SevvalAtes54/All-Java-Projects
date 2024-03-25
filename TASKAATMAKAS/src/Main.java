import java.util.Random;
import java.util.Scanner;

enum Move {
    TAS(001),
    KAGIT(002),
    MAKAS(003);

    private int fieldId;


    Move(int fieldId) {
        this.fieldId = fieldId;
    }

    public int getFieldId() {
        return fieldId;
    }
}

public class Main {
    public static void main(String[] args) {
     //   Random rn = new Random();
       // int answer = rn.nextInt(1,3);
        Scanner scanner = new Scanner(System.in);
        int firstPlayer = 0;
        int secondPlayer = 0;
        while (secondPlayer != -1 || firstPlayer != -1 ){

            System.out.println("ilk oyuncu deger girsin 1 2 3 tas kagit makas");

             firstPlayer = scanner.nextInt();
             if( firstPlayer == -1){
                 System.out.println("OYUN BİİTTTİ KANKA");
                 System.out.println("Player1in skoru :" + Player.counter1 +"Player1in skoru :" + Player.counter2);
                 if (Player.counter2 > Player.counter1 ){
                     System.out.println("OYUNU PLAYER 2 KAZANDI");
                 }
                 else {
                     System.out.println("OYUNU PLAYER 1 KAZANDI");
                 }
                 return;
             }
            System.out.println("ikicni oyuncu deger girsin 1 2 3 tas kagit makas");
            secondPlayer = scanner.nextInt();
            if( secondPlayer == -1){
                System.out.println("OYUN BİİTTTİ KANKA");
                System.out.println("Player1in skoru :" + Player.counter1 +"Player1in skoru :" + Player.counter2);
                if (Player.counter2 > Player.counter1 ){
                    System.out.println("OYUNU PLAYER 2 KAZANDI");
                }
                else {
                    System.out.println("OYUNU PLAYER 1 KAZANDI");
                }
                System.out.println("Player1in skoru :" + Player.counter1 +"Player1in skoru :" + Player.counter2);

                return;
            }
            Player player1 = new Player();
            Player player2 = new Player();


            player1.SetHamle(firstPlayer);
            player2.SetHamle(secondPlayer);
            // 1TAS 2KAGIT 3MAKAS
            if (firstPlayer == 1 && secondPlayer == 3) {
                Player.counter1++;
                System.out.println("PLAYER 1 WINS");
            } else if (firstPlayer == 2 && secondPlayer == 1) {
                Player.counter1++;
                System.out.println("PLAYER 1 WINS");
            } else if (firstPlayer == 3 && secondPlayer == 2) {
                Player.counter1++;
                System.out.println("PLAYER 1 WINS");
            } else {
                Player.counter2 += 1;
                System.out.println("PLAYER 2 WINS");
            }


        }

    }
}