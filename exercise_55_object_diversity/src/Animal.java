abstract class Animal {
    private String name;
    public Animal (String name) {
        this.name = name;
    }

    public void eat () {
        System.out.println(this.name + " syö");
    }

    public void sleep () {
        System.out.println(this.name + " nukkuu");
    }
    public String getName() {
        return name;
    }
}
