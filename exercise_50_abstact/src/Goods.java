import java.util.Objects;

public class Goods{
    private String name;
    private int weight;


    public Goods(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Goods(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}
