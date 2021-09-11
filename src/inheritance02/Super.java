package inheritance02;

public class Super {
    
    /*
     * Super class isminde bir method oluþturalým
içerine num=20 deðerini oluþturalým
Göster isminde bir method "superclass i görüntülüyorsunuz" print etsin
Subclass oluþturalým ve superclasstan miras alalým
SubClassta num=10 olsun
göster metodu "subClassý görüntülüyorsunuz desin"
Runner classta My_method isminde bit method oluþturalým.
Ýçerine SubClasstaki göster ve SuperClass taki goster metodunu çaðýralým
Ayný zamanda num deðerini hem subBClasstan hem SuperClass tan yazdýrýn
     */
    
    
    int num=20;
    
    public void goster() {
        System.out.println("Superclassi goruntuluyorsunuz");
    }
    
    
}