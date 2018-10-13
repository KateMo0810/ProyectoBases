package Modelo;

/**
 *
 * @author Jhoan Saavedra
 */

public class Empresa {

    private Integer codigo;
    private String nombre;
    private Sede sede;

    public Empresa() {
    }

    public Empresa(Integer codigo, String nombre, Sede sede) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sede = sede;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }


}
