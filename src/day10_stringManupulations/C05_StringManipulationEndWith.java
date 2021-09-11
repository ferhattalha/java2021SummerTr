package day10_stringManupulations;

public class C05_StringManipulationEndWith {

	public static void main(String[] args) {

		String str = "Java kolaydir";

		System.out.println(str.endsWith("r"));

		System.out.println(str.endsWith("ir"));

		System.out.println(str.endsWith("dir"));

		System.out.println(str.endsWith(""));

		System.out.println(str.endsWith("Java kolaydir"));

		
		System.out.println(str.startsWith("J"));

		System.out.println(str.startsWith("Java"));

		System.out.println(str.startsWith("Java kolaydýr"));

		System.out.println(str.startsWith("j"));

	}

}
