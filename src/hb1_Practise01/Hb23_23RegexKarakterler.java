package hb1_Practise01;

public class Hb23_23RegexKarakterler {

	public static void main(String[] args) {

		String b = "Haluk 1453 ?!@$_";

		System.out.println("orjinal metin ---> " + b);

		System.out.println();

		// \\d ifadesi tum rakamlari(digit) temsil eder.
		System.out.println("T�m rakamlar�n * hali ---> " + b.replaceAll("\\d", "*"));
		// ===> \\D rakamlar disindaki hersey
		System.out.println("T�m rakam hariclerin * hali ---> " + b.replaceAll("\\D", "*"));

		System.out.println();

		// ==> \\S space disindaki hersey
		System.out.println("T�m space hariclerin * hali ---> " + b.replaceAll("\\S", "*"));

		// ==> \\s space ifadesidir.
		System.out.println("T�m space'nin * hali ---> " + b.replaceAll("\\s", "*"));

		// replace ile yapma
		System.out.println("replace ile T�m space'nin * hali ---> " + b.replace(" ", "*"));

		System.out.println();

		// ==> \\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _ bunlari kapsar
		System.out.println("T�m harf ve rakamlar�n * hali ---> " + b.replaceAll("\\w", "*"));

		// ==> \\W ifadesi a-z A-Z 0-9 ve _ disindakileri kapsar

		System.out.println("T�m harf ve rakam  hariclerin * hali ---> " + b.replaceAll("\\W", "*"));

	}

}
