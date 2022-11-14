package TaskTeoriya17;

public class Main {public static void main(String[] args) {
    Cow cows1=new Cow(450,9,'F',"Merry");
    Cow cows2=new Cow(650,5,'M',"Micky");
    Cow cows3=new Cow(360,6,'F',"Sock");
    Cow cows4=new Cow(550,8,'M',"Chack");
    Cow cows5=new Cow(320,3,'F',"MuMu");
    Cow[]cows6={cows1,cows2,cows3,cows4,cows5};
    Cow[]cows7={cows1};

    Sheep sheep1=new Sheep(70,3,'F',"Rosy");
    Sheep sheep2=new Sheep(86,2,'M',"Hack");
    Sheep sheep3=new Sheep(90,1,'F',"Pig");
    Sheep[]sheep4={sheep1,sheep2,sheep3};
    Sheep[]sheep5={sheep3};

    Horse horses1=new Horse(310,10,'F',"Donna");
    Horse horses2=new Horse(480,7,'M',"Black");
    Horse[]horses3={horses1,horses2};
    Horse[]horses4={horses1};

    Farm farm1=new Farm("Mega Farm",cows6, sheep4,horses3, "Jack Rich ");
    Farm farm2=new Farm("Mimi Farm",cows7,sheep5,horses4,"Micki Mouse");
    System.out.println(farm1);
    System.out.println(farm2);
}
}
