package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File archivo = new File("productos.txt");

		if (archivo.exists()) {
			FileReader fr;
			BufferedReader br;
			
			try {
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);

				// Aqui se leen los productos

				Scanner sc = new Scanner(System.in);
				int opcion;
				boolean salir = false;

				do {

					System.out.println("Productos:");

					// Aqui se muestran los productos

					opcion = sc.nextInt();

				} while (!salir);

			} catch (FileNotFoundException e) {
				System.err.println("ERROR. ARCHIVO DE PRODUCTOS NO ENCONTRADO.");
			}

		} else {
			System.err.println("ERROR. EL ARCHIVO DE PRODUCTOS NO EXISTE.");
		}

	}

}
