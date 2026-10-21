import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int precio;
        int subtotal = 0;

        do {
            System.out.println("Ingresa el precio del producto (0 para terminar): ");
            precio = sc.nextInt();
            subtotal += precio;
        } while (precio != 0);

        int iva =  subtotal * 19 / 100;
        int total = iva + subtotal;

        System.out.println("Subotal : $ " + subtotal);
        System.out.println("IVA (19%) : $ " + iva);
        System.out.println("Total : $ " + total);
        sc.close();

        if (total > 50000) {
            int descuento = total * 10 / 100;
            int totalPagar = total - descuento;
            System.out.println("Total con IVA: $ " + total);
            System.out.println("Descuento 10%: $ " + descuento);
            System.out.println("Total a pagar: $ " + totalPagar);


        }

    }
}