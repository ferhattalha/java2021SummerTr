package day14_metodCreationFoorLoop;

public class C05_MetodOverloading {

	public static void main(String[] args) {

		String srt = "Java candýr";

		System.out.println(srt.substring(5)); // candýr

		System.out.println(srt.substring(5, 7)); // ca

		String isim = "Mehmet";
		String soyisim = "Bulut";
		int sayý1 = 10;
		int sayý2 = 20;
		double sayý3 = 15.0;
		double sayý4 = 3.14;

		toplama(isim, soyisim);
		toplama(sayý1, sayý2);
		toplama(sayý3, sayý4);
        toplama(sayý2,sayý4);
	}

	private static void toplama(double sayý3, double sayý4) {
		System.out.println(sayý3 + sayý4);

	}

	private static void toplama(int sayý1, int sayý2) {

		System.out.println(sayý1 + sayý2);

	}

	private static void toplama(String isim, String soyisim) {

		System.out.println(isim + soyisim);

	}

	private static void toplama(int sayý2, double sayý4) {
		System.out.println(sayý2 + sayý4);
}
}