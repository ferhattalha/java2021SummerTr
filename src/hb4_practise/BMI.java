package hb4_practise;

public class BMI {
	
	 /*
     * 1 ) BMI ve MainBMI class'lar� creat ediniz 2 ) BMI class'� i�in field'lar�
     * name(String), age(int), weight(double) ve height(double) olan veriable'lar
     * olu�turup t�m veriableleri encapsule ediniz. 3 ) t�m field'lar� setter getter
     * ve constructor creat ediniz. 4 ) bmi=weight/(height*height) formul�ne g�re
     * bmi hesaplayan bir method creat ediniz. 5 ) bmi 18.5 ten kucukse zayif, 25
     * ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren method
     * creat ediniz. 
     * 6 ) MainBMI de bu de�ereli yazd�r�n�z.
     */
    private String name;
    private int age;
    private double weight;
    private double height;
    public BMI(String name, int age, double weight, double height) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double bmiHesapla() {
        double bmi = weight / (height * height);
        return bmi;
    }
    public String bmiDurumu() {
        double bmi = bmiHesapla();
        if (bmi < 18.5) {
            return "zayif";
        } else if (bmi < 25) {
            return "normal";
        } else if (bmi < 30) {
            return "kilolu";
        } else
            return "obez";
    }
}


