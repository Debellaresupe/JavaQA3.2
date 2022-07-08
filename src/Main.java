public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        int bodyMass = 105; // Масса тела в киллограммах
        double bodyHeight = 1.75; // Рост в метрах
        double bMI = service.calculate(bodyMass, bodyHeight);
        System.out.println("Масса тела: " + bodyMass);
        System.out.println("Рост: " + bodyHeight);
        System.out.printf("Индекс массы тела: " + "%.1f",bMI);

    }
}
