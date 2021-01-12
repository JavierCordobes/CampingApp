package logica;

public class Sistema {
	private ColeccionEstadias estadias = new ColeccionEstadias();
	private ColeccionLugares lugares = new ColeccionLugares();
	
	
	
	public void agregarLugar(Lugar lugar) {
		lugares.lugares.add(lugar);
	}
	
	public void ingresarEstadia(Estadia estadia) {
		if(estadia.getCantidadAlojados()<=estadia.getLugar().maxOcupantes) {	
		estadias.ingresarEstadia(estadia);}
		else System.out.println("La cantidad maxima de ocupanes es " +estadia.getLugar().maxOcupantes);
	}
	
	
	
	
	
	
	
	
	
}
