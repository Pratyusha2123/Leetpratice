public class FindTheFine {

    public long totalFine(int date, int car[], int fine[]) {
        long total = 0;

        for (int i = 0; i < car.length; i++) {
            if (date % 2 == 0 && car[i] % 2 != 0) {
                total += fine[i];
            }
            else if (date % 2 != 0 && car[i] % 2 == 0) {
                total += fine[i];
            }
        }

        return total;
    }

    public static void main(String[] args) {
        FindTheFine obj = new FindTheFine();

        int date = 12;
        int car[] = {2375, 7682, 2325, 2352};
        int fine[] = {250, 500, 350, 200};

        long result = obj.totalFine(date, car, fine);
        System.out.println("Output: " + result);
    }
}