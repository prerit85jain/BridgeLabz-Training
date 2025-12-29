package stackQueue;

public class CircularTour {

    static class Pump {
        int petrol;
        int distance;

        public Pump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(Pump[] pumps) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int startingIndex = 0;

        for (int i = 0; i < pumps.length; i++) {
            int netPetrol = pumps[i].petrol - pumps[i].distance;
            totalSurplus += netPetrol;
            currentSurplus += netPetrol;

            if (currentSurplus < 0) {
                startingIndex = i + 1;
                currentSurplus = 0;
            }
        }

        if (totalSurplus < 0) {
            return -1;
        } else {
            return startingIndex;
        }
    }

    public static void main(String[] args) {
        Pump[] pumps = {
            new Pump(6, 4),
            new Pump(3, 6),
            new Pump(7, 3),
            new Pump(4, 5)
        };

        int startPoint = findStartingPoint(pumps);
        if (startPoint != -1) {
            System.out.println("Start at pump index: " + startPoint);
        } else {
            System.out.println("No circular tour is possible");
        }
    }
}