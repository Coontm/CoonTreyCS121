public class act21p1 {
    //inst variables)
    private String name;
    private int age;
    private String address;

    private static int numOfInstances = 0;

    //a constructor
    public act21p1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

        numOfInstances++;
    }

    //  static method that returns
    public static int getNumOfInstances() {
        return numOfInstances;
    }
}



