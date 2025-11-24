package TechESFOT;

public class EmpleadoMedioTiempo extends Empleados {
    private double pagoHoras;

    public EmpleadoMedioTiempo(int codigo, String nombre, String apellido, String cargo, double sueldo) throws DatoInvalidoException {
        super(codigo, nombre, apellido, cargo, sueldo);

        if(pagoHoras <= 0){
            throw new DatoInvalidoException("El pago por horas no puede ser negativo");
        }else{
            this.pagoHoras = pagoHoras;
        }
    }

    @Override
    public String MostrarEmpleados() {
        return "-- Empleado Medio Tiempo --"
                + "\n Nombre: " + nombre
                + "\n Apellido: " + apellido
                + "\n Cargo: " + cargo
                + "\n Sueldo: " + sueldo
                + "\n PagoHoras: " + pagoHoras;
    }
}
