public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // Cevap: Metod 42 değerini döndürüyor ama biz kullanmadığımız için değer kaybolur.
        // Program normal çalışır, hata vermez; sadece döndürülen değer kullanılmamış olur.


        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Cevap: Bu derleme hatası verir, çünkü sayHello() void ve hiçbir değer döndürmez.
        // void bir metod ifadede kullanılamaz, bu yüzden '+ 7' kısmı hataya sebep olur.

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
