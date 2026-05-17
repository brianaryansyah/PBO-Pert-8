import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		BangunDatar bd;
		Scanner inputan = new Scanner(System.in);
		
		System.out.println("--- Menghitung Luas Persegi Panjang ---");
		SegiEmpat persegiPanjang = new SegiEmpat();
		bd = persegiPanjang;
		System.out.print("Masukkan Panjang: ");
		bd.panjang = inputan.nextDouble();
		
		System.out.print("Masukkan Lebar: ");
		bd.lebar = inputan.nextDouble();
		
		double luas = bd.luas();
		bd.cetakLuas("Persegi panjang",luas);
		
		System.out.println("\n--- Menghitung Luas Segitiga Siku-siku ---");
		Segitiga sikusiku = new Segitiga();
		bd = sikusiku;
		
		System.out.print("Masukkan Alas: ");
		bd.panjang = inputan.nextDouble();
		
		System.out.print("Masukkan Tinggi: ");
		bd.tinggi = inputan.nextDouble();
		
		double luas1 = bd.luas(bd.panjang, bd.tinggi);
		bd.cetakLuas("Segitiga siku-siku", luas1);
		
		System.out.println("\n--- Menghitung Luas Persegi ---");
		SegiEmpat persegi = new SegiEmpat();
		
		System.out.print("Masukkan Sisi: ");
		int sisi = inputan.nextInt();
		
		int luas2 = persegi.luas(sisi);
		
		persegi.cetakLuas("Persegi", luas2);

		System.out.println("\n--- Menghitung Luas Lingkaran ---");
		Lingkaran lingkaran = new Lingkaran();
		bd = lingkaran; 
		
		System.out.print("Masukkan Jari-jari (r): ");
		double r = inputan.nextDouble();
		
		double luas3 = lingkaran.luas(r); 
		bd.cetakLuas("Lingkaran", luas3);
		
		inputan.close(); 
	}
}