public class FootballSneakers extends Sneakers{
    public FootballSneakers(String name, double cost, String producerName, String country){
        super(name, cost, producerName, country);
        type = SneakersType.FOOTBALL;
    }
}
