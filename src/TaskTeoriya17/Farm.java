package TaskTeoriya17;

import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Sheep[]sheep;
    private Horse[]horses;
    private String OwnerName;

    public Farm(String address, Cow[] cows, Sheep[] sheep, Horse[] horses, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
        OwnerName = ownerName;
    }



    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheep=" + Arrays.toString(sheep) +
                ", horses=" + Arrays.toString(horses) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}
