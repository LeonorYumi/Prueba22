package TechESFOT;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
        static Scanner sc = new Scanner(System.in);
        static ArrayList <Empleados> lista = new ArrayList<>();

        public static void main(String[] args) {
            int opcion;
            do {
                System.out.println("---- MENÚ EMPLEADOS ----");
                System.out.println("1. Registrar empleado tiempo completo");
                System.out.println("2. Registrar empleado medio tiempo");
                System.out.println("3. Mostar empleados registrados");
                System.out.println("4. Mostar estadisticas");
                System.out.println("5. Salir");
                System.out.printf("\n Ingrese una opcion: ");

                opcion = sc.nextInt();
                switch (opcion){
                    case 1 -> registrarEmpleadoTiempoCompleto();
                    case 2 -> registrarEmpleadoMedioTiempo();
                    case 3 -> MostrarEmpleados();
                    case 4 -> System.out.println("Saliendo del sistema... ");
                    default -> System.out.println("Opcion no valida");
                }
            } while (opcion != 4);
        }
        //Menu
    public static void registrarEmpleadoTiempoCompleto() {
            try {
                System.out.printf("Código: ");
                int codigo = sc.nextInt();
                System.out.printf("Nombre: ");
                String nombre = sc.next();
                System.out.printf("Apellido: ");
                String apellido = sc.next();
                System.out.printf("Sueldo base: ");
                double sueldoBase = sc.nextDouble();
                System.out.printf("Bono: ");
                double bono = sc.nextDouble();
                System.out.println("Empleado tiempo completo registrado existosamente");
            } catch (Exception e) {
                System.out.println("Error al registrar empleado tiempo completo");;
            }
    }
    public static void registrarEmpleadoMedioTiempo() {
            try{
                System.out.printf("Código: ");
                int codigo = sc.nextInt();
                System.out.printf("Nombre: ");
                String nombre = sc.next();
                System.out.printf("Apellido: ");
                String apellido = sc.next();
                System.out.printf("Cargo: ");
                String cargo = sc.next();
                System.out.printf("Bono: ");
                double Horastrabajadas = sc.nextDouble();
                System.out.printf("Pago por hora: ");
                double horaPago = sc.nextDouble();
                System.out.println("Empleado medio tiempo registrado existosamente");
            } catch (Exception e) {
                System.out.println("Error al registrar empleado tiempo completo");
            }
    }
    public static void MostrarEmpleados() {
            try{
                if(lista.isEmpty()){
                    System.out.println("No hay empleados registrados");
                    return;
                }
                System.out.println("--- LISTA DE EMPLEADOS REGISTRADOS ---");
                for (Empleados e: lista){
                    System.out.println(e.MostrarEmpleados());
                }
            } catch (Exception e) {
                System.out.println("Error al mostrar empleados registrados");
            }
    }
}
