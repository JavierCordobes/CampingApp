package test;

import java.time.LocalDate;
import java.time.Month;

import logica.Cabania;
import logica.ColeccionEstadias;
import logica.ColeccionLugares;
import logica.Estadia;
import logica.Lugar;
import logica.Parcela;
import logica.Persona;

public class pruebaCamping {

	public static void main(String[] args) {

		LocalDate fechaIngreso = LocalDate.of(2021, 1, 1);
		LocalDate fechaSalida = LocalDate.of(2021, 1, 21);

		LocalDate fechaPrueba = LocalDate.of(2021, 1, 16);

		Estadia esta = new Estadia(fechaIngreso, fechaSalida, 3, new Cabania("a", 1000, 5),
				new Persona("Jorge", "9062", "095806899", true, 5544444));

		System.out.println(esta.estaActiva(fechaPrueba));
		System.out.println(esta.duracionEstadia());

		System.out.println(esta.calcularMonto());

		//////////

		Lugar cabania1 = new Cabania("a", 10000, 10);
		Lugar parcela1 = new Parcela("b", 100, 10);
		Lugar cabania3 = new Cabania("c", 2500, 4);

		Estadia esta2 = new Estadia(LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 30), 10, cabania1,
				new Persona("Jordana", "41861513", "095806899", true, 1234));
		Estadia esta3 = new Estadia(LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 15), 1, parcela1,
				new Persona("Javier", "46269062", "095806899", true, 5544444));
		ColeccionLugares lugares = new ColeccionLugares();

		lugares.agregarLugar(cabania1);
		lugares.agregarLugar(parcela1);
		lugares.agregarLugar(cabania3);
		System.out.println(lugares.listarDisponibles());

		System.out.println(lugares.buscarLugar("e"));

		ColeccionEstadias estadias = new ColeccionEstadias();
		estadias.ingresarEstadia(esta);
		estadias.ingresarEstadia(esta2);
		estadias.ingresarEstadia(esta3);
		estadias.registrarEgreso("46269062");
		System.out.println(estadias.listarLugaresOcupados(fechaPrueba));
		System.out.println(lugares.listarDisponibles());

		System.out.println(estadias.cantidadPersonas(fechaPrueba));
		System.out.println(estadias.montoIngresadoMes(2, 2021));
		System.out.println(estadias.promedioDiasEstadia());
	}

}
