package day14_metodCreationFoorLoop;

public class C05_MetodOverloading {

	public static void main(String[] args) {

		String srt = "Java cand�r";

		System.out.println(srt.substring(5)); // cand�r

		System.out.println(srt.substring(5, 7)); // ca

		String isim = "Mehmet";
		String soyisim = "Bulut";
		int say�1 = 10;
		int say�2 = 20;
		double say�3 = 15.0;
		double say�4 = 3.14;

		toplama(isim, soyisim);
		toplama(say�1, say�2);
		toplama(say�3, say�4);
        toplama(say�2,say�4);
	}

	private static void toplama(double say�3, double say�4) {
		System.out.println(say�3 + say�4);

	}

	private static void toplama(int say�1, int say�2) {

		System.out.println(say�1 + say�2);

	}

	private static void toplama(String isim, String soyisim) {

		System.out.println(isim + soyisim);

	}

	private static void toplama(int say�2, double say�4) {
		System.out.println(say�2 + say�4);
}
}