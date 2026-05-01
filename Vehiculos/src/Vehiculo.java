public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
        setMarca(marca);
        setModelo(modelo);
        setVelocidadMaxima(velocidadMaxima);
    }

    /* Encapsulamiento con validaciones */

    public String getMarca() { return marca; }
    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            System.out.println("Error: La marca no puede estar vacía.");
            this.marca = "Genérica";
        } else {
            this.marca = marca;
        }
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            System.out.println("Error: El modelo no puede estar vacío.");
            this.modelo = "Básico";
        } else {
            this.modelo = modelo;
        }
    }

    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima < 0) {
            System.out.println("Error: La velocidad máxima no puede ser negativa. Se asignará 0.");
            this.velocidadMaxima = 0;
        } else {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    /* Método abstract para polimorfismo */

    public abstract double calcularConsumo();

    /* Método concreto */

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo +
                " | Velocidad Máx: " + velocidadMaxima + " km/h");
    }
}
