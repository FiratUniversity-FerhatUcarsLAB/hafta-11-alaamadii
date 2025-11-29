/**
 * Ad Soyad: [Alaa Madi]
 * Öğrenci No: [240541609]
 * Proje: [university system grade calculator]
 * Tarih: [29/11/2025]
 */

public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { //1
        zippo("rattle", 13); //2
    }

    public static void baffle(String blimp) { //6
        System.out.println(blimp); // 7
        zippo("ping", -5); // 8
    }

    public static void zippo(String quince, int flag) { //3  
        if (flag < 0) { //9
            System.out.println(quince + " zoop"); //10
        } else {  //4
            System.out.println("ik"); //5
            baffle(quince); // 6 (the same step cuz call happens here)
            System.out.println("boo-wa-ha-ha"); //11
        }
    }
}
