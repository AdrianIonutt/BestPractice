package FactoryMethod;

public class Veicolo implements SpeedInterface{
    private int speed;
    public Veicolo(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }
    public enum VeicoloEnum{
        MACCHINA,
        MOTO,
        TRENO,
        AEREO,
        BICICLETTA;
    }
}
