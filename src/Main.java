//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
         * Una empresa desea registrar la información de cada empleado
         * Para ello un empleado debe ingresar con usuario y contraseña
         * Una vez ingresado el empleado debe registrar la siguiente información
         * 1 - Nombre completo
         * 2 - Documento de identidad
         * 3 - Valor de la hora
         * 4 - Cantidad de las horas
         * 5 - Seleccionar un día de descanso a la semana (L-V)
         * El sistema le debe mostrar al empleado:
         * Su salario Neto,Salario Bruto, Deducción por Pensión, Deducción por Salud, Auxilio de transporte (si aplica) y bonificación del 10%
         * si no supera 2 SMMLV (sin incluir auxilio de transporte)
         * Toda la información del empleado se debe mostrar en un mensaje descriptivo
         */

        /*Definición y asignación de variables*/
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String contrasenaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 0;
        int auxilioTransporte = 200000;

        System.out.print("Ingrese su usuario: ");
        usuarioEmpleado = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contrasenaUsuario = sc.nextLine();
        if (usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin")) {
                System.out.println("Ha ingresado de forma correccta");
                System.out.println("Ingrese el nombre del empleado: ");
                nombreEmpleado = sc.nextLine();
                System.out.println("Ingrese su documento de identidad: ");
                documentoIdentidad = sc.nextLine();
                System.out.println("Ingrese el día de descanso (Lunes a viernes): ");
                diaDescanso = sc.nextLine();
                System.out.println("Ingrese el valor de la hora: ");
                valorHora = sc.nextDouble();
                System.out.println("Ingrese la cantidad de horas trabajadas: ");
                cantidadHoras = sc.nextDouble();
                salarioBruto = valorHora * cantidadHoras;
                System.out.println("Ingrese el valor del salario mínimo para este año: ");
                valorSalarioMinimo = sc.nextDouble();
                if (salarioBruto > (valorSalarioMinimo*2)){
                    bonificacionEmpleado = 0;
                    auxilioTransporte = 0;
                }
                else {
                    bonificacionEmpleado = salarioBruto*0.1;
                    auxilioTransporte = 200000;
                }
                salarioNeto = salarioBruto + bonificacionEmpleado + auxilioTransporte;
                System.out.println("El salario neto es: " + salarioNeto);
            } else {
            System.out.println("Error de credenciales");
        }
    }
}