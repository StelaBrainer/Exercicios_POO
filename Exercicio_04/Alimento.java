package Exercicio_04;

public class Alimento {
	
	private int selo;

	public int getSelo() {
	    return selo;
	}

	public void setSelo(int selo) {
	    this.selo = selo;
	}

	@Override
	public int getIdentificador(){
	    return this.selo;
	}

}
