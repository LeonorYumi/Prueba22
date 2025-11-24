package TechESFOT;

public class EmpleadoTiempoCompleto extends Empleados {
    private double bono;

    public EmpleadoTiempoCompleto(int codigo, String nombre, String apellido, String cargo, double sueldo, double bono) throws DatoInvalidoException {
        super(codigo, nombre, apellido, cargo, sueldo);

        if(bono <= 0){
            throw new DatoInvalidoException("El bono no puede ser negativo");
        }else{
            this.bono = bono;
        }

    }

    @Override
    public String MostrarEmpleados() {
        return "-- Empelado Completo --"
                + "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nCargo: " + cargo
                + "\nSueldo: " + sueldo
                + "\nBono: " + bono;
    }
}
