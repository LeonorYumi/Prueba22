package TechESFOT;

public abstract class Empleados {
    protected int codigo;
    protected String nombre;
    protected String apellido;
    protected String cargo;
    protected double sueldo;

    public Empleados(int codigo, String nombre, String apellido, String cargo, double sueldo) throws DatoInvalidoException {
        if(nombre == null || nombre.trim().isEmpty()){
            throw new DatoInvalidoException("El nombre no puede estar vacio");
        }if(apellido == null || apellido.trim().isEmpty()){
            throw new DatoInvalidoException("El apellido no puede estar vacio");
        }if(cargo == null || cargo.trim().isEmpty()){
            throw new DatoInvalidoException("El cargo no puede estar vacio");
        }if(sueldo <= 0){
            throw new DatoInvalidoException("El sueldo no puede ser negativo");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public abstract String MostrarEmpleados();
}
