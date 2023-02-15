package FactoryMethod;

public class BuildVechile {
    public SpeedInterface getVeicolo(Veicolo.VeicoloEnum veicolo){
        switch (veicolo){
            case AEREO: return new Aereo(55);
            case MOTO: return new Moto(44);
            case MACCHINA: return new Macchina(44);
            case TRENO: return new Treno(44);
            case BICICLETTA: return new Bicicletta(44);
            default: throw new RuntimeException("Non so che veicolo sia");
        }
    }
}
