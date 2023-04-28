public class act21p2 {
    public static void main(String[] args) {
        act21p1 instance1 = new act21p1("Trey Coon", 20, "1401 N Woodridge");
        act21p1 instance2 = new act21p1("Jamie Coon", 38, "402 N 200 W");

        System.out.println(instance1.getNumOfInstances()); //
        System.out.println(instance2.getNumOfInstances()); //

        System.out.println(act21p1.getNumOfInstances()); //
    }
}
