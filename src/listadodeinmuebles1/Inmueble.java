package listadodeinmuebles1;

/**
 *
 * @author Luisa Lucio
 */
abstract class Inmueble {
    protected String Dirección, Ciudad, Tipo;

    public Inmueble() {
    }

    public Inmueble(String Dirección, String Ciudad, String Tipo) {
        this.Dirección = Dirección;
        this.Ciudad = Ciudad;
        this.Tipo = Tipo;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
    public void editar(String Ciudad, String Tipo) {
        this.Ciudad = Ciudad;
        this.Tipo = Tipo;
    }

    
    @Override
    public String toString() {
        return String.format("%-30s %-20s %-10s", Dirección, Ciudad, Tipo);
    }
}
