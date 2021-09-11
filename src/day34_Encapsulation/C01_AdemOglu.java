package day34_Encapsulation;

public class C01_AdemOglu {

	
		
		String name;
		String surName;
	     private int age;
		
		

		public static void main(String[] args) { 

	}

	public void yasAta(int age) { // obj isterse yası set edebilir
		
		if(age>0) {
			this.age=age;
			
		}else this.age=-age;
		
	}
		public int yasGoster() { // bu method obj isterse yaşını gösterebilir
			
			return this.age;
		}
	}


