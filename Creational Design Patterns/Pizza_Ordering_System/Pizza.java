public abstract class Pizza {
    protected String name;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }
}
