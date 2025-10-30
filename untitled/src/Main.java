
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaSub editor=new ListaSub();

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        while (true ) {
         System.out.println("Editor de Subtitulos");
         System.out.println("1. Insertar subtitulo");
         System.out.println("2. Eliminar subtitulo");
         System.out.println("3. Mostrar subtitulos");
         System.out.println("4. Salir");
         System.out.println("Selecciona una opcion: ");

         int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
         System.out.println("Escribe el subtitulo");
         String texto = sc2.nextLine();

         System.out.println("Escribe el tiempo, ej [10.5]");
         double tiempo = sc.nextDouble();

        editor.insertarSub( texto,tiempo);
        break;

        case 2:
            System.out.println("Escribe el índice a eliminar, ej 1");
            int indice = sc.nextInt();
            editor.eliminarSub(indice);
            break;
            case 3:
                editor.mostrarSub();
                break;

            case 4:
                System.exit(0);
        default:
            System.out.println("Opcion no valida");
        }

        }
    }








}





