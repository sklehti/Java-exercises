public class Tank {
    private int content;

    public Tank() {
        this.content = 0;
    }

    public int content () {
        return this.content;
    }

    public void add (int amount) {
        if (amount > 0) {
            this.content += amount;

            if (this.content > 100) {
                this.content = 100;
            }
        }
    }

    public void remove (int amount) {
        if (amount > 0) {
            this.content -= amount;

            if (this.content < 0) {
                this.content = 0;
            }
        }
    }

    public String toString () {
        return this.content + "/100";
    }

 }
