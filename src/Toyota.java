public class Toyota extends Car{
    public Toyota(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("AI-95");

    }

    @Override
    public void brake() {
        System.out.println("Brake system is good ");

    }
}
