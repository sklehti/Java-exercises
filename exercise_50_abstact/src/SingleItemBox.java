import java.util.ArrayList;
import java.util.Collection;

public class SingleItemBox extends  Box {
    private Collection<Goods> list;

    public SingleItemBox () {
        this.list = new ArrayList<>();
    }
    @Override
    public void add(Goods goods) {
        if (this.list.isEmpty()) {
            this.list.add(goods);
        }
    }

    @Override
    public boolean IsInTheBox(Goods goods) {
       return this.list.contains(goods);
    }
}
