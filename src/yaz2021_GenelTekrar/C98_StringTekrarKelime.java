package yaz2021_GenelTekrar;






public class C98_StringTekrarKelime {

	public static void main(String[] args) {
		
		String strKontrol = "";
        String str = "Javaisalsoeasy";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))) {
                if (!strKontrol.contains(Character.toString(str.charAt(i)))) {
                    strKontrol += str.charAt(i);
                }
            }
        }
        
        System.out.println(strKontrol);
}
}