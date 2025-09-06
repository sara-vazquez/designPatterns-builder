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

    @Override
    public HouseEntity build() {
        return new HouseEntity(garage, pool, garden, fancyStatues);
    }

}
