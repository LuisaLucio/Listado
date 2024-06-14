package listadodeinmuebles1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luisa Lucio
 */
public class Inmobiliaria {
    List<Inmueble> inmuebles= new ArrayList<>();

    public void agregarInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
        System.out.println("Inmueble agregado con éxito.");
    }

    //mostrar en formato tabla los datos de los inmuebles ingresados.
    public void listarInmuebles() {
        if (inmuebles.isEmpty()) {
            System.out.println("No hay inmuebles para mostrar.");
            return;
        }
        System.out.printf("%-30s %-20s %-10s%n", "Dirección", "Ciudad", "Tipo");
        System.out.println("------------------------------------------------------------");
        for (Inmueble inmueble : inmuebles) {
            System.out.println(inmueble);
        }
    }

    public void editarInmueble(String Dirección) {
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.getDirección().equals(Dirección)) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la nueva ciudad: ");
                String Ciudad = scanner.nextLine();
                System.out.print("Ingrese el nuevo tipo (arriendo/venta): ");
                String Tipo = scanner.nextLine();
                inmueble.editar(Ciudad, Tipo);
                System.out.println("Inmueble editado con éxito.");
                return;
            }
        }
        System.out.println("Inmueble no encontrado.");
    }

    public void eliminarInmueble(String Dirección) {
        for (int i = 0; i < inmuebles.size(); i++) {
            if (inmuebles.get(i).getDirección().equals(Dirección)) {
                inmuebles.remove(i);
                System.out.println("Inmueble eliminado con éxito.");
                return;
            }
        }
        System.out.println("Inmueble no encontrado.");
    }
    
    //Se utilizan para escribir datos en archivos
    public void guardarArchivo(String carpeta) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(carpeta + "/Inmuebles.txt"))) {
            for (Inmueble inmueble : inmuebles) {
                writer.write(inmueble.toString());
                writer.newLine();
            }
            System.out.println("Archivo guardado en " + carpeta + "/Inmuebles.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
