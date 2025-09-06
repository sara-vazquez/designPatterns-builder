package dev.sara.builderPattern;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HouseDirectorTest {
    private HouseDirector director;

    @BeforeEach
    void setUp() {
        director = new HouseDirector(new HouseBuilder());
    }

    @Test
    void testHouseDirector_ConstructSimpleHouse() {
        HouseEntity house = director.constructSimpleHouse();
        assertThat(house.hasGarage(), is(true));
        assertThat(house.hasPool(), is(false));
        assertThat(house.hasGarden(), is(false));
        assertThat(house.hasFancyStatues(), is(false));
    }

    @Test
    void testHouseDirector_ConstructSummerHouse() {
        HouseEntity house = director.constructSummerHouse();
        assertThat(house.hasGarage(), is(false));
        assertThat(house.hasPool(), is(true));
        assertThat(house.hasGarden(), is(false));
        assertThat(house.hasFancyStatues(), is(false));
    }

    @Test
    void testHouseDirector_ConstructRusticHouse() {
        HouseEntity house = director.constructRusticHouse();
        assertThat(house.hasGarage(), is(false));
        assertThat(house.hasPool(), is(false));
        assertThat(house.hasGarden(), is(true));
        assertThat(house.hasFancyStatues(), is(false));
    }

    @Test
    void testHouseDirector_ConstructFancyHouse() {
        HouseEntity house = director.constructFancyHouse();
        assertThat(house.hasGarage(), is(false));
        assertThat(house.hasPool(), is(false));
        assertThat(house.hasGarden(), is(false));
        assertThat(house.hasFancyStatues(), is(true));
    }
}
