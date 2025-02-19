package Logica;

public class Automovil extends Vehiculo {
    
    public Automovil(double cilindraje, double peso, double tamanioTanque ){
        super(cilindraje, peso, tamanioTanque); //CUMPLIMOS ATRIBUTOS "CONTRATO"
    }

    @Override
    public double calcularAutonomia() { //MODIFICO METODO
        double autonomia = 15 * Math.pow(10,4) / ((cilindraje + peso) *tamanioTanque);
                return autonomia;
    }
}
        
            
