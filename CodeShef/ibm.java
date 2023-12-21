import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 class ibm {
    public static void findFloorSequence(String direction, int currentFloor, List<Integer> floorRequests) {
        if (!direction.equals("UP") && !direction.equals("DN")) {
            System.out.println("Invalid Input");
            return;
        }

        if (currentFloor < 0 || currentFloor > 15) {
            System.out.println("Invalid Input");
            return;
        }

        for (int request : floorRequests) {
            if (request < 0 || request > 15) {
                System.out.println("Invalid Input");
                return;
            }
        }

        List<Integer> stops = new ArrayList<>(floorRequests);

        if (direction.equals("UP")) {
            Collections.sort(stops);
            stops.removeIf(request -> request < currentFloor);
            stops.addAll(floorRequests);
            Collections.sort(stops);
        } else {
            Collections.sort(stops, Collections.reverseOrder());
            stops.removeIf(request -> request > currentFloor);
            stops.addAll(floorRequests);
            Collections.sort(stops, Collections.reverseOrder());
        }

        for (int stop : stops) {
            System.out.print(stop + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String direction = scanner.next().trim();
        int currentFloor = scanner.nextInt();
        int numRequests = scanner.nextInt();

        List<Integer> floorRequests = new ArrayList<>();
        for (int i = 0; i < numRequests; i++) {
            int request = scanner.nextInt();
            floorRequests.add(request);
        }

        findFloorSequence(direction, currentFloor, floorRequests);
    }
}
