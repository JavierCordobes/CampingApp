package logica;

public class Persona {

	private String nombre;
	private String documento;
	private String telefono;
	private boolean esUruguayo;
	private long tarjeta;
	
	public Persona (String nombre, String documento, String telefono, boolean esUruguayo, long tarjeta) {
		this.nombre=nombre;
		this.documento=documento;
		this.telefono = telefono;
		this.esUruguayo=esUruguayo;
		this.tarjeta=tarjeta;
			}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getDocumento() {
		return this.documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return this.telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isEsUruguayo() {
		return this.esUruguayo;
	}
	public void setEsUruguayo(boolean esUruguayo) {
		this.esUruguayo = esUruguayo;
	}
	public long getTarjeta() {
		return this.tarjeta;
	}
	public void setTarjeta(long tarjeta) {
		this.tarjeta = tarjeta;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", documento=" + documento + ", telefono=" + telefono + ", esUruguayo="
				+ esUruguayo + ", tarjeta=" + tarjeta + "]";
	}
	
	
}
