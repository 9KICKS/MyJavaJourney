package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
        Car folaCar = new Car("A5", "2021", 3000000.00);
        Car joshCar = new Car("Camry", "2021", 500000.00);
        System.out.println(folaCar.getPrice());
        System.out.println(joshCar.getPrice());
    }
}
