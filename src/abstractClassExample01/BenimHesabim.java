package abstractClassExample01;

public  class BenimHesabim extends Banka {



	@Override
	double paraYat�r(double miktar) {
		super.bakiye+=miktar;
		return bakiye;
	}

	@Override
	double paraCek(double miktar) {
		super.bakiye-=miktar;
		return bakiye;
	
		
	}
	
	public BenimHesabim(double bakiye) {
		super.bakiye=bakiye;
		System.out.println(bakiye);
		

		
}
}