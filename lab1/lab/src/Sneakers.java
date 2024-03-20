import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sneakers {
    String name;
    double cost;
    SneakersType type;
    Producer producer;

    /**
     *
     * @param name Название кроссовок
     * @param cost Цена кроссовок
     * @param producerName Название производителя
     * @param country Страна производителя
     */
    Sneakers(String name, double cost, String producerName, String country) {
        this.name = name;
        this.cost = cost;
        this.producer = new Producer(producerName, country);
    }

    /**
     * @return Страна производителя кроссовок
     */
    public String GetProducerName()
    {
        return producer.name;
    }
    public static SneakersType[] GetTypeArray()
    {
        return SneakersType.values();
    }

    private class Producer {
        String name;
        String country;

        /**
         *
         * @param name Название бренда
         * @param country Страна производителя
         */
        Producer(String name, String country) {
            this.name = name;
            this.country = country;
        }
    }
}