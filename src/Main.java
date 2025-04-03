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
        int auxilioTransporte = 200000;

        System.out.print("Ingrese su usuario: ");
        usuarioEmpleado = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contrasenaUsuario = sc.nextLine();
        if (usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin")) {
                System.out.println("Ha ingresado de forma correccta");
            } else {
            System.out.println("Error de credenciales");
        }
    }
}