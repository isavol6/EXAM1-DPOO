package Presentacion;
import Logica.Automovil;
import Logica.Motocicleta;

public class Principal {

    public static void main(String[] Args){
        Automovil tukTuk = new Automovil (10, 500, 14);
        Motocicleta volMovil = new Motocicleta(8, 250, 5);

        double autonomiaTuk = tukTuk.calcularAutonomia();
        double autonomiaVol = volMovil.calcularAutonomia();
        System.out.println("La autonomía de un vehículo es la cantidad de kilómetros que puede avanzar con el tanque de combustible lleno.");
        System.out.println("La autonomia del automóvil TUKTUK es de " + autonomiaTuk + "kilómetros");
        System.out.println("La autonomía de la motocicleta VOLMOVIL es de " + autonomiaVol + "kilómetros");

    }
    
}
