package Logica;

public class Motocicleta extends Vehiculo {
    
    public Motocicleta(double cilindraje, double peso, double tamanioTanque ){
        super(cilindraje, peso, tamanioTanque); //"CONTRATO"
    }

    @Override
    public double calcularAutonomia() { //MODIFICO METODO
        double autonomia = 8 * Math.pow(10,4) / ((cilindraje + 2* peso) *tamanioTanque);
                return autonomia;
    }
}
        