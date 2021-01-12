package logica;

import java.util.ArrayList;

public class ColeccionLugares {

	ArrayList<Lugar> lugares = new ArrayList<Lugar>();

	public void agregarLugar(Lugar lugar) {
		this.lugares.add(lugar);
	}

	public ArrayList<Lugar> listarDisponibles() {
		ArrayList<Lugar> lugaresDisponibles = new ArrayList<Lugar>();
		for (Lugar l : lugares) {
			if (l.ocupada == false) {
				lugaresDisponibles.add(l);
			}
		}
		return lugaresDisponibles;
	}

	public Lugar buscarLugar(String id) {
		Lugar lugarBuscado = null;
		for (Lugar l : lugares) {
			if (l.getId() == id) {
				lugarBuscado = l;
				break;
			}
		}
		return lugarBuscado;
	}

}
