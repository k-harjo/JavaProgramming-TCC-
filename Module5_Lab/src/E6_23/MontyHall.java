package E6_23;

import java.util.Random;

public class MontyHall {
    public static void main(String[] args) {
        int totalIterations = 1000;
        int switchWins = 0;
        int stickWins = 0;

        Random random = new Random();

        for (int i = 0; i < totalIterations; i++) {
            // Randomly place the car behind one of the doors
            int carBehindDoor = random.nextInt(3) + 1;

            // Player randomly picks a door
            int playerChoice = random.nextInt(3) + 1;

            // Host opens a door with a goat that the player did not choose
            int hostOpensDoor;
            do {
                hostOpensDoor = random.nextInt(3) + 1;
            } while (hostOpensDoor == playerChoice || hostOpensDoor == carBehindDoor);

            // Player switches to the other unopened door
            int switchedDoor;
            do {
                switchedDoor = random.nextInt(3) + 1;
            } while (switchedDoor == playerChoice || switchedDoor == hostOpensDoor);

            // Check if the player won by switching or sticking
            if (switchedDoor == carBehindDoor) {
                switchWins++;
            } else if (playerChoice == carBehindDoor) {
                stickWins++;
            }
        }

        // Print the results
        System.out.println("Wins by switching: " + switchWins);
        System.out.println("Wins by sticking: " + stickWins);
    }
}
