package dev.sara.builderPattern;

public interface IBuilder {
    IBuilder buildGarage();
    IBuilder buildPool();
    IBuilder buildGarden();
    IBuilder buildFancyStatues();
}
