package logica;

public abstract class Lugar {

	protected int montoDiario;
	protected boolean ocupada;
	protected String id;
	protected int maxOcupantes;

	public Lugar( String id,int montoDiario, int maxOcupantes) {
		this.id=id;
		this.montoDiario=montoDiario;
		this.ocupada=false;
		this.maxOcupantes=maxOcupantes;
		
		
		
	}

	public int getMontoDiario() {
		return montoDiario;
	}

	public void setMontoDiario(int montoDiario) {
		this.montoDiario = montoDiario;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public int getMaxOcupantes() {
		return maxOcupantes;
	}

	public void setOcupantes(int maxOcupantes) {
		this.maxOcupantes = maxOcupantes;
	}

	@Override
	public String toString() {
		return "Lugar [montoDiario=" + montoDiario + ", ocupada=" + ocupada + ", id=" + id + ", maxOcupantes="
				+ maxOcupantes + "]";
	}


	
	
	
}
