public class RunningSneakers extends  Sneakers{
    public RunningSneakers(String name, double cost, String producerName, String country){
        super(name, cost, producerName, country);
        type = SneakersType.RUNNING;
    }
}
