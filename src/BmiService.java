public class BmiService {
    public double calculate (int weight, int height) {

        double index = weight / (height * height);

        return index;
    }
}
