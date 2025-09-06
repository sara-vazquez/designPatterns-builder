package dev.sara.builderPattern;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HouseBuilderTest {

    private HouseBuilder builder; 
    
    @BeforeEach
    void setUp(){
        builder = new HouseBuilder();
    }

    @Test
    void testHouseBuilder_SimpleHouseHasGarage() {
        HouseEntity house = builder.buildGarage().build();

        assertThat(house.hasGarage(), is(true));
        assertThat(house.hasPool(), is(false));
        assertThat(house.hasGarden(), is(false));
        assertThat(house.hasFancyStatues(), is(false));
    }

    @Test
    void testHouseBuilder_SummerHouseHasPool() {
        HouseEntity house = builder.buildPool().build();

        assertThat(house.hasGarage(), is(false));
        assertThat(house.hasPool(), is(true));
        assertThat(house.hasGarden(), is(false));
        assertThat(house.hasFancyStatues(), is(false));
    }
    @Test
    void testHouseBuilder_RusticHouseHasGarden() {
        HouseEntity house = builder.buildGarden().build();

        assertThat(house.hasGarage(), is(false));
        assertThat(house.hasPool(), is(false));
        assertThat(house.hasGarden(), is(true));
        assertThat(house.hasFancyStatues(), is(false));
    }
    @Test
    void testHouseBuilder_FancyHouseHasFancyStatues() {
        HouseEntity house = builder.buildFancyStatues().build();

        assertThat(house.hasGarage(), is(false));
        assertThat(house.hasPool(), is(false));
        assertThat(house.hasGarden(), is(false));
        assertThat(house.hasFancyStatues(), is(true));
    }
}
