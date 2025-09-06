package dev.sara.builderPattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderPatternApplication {

	public static void main(String[] args) {
		IBuilder builder = new HouseBuilder();
		HouseDirector director  = new HouseDirector(builder);

		HouseEntity simpleHouse = director.constructSimpleHouse();
		HouseEntity summerHouse = director.constructSummerHouse();
		HouseEntity rusticHouse = director.constructRusticHouse();
		HouseEntity fancyHouse = director.constructFancyHouse();

		System.out.println(simpleHouse);
		System.out.println(summerHouse);
		System.out.println(rusticHouse);
		System.out.println(fancyHouse);

	}

}
