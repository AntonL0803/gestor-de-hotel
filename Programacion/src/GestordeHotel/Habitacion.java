package GestordeHotel;

import java.util.Scanner;

public abstract class Habitacion extends Hotel{
    private String tipo;
    private int numeroHab;
    private double precioNoche;
    private boolean disponibilidad;

    public Habitacion(String tipo, int numeroHab, double precioNoche) {
        this.tipo = tipo;
        while (numeroOcupado(numeroHab)) {
            numeroHab++;
        }
        this.numeroHab = numeroHab;
        this.precioNoche = precioNoche;
        this.disponibilidad = false;
    }

    public int getNumeroHab() {
        return numeroHab;
    }

    public void setNumeroHab(int numeroHab) {
        this.numeroHab = numeroHab;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    private boolean numeroOcupado(int numero) {
        for (Habitacion habitacion : super.getHabitaciones()) {
            if (habitacion.getNumeroHab() == numero) {
                return true;
            }
        }
        return false;
    }

    public abstract void cambiarDatos();

    public abstract boolean disponibleParaFecha(String fechaInicio, String fechaFin);
    @Override
    public String toString() {
        return "Habitacion:\n" +
                "tipo='" + tipo + '\'' +
                ", numeroHab=" + numeroHab +
                ", precioNoche=" + precioNoche +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
