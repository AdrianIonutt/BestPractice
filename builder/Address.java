package builder;

public class Address{
    private String country;
    private String address;
    private String postalCode;

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }
    //CREAZIONE CLASSE BUILDER STATICA
    public static class AddressBuilder{
        //CREO VARIABILE ISTANZA DI TIPO ADDRESS
        private final Address address;
        //CREO UN COSTRUTTORE PRIVATO
        public AddressBuilder(){
            this.address = new Address();
        }
        //METODO CHE APRE LA POSSIBILITA' DI CREARE L'ISTANZA SENZA UTILIZZARE IL NEW
        public static AddressBuilder builder(){
            return new AddressBuilder();
        }
        //METODO DI CHIUSURA CHE CI RITORNA IL TUTTO
        public Address build(){
            return this.address;
        }
        //METODO SET COUNTRY
        public AddressBuilder setCountry(String country){
            this.address.country = country;
            return this;
        }
        //METODO SET ADDRESS
        public AddressBuilder setAddress(String address){
            this.address.address = address;
            return this;
        }
        //METODO SET POSTALCODE
        public AddressBuilder setPostalCode(String postalCode){
            this.address.postalCode = postalCode;
            return this;
        }

    }

}
