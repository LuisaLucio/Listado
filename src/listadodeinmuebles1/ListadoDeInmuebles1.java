package listadodeinmuebles1;

import java.util.Scanner;

/**
 *
 * @author Luisa Lucio
 */
public class ListadoDeInmuebles1 {
    
    private static void mostrarMenu() {
        System.out.println("\nBienvenid@ al listado de inmuebles\nMENÚ DE OPCIONES:\n1. Agregar inmueble\n2. Listar inmuebles\n3. Editar inmueble\n4. Eliminar inmueble\n5. Guardar archivo\n6. Salir");
    }

    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("Ingrese la dirección del inmueble: ");
                    String Dirección = sc.nextLine();
                    System.out.print("Ingrese la ciudad del inmueble: ");
                    String Ciudad = sc.nextLine();
                    System.out.print("Ingrese el tipo de inmueble (arriendo/venta): ");
                    String Tipo = sc.nextLine();
                    if (Tipo.equals("arriendo")) {
                        Inmueble inmueble = new InmuebleEnArriendo(Dirección, Ciudad);
                        inmobiliaria.agregarInmueble(inmueble);
                    } else if (Tipo.equals("venta")) {
                        Inmueble inmueble = new InmuebleEnVenta(Dirección, Ciudad);
                        inmobiliaria.agregarInmueble(inmueble);
                    } else {
                        System.out.println("Tipo de inmueble inválido.");
                    }
                    break;
                case 2:
                    inmobiliaria.listarInmuebles();
                    break;
                case 3:
                    System.out.print("Ingrese la dirección del inmueble a editar: ");
                    Dirección = sc.nextLine();
                    inmobiliaria.editarInmueble(Dirección);
                    break;
                case 4:
                    System.out.print("Ingrese la dirección del inmueble a eliminar: ");
                    Dirección = sc.nextLine();
                    inmobiliaria.eliminarInmueble(Dirección);
                    break;
                case 5:
                    System.out.print("Ingrese la carpeta donde desea guardar el archivo: ");
                    String carpeta = sc.nextLine();
                    inmobiliaria.guardarArchivo(carpeta);
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
                    break;
            }
        }
    }
}
