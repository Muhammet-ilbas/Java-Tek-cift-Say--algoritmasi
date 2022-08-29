import java.util.Scanner;

public class TekCift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");

		int sayi = in.nextInt();
		System.out.println(oddishOrEvenish(sayi));

		in.close();
	}

	public static String oddishOrEvenish(int sayi) {
		int toplam = 0;
		int basamakSayisi = 1;
		int temp = sayi;

		while (temp > 9) {
			temp = temp / 10;
			basamakSayisi++;
		}

		while (basamakSayisi > 0) {
			int basamak = (sayi / (int) Math.pow(10, basamakSayisi - 1));
			toplam += basamak;
			sayi = sayi - (basamak * (int) Math.pow(10, basamakSayisi - 1));
			basamakSayisi--;
		}

		System.out.println(toplam);

		if (toplam % 2 == 0)
			return "even";
		else
			return "odd";

	}

}
