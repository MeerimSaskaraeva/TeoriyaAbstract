package TaskTeoriya17;

public abstract class Animal {
    private int weight;
    private int age;
    private char gender;
    private String nickName;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Animal(int weight, int age, char gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;


    }

    @Override
    public String toString() {
        return "\nAnimal{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", \nnickName='" + nickName + '\'' +
                '}';
    }
}
