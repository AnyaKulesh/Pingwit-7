package org.example.homework.lesson11.task2;
/*
Таромат. Создайте класс Tare, в котором должны быть следующие поля: название продукта и материал. Материалов может быть 3 вида:
пластик, стекло, алюминий.

 */
public  class Tare {
    private final String name;
    private final Material material;

    public Tare(String name, Material material) {
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Tare{" +
                "name='" + name + '\'' +
                ", material=" + material +
                '}';
    }
}
