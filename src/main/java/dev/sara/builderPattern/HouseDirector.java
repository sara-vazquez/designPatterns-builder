package dev.sara.builderPattern;

public class HouseDirector {
    private final IBuilder builder;

    public HouseDirector(IBuilder builder) {
        this.builder = builder;
    }

    //construimos una casa con garaje
    public HouseEntity constructSimpleHouse() {
        return builder
               .buildGarage()
               .build();
    }

    //construimos la casa con piscina
    public HouseEntity constructSummerHouse() {
        return builder
               .buildPool()
               .build();
    }

    //esta solo con jardin
    public HouseEntity constructRusticHouse() {
        return builder
               .buildGarden()
               .build();
    }

    //esta para las estatuas
    public HouseEntity constructFancyHouse() {
        return builder
               .buildFancyStatues()
               .build();
    }
}
