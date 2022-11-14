public class Main {
    public static void main(String[] args) {
        Car toyota=new Toyota("Passo","white",5000);
        Car kia=new KIA("Rio","red",10000);
        toyota.gas();
        toyota.brake();
        kia.gas();
        kia.brake();



    }
}