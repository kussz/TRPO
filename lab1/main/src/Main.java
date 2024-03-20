import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Sneakers[] sneakers = new Sneakers[]{
                new BasketballSneakers("Мокасины",100,"Adidas","Belarus"),
                new FootballSneakers("Туфли",99,"Nike","Belarus"),
                new BasketballSneakers("Шлепки",98,"asics","Belarus"),
                new RunningSneakers("Кеды",97,"BugsBunny","Belarus"),
                new BasketballSneakers("Тапки",96,"NewBalance","Belarus"),
                new FootballSneakers("Ботинки",95,"Adidas","Belarus"),
                new BasketballSneakers("Шлепки",94,"Adidas","Belarus"),
                new RunningSneakers("Кроссовки",93,"Adidas","Belarus"),
                new FootballSneakers("Кеды",92,"Adidas","Belarus"),
                new FootballSneakers("Мокасины",91,"Adidas","Belarus")
        };
    System.out.println("Количество производителей: "+ProducersQuantity(sneakers)+"\n");
    double[] prodAvgs = AverageProducerSum(sneakers);
    String[] producers = GetAllProducers(sneakers).toArray(new String[0]);
    double[] typeAvgs = AverageTypeSum(sneakers);
    SneakersType[] types = Sneakers.GetTypeArray();
        for (int i = 0; i < producers.length; i++) {
            System.out.println(producers[i]+": "+prodAvgs[i]);
        }
        System.out.println();
        for (int i = 0; i < types.length; i++) {
            System.out.println(types[i]+": "+typeAvgs[i]);
        }

    }

    /**
     *
     * @param sneakers Массив кроссовок.
     * @return Список, содержащий названия всех производителей.
     */
    public static List<String> GetAllProducers(Sneakers[] sneakers)
    {
        List<String> producersList = new ArrayList<String>();
        for( Sneakers sneaker : sneakers)
        {
            if(!producersList.contains(sneaker.GetProducerName()))
                producersList.add(sneaker.GetProducerName());
        }
        return producersList;
    }

    /**
     *
     * @param sneakers Массив кроссовок.
     * @return Количество производителей.
     */
    public static int ProducersQuantity(Sneakers[] sneakers)
    {
        return GetAllProducers(sneakers).size();
    }

    /**
     *
     * @param sneakers Массив кроссовок.
     * @return Средняя цена у каждого производителя.
     */
    public static double[] AverageProducerSum(Sneakers[] sneakers)
    {
        List<String>  producers = GetAllProducers(sneakers);
        List<Double> avgs = new ArrayList<Double>();
        for(String producer : producers)
        {
           avgs.add(Arrays.stream(sneakers).filter(sneaker -> sneaker.GetProducerName() == producer).mapToDouble(a->a.cost).average().orElse(0));
        }
        return avgs.stream().mapToDouble(i->i).toArray();
    }

    public static double[] AverageTypeSum(Sneakers[] sneakers)
    {
        SneakersType[] types = Sneakers.GetTypeArray();
        List<Double> avgs = new ArrayList<Double>();
        for(SneakersType type : types)
        {
            avgs.add(Arrays.stream(sneakers).filter(sneaker -> sneaker.type == type).mapToDouble(a->a.cost).average().orElse(0));
        }
        return avgs.stream().mapToDouble(i->i).toArray();
    }
}