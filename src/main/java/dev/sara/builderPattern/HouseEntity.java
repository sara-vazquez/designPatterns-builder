package dev.sara.builderPattern;

public class HouseEntity {
    private final boolean garage;
    private final boolean pool;
    private final boolean garden;
    private final boolean fancyStatues;

    protected HouseEntity(boolean garage, boolean pool, boolean garden, boolean fancyStatues) {
        this.garage = garage;
        this.pool = pool;
        this.garden = garden;
        this.fancyStatues = fancyStatues;
    }

    public boolean hasGarage() {
        return garage;
    }

    public boolean hasPool() {
        return pool;
    }

    public boolean hasGarden() {
        return garden;
    }

    public boolean hasFancyStatues() {
        return fancyStatues;
    }

    /*Para poder ver las casas en consola 
    y no salga por defecto la dirección de la memoria */
    @Override
    public String toString() {
        return "House Entity{" +
        "garage=" + garage +
        ", garden=" + garden +
            ", pool=" + pool +
            ", fancyStatues=" + fancyStatues +
            '}';
    }
}
    


