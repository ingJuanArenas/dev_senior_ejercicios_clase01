import java.util.Scanner;
public class TresPalabras {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        String palabra1;
        String palabra2;
        String palabra3;
        System.out.println("Ingrese la palabra 1: ");
        palabra1=entrada.nextLine();
        System.out.println("Ingrese la palabra 2: ");
        palabra2=entrada.nextLine();
        System.out.println("Ingrese la palabra 3: ");
        palabra3=entrada.nextLine();
        entrada.close();
        System.out.println(palabra1+" "+palabra2+" "+palabra3);
    }
}
