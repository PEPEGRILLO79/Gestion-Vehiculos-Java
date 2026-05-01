public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, double velocidadMaxima, int cantidadPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public double calcularConsumo() {
        return 7.5;
    } /* Implementación específica simulada */

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puertas: " + cantidadPuertas);
    }
}

/*Motocicleta.java*/

class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, double velocidadMaxima, int cilindrada) {
        super(marca, modelo, velocidadMaxima);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularConsumo() {
        return 3.2;
    } /* Consumo específico */

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}

/*Camion.java*/

class Camion extends Vehiculo {
    private double capacidadCarga; // toneladas

    public Camion(String marca, String modelo, double velocidadMaxima, double capacidadCarga) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularConsumo() {
        return 15.0 + (capacidadCarga * 0.5);
    } /* Cálculo dinámico */

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad de carga: " + capacidadCarga + " Ton.");
    }
}

/*Autobus.java*/
class Autobus extends Vehiculo {
    private int cantidadPasajeros;

    public Autobus(String marca, String modelo, double velocidadMaxima, int cantidadPasajeros) {
        super(marca, modelo, velocidadMaxima);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public double calcularConsumo() {
        return 12.0;
    } /* Consumo estándar */

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Pasajeros: " + cantidadPasajeros);
    }
}
