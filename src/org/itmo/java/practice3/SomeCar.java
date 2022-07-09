package org.itmo.java.practice3;

/* Task 2 */
public class SomeCar {
    private ColorRange colorRange;
    private String name;
    private Integer weight;

    public SomeCar() {
    }

    public SomeCar(ColorRange colorRange) {
        this.colorRange = colorRange;
    }

    public SomeCar(ColorRange colorRange, Integer weight) {
        this.colorRange = colorRange;
        this.weight = weight;
    }

    public SomeCar(ColorRange colorRange, String name, Integer weight) {
        this.colorRange = colorRange;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " {" +
                "colorRange=" + colorRange +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String showCarFeatures() {
        this.colorRange = ColorRange.valueOf(colorRange.toString());
        this.weight = Integer.valueOf(weight.toString());
        return name + " " + colorRange + " " + weight + " kg";
    }

    public ColorRange getColorRange() {
        return colorRange;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setColor(ColorRange colorRange) {
        this.colorRange = colorRange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        SomeCar car1 = new SomeCar(ColorRange.BLACK, "KIA", 1550);
        System.out.println(car1.showCarFeatures());
        SomeCar car2 = new SomeCar(ColorRange.RED, "Skoda", 1200);
        System.out.println(car2.showCarFeatures());

        SomeCar car3 = new SomeCar(ColorRange.RED, 1200);
        System.out.println(car3.showCarFeatures());
    }
}
