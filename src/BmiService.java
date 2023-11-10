public class BmiService {
    /**
     * Расчет индекса массы тела
     * height - рост в метрах
     * weight - вес в кг
     * return - индекс массы тела
     */
    public int calculate(double height, int weight) {
        int index = (int) (weight / Math.pow(height, 2));
        return index;
    }
}