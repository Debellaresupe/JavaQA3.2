public class BodyMassIndexService {
    public double calculate(int bodyMass, double bodyHeight) {
        double bodyMassIndex;
        bodyMassIndex = bodyMass / (bodyHeight * bodyHeight);
        return bodyMassIndex;
    }
}
