import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la bebida: ");
        String bebida = sc.nextLine();

        System.out.print("Ingresa la temperatura: ");
        double temperatura = sc.nextDouble();

        String temperaturaFinal;

        if(temperatura > 60){
            temperaturaFinal = "Caliente";
        }else if(temperatura >= 30 && temperatura <= 60){
            temperaturaFinal = "Templada";
        }else {
            temperaturaFinal ="Fría";
        }

        System.out.println(bebida + ": " + temperaturaFinal);

        sc.close();
    }
}