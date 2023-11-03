package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File archivo = new File("productos.txt");
		ArrayList<Producto> productos= new ArrayList<Producto>();

		if (archivo.exists()) {
			FileReader fr;
			BufferedReader br;
			
			try {
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);

				String linea;
				
				while((linea = br.readLine()) != null) {
					String[] s = linea.split(",");
					productos.add(new Producto(Integer.parseInt(s[0]),s[1],Double.parseDouble(s[2])));
				}

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
			} catch (IOException e) {
				e.printStackTrace();
			}catch (NumberFormatException e) {
				System.err.println("ALERTA: ERROR EN LA BASE DE DATOS.");
			}

		} else {
			System.err.println("ERROR. EL ARCHIVO DE PRODUCTOS NO EXISTE.");
		}

	}

}
