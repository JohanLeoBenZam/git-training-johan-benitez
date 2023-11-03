package main;

import java.util.List;

import hilos.HilosCoches;
import hilos.TransiciónCarrera;

public class Main {

	public static void main(String[] args) {
		
		// INICIALIZAR LISTAS DE CORREDORES Y CARRERAS TRAMOS
		
		List<TransiciónCarrera> corredores ;
		List<TransiciónCarrera> carrerasTramos;
		
		
		
		// INSTANCIAR UN OBJETO DE TRANSICION DE CARRERA
		TransiciónCarrera situacionCarrera = new TransiciónCarrera();
		
		
		
		// CANTIDAD DE COCHES EN LA CARRERA
		int cantidadCoches = 4;
		
		
		
		// CREAR HILOS PARA CADA COCHE Y AGREGARLOS A LA LISTA DE COCHES EN CARRERA
		for (int i = 1; i <= cantidadCoches; i++) {
			
			HilosCoches cochecarrera = new HilosCoches(situacionCarrera, i);
			situacionCarrera.getCochesCarreras().add(cochecarrera);
			cochecarrera.start();
			
			
		}
		

		// MENSAJE DE PREPARACION
		System.out.println("¡¡ PREPARADOS!!\n ¡¡¡LISTOS!!!\n ¡¡¡¡¡¡YA!!!!!!!");
		
		// ESPERAR HASTA QUE LA CARRERA TERMINE
		while (situacionCarrera.isContinuar()) {
			
			try {
				
				// HACER QUE EL HILO PRINCIPAL ESPERE DURANTE UN SEGUNDO
				Thread.sleep(1000);
				situacionCarrera.setIniciar(true);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		
		// MENSAJE DE FINALIZACION
		System.out.println("¡¡¡¡¡¡¡¡¡FINAL!!!!!!!!!");
	}
}
