# 🏗 Builder pattern

## 🏘 About
Starting from the "House" entity, I had to implement the Builder design pattern to allow the "House" entity to construct different types of houses. Each type of house should represent a specific combination of attributes (garage, garden, pool and fancy statues).

## 📈 Class diagram
```mermaid
---
config:
  theme: 'forest'
---
classDiagram
    class HouseEntity {
        - boolean garage
        - boolean pool
        - boolean garden
        - boolean fancyStatues
        + hasGarage() boolean
        + hasPool() boolean
        + hasGarden() boolean
        + hasFancyStatues() boolean
        + toString() String
    }

    class IBuilder {
        <<interface>>
        + buildGarage() IBuilder
        + buildPool() IBuilder
        + buildGarden() IBuilder
        + buildFancyStatues() IBuilder
        + build() HouseEntity
    }

    class HouseBuilder {
        - boolean garage
        - boolean pool
        - boolean garden
        - boolean fancyStatues
        + buildGarage() IBuilder
        + buildPool() IBuilder
        + buildGarden() IBuilder
        + buildFancyStatues() IBuilder
        + build() HouseEntity
    }

    class HouseDirector {
        - IBuilder builder
        + HouseDirector(IBuilder builder)
        + constructSimpleHouse() HouseEntity
        + constructSummerHouse() HouseEntity
        + constructRusticHouse() HouseEntity
        + constructFancyHouse() HouseEntity
    }

    IBuilder <|.. HouseBuilder
    HouseEntity <-- HouseBuilder
    HouseDirector o-- IBuilder

```

## 🧪 Test coverage
![test coverage screenshoot](src/coverage-builder.png)
