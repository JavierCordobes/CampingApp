package logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class ColeccionEstadias {
	ArrayList<Estadia> estadias = new ArrayList<Estadia>();

	public void ingresarEstadia(Estadia estadia) {
		estadias.add(estadia);
		estadia.getLugar().setOcupada(true);
	}

	public void registrarEgreso(String documento) {
		for (Estadia e : estadias) {
			if (e.isActiva() == true && e.getTitular().getDocumento() == documento) {
				if (e.getFechaSalida() == LocalDate.now()) {
					
				} else {
					e.setFechaSalida(LocalDate.now());
					e.setMonto(e.calcularMonto());
				}

			}
		}

	}

	public ArrayList<Estadia> listarLugaresOcupados(LocalDate fecha) {
		ArrayList<Estadia> estadiasActivas = new ArrayList<Estadia>();

		for (Estadia e : estadias) {
			if (!e.estaActiva(fecha)) {
				estadiasActivas.add(e);
				e.getLugarYApellido();
			}
		}
		return estadiasActivas;
	}

	public int cantidadPersonas(LocalDate fecha) {
		int contadorPersonas = 0;
		for (Estadia e : estadias) {
			if (!e.estaActiva(fecha)) {
				contadorPersonas = contadorPersonas + e.getCantidadAlojados();
			}
		}
		return contadorPersonas;

	}

	public int montoIngresadoMes(int mes, int anio) {
		int ingresoMes = 0;
		for (Estadia e : estadias) {
			if (mes == e.getFechaSalida().getMonthValue() && anio == e.getFechaSalida().getYear()) {
				ingresoMes = ingresoMes + e.getMonto();
			}
		}
		return ingresoMes;
	}

	public double[] promedioDiasEstadia() {
		double[] promedios = new double[2];
		int cabaniaAloj = 0;
		int contadorCab = 0;
		int parcelaAloj = 0;
		int contadorPar = 0;
		for (Estadia e : estadias) {
			if (e.getLugar() instanceof Cabania) {
				cabaniaAloj = cabaniaAloj + e.getCantidadAlojados();
				contadorCab++;
			} else if (e.getLugar() instanceof Parcela) {
				parcelaAloj = parcelaAloj + e.getCantidadAlojados();
				contadorPar++;
			}
		}
		if (contadorCab != 0) {
			promedios[0] = cabaniaAloj / contadorCab;
		}
		if (contadorPar != 0) {
			promedios[1] = parcelaAloj / contadorPar;
		}
		return promedios;
	}

}
