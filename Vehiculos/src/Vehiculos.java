import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> flota = new ArrayList<>(); /* Colección dinámica */
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== GESTIÓN DE VEHÍCULOS ===");
            System.out.println("1. Agregar un nuevo vehículo");
            System.out.println("2. Mostrar todos los vehículos registrados");
            System.out.println("3. Calcular consumo de todos los vehículos");
            System.out.println("4. Créditos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); /* Limpiar buffer */

            switch (opcion) {
                case 1:
                    System.out.println("Tipo: 1.Auto | 2.Moto | 3.Camión | 4.Autobús");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Marca: "); String ma = sc.nextLine();
                    System.out.print("Modelo: "); String mo = sc.nextLine();
                    System.out.print("Velocidad Máx: "); double vm = sc.nextDouble();

                    if (tipo == 1) {
                        System.out.print("Puertas: "); int p = sc.nextInt();
                        flota.add(new Auto(ma, mo, vm, p));
                    } else if (tipo == 2) {
                        System.out.print("Cilindrada: "); int c = sc.nextInt();
                        flota.add(new Motocicleta(ma, mo, vm, c));
                    } else if (tipo == 3) {
                        System.out.print("Carga (Ton): "); double ca = sc.nextDouble();
                        flota.add(new Camion(ma, mo, vm, ca));
                    } else if (tipo == 4) {
                        System.out.print("Pasajeros: "); int pas = sc.nextInt();
                        flota.add(new Autobus(ma, mo, vm, pas));
                    }
                    System.out.println("Vehículo agregado correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE VEHÍCULOS ---");
                    for (Vehiculo v : flota) {
                        v.mostrarInformacion();
                    } /* Uso de métodos concretos */
                    break;

                case 3:
                    System.out.println("\n--- CONSUMO CALCULADO (POLIMORFISMO) ---");
                    for (Vehiculo v : flota) {
                        System.out.println(v.getMarca() + " " + v.getModelo() +
                                ": " + v.calcularConsumo() + " L/100km");
                    } /* Polimorfismo: llama al método real de cada objeto */
                    break;

                case 4:
                    System.out.println("\n--- CRÉDITOS ---");
                    System.out.println("Desarrollado por Adrián.");

                case 5:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}