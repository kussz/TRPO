public class BasketballSneakers extends Sneakers{
    public BasketballSneakers(String name, double cost, String producerName, String country){
        super(name, cost, producerName, country);
        type = SneakersType.BASKETBALL;
    }

}
