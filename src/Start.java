import java.util.Scanner;

public class Start {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        FlashCard flashCard = new FlashCard(deck.getNextCardID());



        System.out.println("Create the first flash card");
        System.out.println("What is the question?");
        flashCard.setAnswer(scanner.nextLine());

        System.out.println("What is the answer");
        flashCard.setAnswer(scanner.nextLine());

        deck.addCard(flashCard);


    }



}
