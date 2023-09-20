import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Goods> goodsArray;
    private int maxWeght;


    public Suitcase(int w) {
        this.goodsArray = new ArrayList<>();
        this.maxWeght = w;
    }

    public void addGoods (Goods goods) {


        if (this.coWeight() + goods.getWeight() <= this.maxWeght) {
            this.goodsArray.add(goods);

        }

    }

    public void printGoods () {
        for (Goods g: this.goodsArray) {
            System.out.println(g);
        }
    }

    public int coWeight () {
        int wholeWeight = 0;

        for (Goods g: this.goodsArray) {
            wholeWeight += g.getWeight();
        }
        return wholeWeight;
    }

    public Goods heviest () {
        if (!this.goodsArray.isEmpty()) {
            Goods heviest = this.goodsArray.get(0);

            for (Goods g: this.goodsArray) {
                if (heviest.getWeight() < g.getWeight()) {
                    heviest = g;
                }
            }
            return heviest;
        }
        return  null;
    }

    public String toString () {
        if (this.goodsArray.size() < 1) {
            return "ei tavaroita (" + this.coWeight() + " kg)";
        } else if (this.goodsArray.size() == 1) {
            return this.goodsArray.size() + " tavara (" + this.coWeight() + " kg)";
        }
        return this.goodsArray.size() + " tavaraa (" + this.coWeight() + " kg)";
    }
}
