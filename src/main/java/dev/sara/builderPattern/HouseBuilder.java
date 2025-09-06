package dev.sara.builderPattern;

public class HouseBuilder implements IBuilder {

    private boolean garage;
    private boolean pool;
    private boolean garden;
    private boolean fancyStatues;
    
    @Override
    public IBuilder buildGarage() {
        this.garage = true;
        return this;
    }

    @Override
    public IBuilder buildPool() {
        this.pool = true;
        return this;
    }

    @Override
    public IBuilder buildGarden() {
        this.garden = true;
        return this;
    }

    @Override
    public IBuilder buildFancyStatues() {
        this.fancyStatues = true;
        return this;
    }

    //Reseteamos los atributos para que no salgan en todas las casas
    @Override
    public HouseEntity build() {
       HouseEntity house = new HouseEntity(garage, pool, garden, fancyStatues);
        this.garage = false;
        this.pool = false;
        this.garden = false;
        this.fancyStatues = false;

        return house;
    }

}
