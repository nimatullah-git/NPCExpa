/**
 * @author nimatullah
 */
public class HareCarrotsGreedy {
    public static void main(String[] args) {
        int[] fieldCarrots = {10, 20, 30, 40, 50}; // количество моркови на каждой полянке (пример)
        int maxWeightPerTrip = 5;
        int totalTrips = 10;
        int totalCarrotsCollected = 0;

        for (int trip = 0; trip < totalTrips; trip++) {
            int maxFieldIndex = -1;
            int maxCarrots = 0;

            for (int i = 0; i < fieldCarrots.length; i++) {
                if (fieldCarrots[i] > 0 && fieldCarrots[i] > maxCarrots) {
                    maxFieldIndex = i;
                    maxCarrots = fieldCarrots[i];
                }
            }

            if (maxFieldIndex != -1) {
                int collectedCarrots = Math.min(maxWeightPerTrip, fieldCarrots[maxFieldIndex]);
                fieldCarrots[maxFieldIndex] -= collectedCarrots;
                totalCarrotsCollected += collectedCarrots;
            }
        }

        System.out.println("Total carrots collected (Greedy): " + totalCarrotsCollected);
    }
}
