import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el día (1=Lunes, 7=Domingo) : ");
        int dia = sc.nextInt();

        System.out.print("Ingresa la hora (0-23) : ");
        int hora = sc.nextInt();

        if (dia < 1 || dia > 7) {
            System.out.println("Error: día invalido");
            sc.close();
            return;
        }

        if (hora < 0 || hora > 23){
            System.out.print("Error: hora invalida");
            sc.close();
            return;
        }

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };

        boolean abierta = switch (dia) {
            case 1,2,3,4,5 -> hora >= 6 && hora < 20;
            case 6 -> hora >= 7 && hora < 14;
            default -> false;
        };

        String horario = switch (dia) {
            case 1,2,3,4,5 -> "6 AM - 8 PM";
            case 6 -> "7 AM - 2 PM";
            default -> "cerrado todo el día";
        };

        if (abierta) {
            System.out.println("La cafetería está abierta");
        }else{
            System.out.println("La cafeteria está cerrada");
        }

        System.out.println("Horario de " + nombreDia + ": " + horario);
        sc.close();
    }
}