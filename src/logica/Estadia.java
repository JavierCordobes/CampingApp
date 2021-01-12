package logica;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Estadia {
	private LocalDate fechaIngreso;
	private LocalDate fechaSalida;
	private int cantidadAlojados;
	private int monto;
	private Lugar lugar;
	private Persona titular;
	private boolean activa;

	public Estadia(LocalDate fechaIngreso, LocalDate fechaSalida, int cantidadAlojados, Lugar lugar, Persona titular) {
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.cantidadAlojados = cantidadAlojados;
		this.lugar = lugar;
		this.monto = calcularMonto();
		this.titular = titular;
		this.activa = true;
	}

	public boolean estaActiva(LocalDate fecha) {

		return fecha.isBefore(this.fechaIngreso) || fecha.isAfter(this.fechaSalida);
	}

	public int duracionEstadia() {
		return (int) ChronoUnit.DAYS.between(fechaIngreso, fechaSalida);
	}

	public int calcularMonto() {
		int monto=0;
		if (this.lugar instanceof Cabania) {
			monto=duracionEstadia() * this.lugar.getMontoDiario();
		}else if(this.lugar instanceof Parcela) {
			monto = duracionEstadia()*this.lugar.getMontoDiario()*this.cantidadAlojados;
		}
		return monto;
	}

	public String getLugarYApellido() {
		return this.titular.getNombre() + this.lugar.getId();
	}

	public LocalDate getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public LocalDate getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getCantidadAlojados() {
		return this.cantidadAlojados;
	}

	public void setCantidadAlojados(int cantidadAlojados) {
		this.cantidadAlojados = cantidadAlojados;
	}

	public int getMonto() {
		return this.monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public Lugar getLugar() {
		return this.lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public Persona getTitular() {
		return this.titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	@Override
	public String toString() {
		return "Estadia [fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", cantidadAlojados="
				+ cantidadAlojados + ", monto=" + monto + ", lugar=" + lugar + ", titular=" + titular + ", activa="
				+ activa + "]\n";
	}

}
