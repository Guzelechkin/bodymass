public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.87;                                              /* рост в м */
        int weightKg = 98;                                              /* вес в кг */
        int index = service.calculate(heightMeter, weightKg);

        System.out.println("Индекс массы тела: " + index + " кг/кв.м");
    }
}