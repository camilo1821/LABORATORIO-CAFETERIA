import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        int total = 0;

        System.out.print("---Menú de la Cafetería---\n");
        System.out.print("1. Café ($4000)\n");
        System.out.print("2. Muffin ($3500)\n");
        System.out.print("3. Sandwich ($7500)\n");
        System.out.print("4. Jugo ($5000)\n");
        System.out.print("5. Té ($3000)\n");
        System.out.print("6. Salir\n");

        do {
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> total += 4000;
                case 2 -> total += 3500;
                case 3 -> total += 7500;
                case 4 -> total += 5000;
                case 5 -> total += 3000;
                case 6 -> System.out.println("");
                default -> System.out.println("Opción Inválida");
            }
        }while (opcion != 6);

        System.out.println("Total del pedido : $ " + total);
        sc.close();
    }
}