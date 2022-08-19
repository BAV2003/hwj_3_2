public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90;
        double height = 1.82;
        double bMi = service.calculate(weight,height);
        System.out.printf("%.2f",bMi);
    }
}
