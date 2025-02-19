package Logica;

public abstract class Vehiculo {
    protected double cilindraje; //ATRIBUTOS DE TODOS LOS VEHICULOS
    protected double peso;
    protected double tamanioTanque;

    public Vehiculo(double cilindraje, double peso, double tamanioTanque){ //CONSTRUCTOR DE LA CLASE VEHICULO
        this.cilindraje = cilindraje;
        this.peso = peso;
        this.tamanioTanque = tamanioTanque;
    }

    public double getCilindraje(){ //GETTERS
        return cilindraje;
    }
    public double getPeso(){
        return peso;
    }
    public double getTamanioTanque(){
        return tamanioTanque;
    }
    public void setCilindraje(double cilindraje){ //SETTERS
        this.cilindraje = cilindraje;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setTamanioTanque(double tamanioTanque) {
        this.tamanioTanque = tamanioTanque;
    }
    
    public abstract double calcularAutonomia(); //METODO ABSTRACTO PARA TODOS LOS VEHICULOS

}
