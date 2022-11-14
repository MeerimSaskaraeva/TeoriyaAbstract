public class KIA extends Car{
    public KIA(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("AI-100");

    }

    @Override
    public void brake() {
        System.out.println("Brake does not work");

    }
}
