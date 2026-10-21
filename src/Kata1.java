import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el total de la cuenta: ");
        int cuenta = sc.nextInt();

        System.out.print("Ingresa el porcentaje de propina: ");
        int porcentaje = sc.nextInt();

        if (cuenta <= 0) {
            System.out.println("Error: total invalido");
            sc.close();
            return;
        }

        if (porcentaje < 0 || porcentaje > 100){
            System.out.print("Error: porcentaje invalido");
            sc.close();
            return;
        }

        int propina = (cuenta * porcentaje) / 100;
        int total = cuenta + propina;

        System.out.println("Propina: " + (propina));
        System.out.println("Total a pagar: " + (total));

        if(porcentaje > 30){
            System.out.println("¡Propina generosa!");
        }else if(porcentaje < 5){
            System.out.println("Propina muy baja");
        }

        sc.close();
    }
}