package day44Interfaces;

public class Sahin extends Tofas implements IcDonanim ,Lastik{
    @Override
    public void koltuk() {
        System.out.println("deri koltuk yazin pisirir..");
        System.out.println("icinde saman olmasin yeter");
        
    }
    @Override
    public void motor() {
        System.out.println("1.6 aile motoru");
        
    }
    @Override
    public void yakit() {
        System.out.println("tup takmazsan coookmyakar");
        
    }
    @Override
    public void ayna() {
        System.out.println("elentirkli aynalar");
        
    }
    @Override
    public void kapi() {
        System.out.println("4 kapili");
        
    }
    @Override
    public void kaporta() {
        System.out.println("kordon gibi kaporata sahip");
   
	
	
	}
	@Override
	public void ebat() {
		System.out.println("16 in? lastik ebad? vard?r");
		
	}
	@Override
	public void jant() {
		System.out.println("?elik jant kullan?lm??t?r");
		
	}
}