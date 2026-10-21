import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalClientes = 0;
        int contadorHoras = 0;
        int horaPico = -1;
        int maxClientes = -1;
        int hora;

        do {
            System.out.print("Ingresa la hora (0 - 23, -1 para terminar) : ");
            hora = sc.nextInt();

            if (hora != -1) {
                if (hora < -1 || hora > 23) {
                    System.out.println("Error: hora inválida");
                }else{
                    System.out.print("Ingresa el número de clientes en esa hora : ");
                    int clientes = sc.nextInt();

                    totalClientes += clientes;
                    contadorHoras++;

                    if (clientes > maxClientes){
                        maxClientes = clientes;
                        horaPico =hora;
                    }
                }
            }
        }while (hora != -1);

        if (contadorHoras ==0){
            System.out.println("No se ingresaron datos");
        }else{
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("---Reporte de Clientes---");
            System.out.println("Total de clientes atendidos: " + totalClientes);
            System.out.println("Promedio de clientes por hora: " + String.format("%.2f", promedio));
            System.out.println("Hora con más clientes: " + horaPico + " (" + maxClientes + " clientes)");
        }
        sc.close();
    }
}