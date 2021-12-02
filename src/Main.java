public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bodyMassIndex = service.calculate (75, 180);
        //рост в сантиметрах, вес в кг
        System.out.println(bodyMassIndex);

    }
}