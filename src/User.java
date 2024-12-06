public class User {

    private String dni;
    private String primerApellido;
    private String segundoApellido;
    private String nombres;
    private String codigoUbigeo;
    private String departamento;
    private String provincia;
    private String distrito;

    public User(String dni, String primerApellido, String segundoApellido, String nombres, String codigoUbigeo, String departamento, String provincia, String distrito) {

        this.dni = dni;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombres = nombres;
        this.codigoUbigeo = codigoUbigeo;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;

    }

    public String getDni() {
        return dni;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public String getNombres() {
        return nombres;
    }
    public String getCodigoUbigeo() {
        return codigoUbigeo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getProvincia() {
        return provincia;
    }
    public String getDistrito() {
        return distrito;
    }

}
