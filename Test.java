public class Test {
    
    // Method main utama
    public static void main(String[] args) {
        System.out.println("Method main(String[] args) utama dipanggil.");
        
        // Overloaded main methods manual
        main(15880);
        main("Praktikum PBO Lab", 9);
    }

    // Overloaded 1 parameter (int)
    public static void main(int angka) {
        System.out.println("Overloaded main(int) dipanggil. Angka: " + angka);
    }

    // Overloaded 2 parameter (String dan int)
    public static void main(String teks, int angka) {
        System.out.println("Overloaded main(String, int) dipanggil. " + teks + " " + angka);
    }
}