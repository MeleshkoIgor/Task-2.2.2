public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 76;
        int height = 176;
        double index = service.calculate();

        System.out.println(index);
    }
}
