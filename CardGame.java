// class CardGame to distribute shuffled cards to players
import java.util.Random;
import java.util.Scanner;

public class CardGame {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of players and cards per player
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        // Initialize and shuffle the deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Distribute and print the cards
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);
        if (players != null) {
            printPlayersCards(players);
        }

        scanner.close();
    }
	
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static int numOfCards = suits.length * ranks.length;

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > numOfCards) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

}

/*
Enter the number of players: 4
Enter the number of cards per player: 6
Player 1 cards:
  King of Hearts
  3 of Diamonds
  7 of Spades
  2 of Hearts
  King of Diamonds
  3 of Clubs

Player 2 cards:
  Ace of Spades
  10 of Hearts
  3 of Hearts
  4 of Clubs
  King of Spades
  Jack of Hearts

Player 3 cards:
  2 of Spades
  3 of Spades
  2 of Clubs
  7 of Clubs
  8 of Hearts
  4 of Hearts

Player 4 cards:
  5 of Clubs
  Jack of Spades
  Queen of Hearts
  7 of Diamonds
  Ace of Hearts
  9 of Hearts

*/