package builder;

public class Item {
    private int id;
    private double cost;
    private String name;
    private String description;

    public static class ItemBuilder{
        private final Item item;
        public ItemBuilder(){
            this.item= new Item();
        }
        public static ItemBuilder builder(){
            return new ItemBuilder();
        }
        public Item build(){
            return this.item;
        }
        public ItemBuilder setID(int id){
            this.item.id = id;
            return this;
        }
        public ItemBuilder setCost(double cost){
            this.item.cost = cost;
            return this;
        }
        public ItemBuilder setName(String name){
            this.item.name = name;
            return this;
        }
        public ItemBuilder setDEscription(String description){
            this.item.description = description;
            return this;
        }
    }
}
