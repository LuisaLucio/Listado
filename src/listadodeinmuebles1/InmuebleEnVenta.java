package listadodeinmuebles1;

/**
 *
 * @author Luisa Lucio
 */
public class InmuebleEnVenta extends Inmueble {
    public InmuebleEnVenta() {
    }

    public InmuebleEnVenta(String Dirección, String Ciudad) {
        super(Dirección, Ciudad, "Venta");
    }
}
