package de.ilume.HelloWorldBackend.model;

public class Furniture {
    int FurnitureId;
    String furnitureName;

    public int getFurnitureId() {
        return FurnitureId;
    }

    public void setFurnitureId(int furnitureId) {
        FurnitureId = furnitureId;
    }

    public String getFurnitureName() {
        return furnitureName;
    }

    public void setFurnitureName(String furnitureName) {
        this.furnitureName = furnitureName;
    }
}
