import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class MaxWeightBox extends  Box {
    private int maxWeight;

    private Collection<Goods> list;

    public MaxWeightBox (int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();

    }
    @Override
    public void add(Goods goods) {
        int totalWeigth = 0;

        for (Goods w: this.list) {
            totalWeigth += w.getWeight();
        }

        if ((totalWeigth + goods.getWeight()) <= this.maxWeight) {
            this.list.add(goods);
        }
    }

    @Override
    public boolean IsInTheBox(Goods goods) {
        return this.list.contains(goods);
    }
}
