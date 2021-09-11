package day43_abstractClasses;

public abstract class S80 extends Volvo {

	@Override
	public void kapý() {
		System.out.println("4 kapýlý");
		
	}

	@Override
	public void motor() {
		
		System.out.println("1800 cc baþarýlý");
		
	}

	@Override
	public void sunroof() {
		super.sunroof();
	}

	}


