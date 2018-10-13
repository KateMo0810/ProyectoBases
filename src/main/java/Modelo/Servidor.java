package Modelo;

/**
 *
 * @author Jhoan Saavedra
 */

public class Servidor {

    private Integer codigo;
    private String nombre;
    private Empresa empresa;

    public Servidor() {
    }

    public Servidor(Integer codigo, String nombre, Empresa empresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empresa = empresa;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
