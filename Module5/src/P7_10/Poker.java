package P7_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> deck = new ArrayList<>();
        ArrayList<String> playerHand = new ArrayList<>();
        Collections.shuffle(deck);
        drawCards(deck, playerHand, 5);
        System.out.println("Your hand: " + playerHand);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the positions of cards to replace (e.g., 1 3 4): ");
        String input = scanner.nextLine();
        String[] positions = input.split(" ");
        for (String position : positions) {
            int index = Integer.parseInt(position) - 1;
            drawCards(deck, playerHand, 1, index);
        }
        System.out.println("Your final hand: " + playerHand);
        int payout = evaluateHand(playerHand);
        System.out.println("Payout: " + payout);
    }

    private static ArrayList<String> initializeDeck() {
        ArrayList<String> deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        return deck;
    }

    private static void drawCards(ArrayList<String> deck, ArrayList<String> hand, int count) {
        for (int i = 0; i < count; i++) {
            hand.add(deck.remove(0));
        }
    }

    private static void drawCards(ArrayList<String> deck, ArrayList<String> hand, int count, int index) {
        for (int i = 0; i < count; i++) {
            hand.set(index, deck.remove(0));
        }
    }

    private static int evaluateHand(ArrayList<String> hand) {
        return 0;
    }
}
