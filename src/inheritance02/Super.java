package inheritance02;

public class Super {
    
    /*
     * Super class isminde bir method olu�tural�m
i�erine num=20 de�erini olu�tural�m
G�ster isminde bir method "superclass i g�r�nt�l�yorsunuz" print etsin
Subclass olu�tural�m ve superclasstan miras alal�m
SubClassta num=10 olsun
g�ster metodu "subClass� g�r�nt�l�yorsunuz desin"
Runner classta My_method isminde bit method olu�tural�m.
��erine SubClasstaki g�ster ve SuperClass taki goster metodunu �a��ral�m
Ayn� zamanda num de�erini hem subBClasstan hem SuperClass tan yazd�r�n
     */
    
    
    int num=20;
    
    public void goster() {
        System.out.println("Superclassi goruntuluyorsunuz");
    }
    
    
}