import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int numberOfFlashCards = 0;

        System.out.println("How many flash cards do you need?");


        while (numberOfFlashCards <= 0) {
            System.out.println("Please enter a positive number");
            try {
                numberOfFlashCards = scanner.nextInt();

            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        }

        scanner.nextLine();

        for (int i = 0; i < numberOfFlashCards; i++) {
            FlashCard flashCard = new FlashCard();
            System.out.println("What is the question?");
            flashCard.setQuestion(scanner.nextLine());

            System.out.println("What is the answer?");
            flashCard.setAnswer(scanner.nextLine());

            deck.addCard(flashCard);
            System.out.println("Card added to deck");
        }


        for (FlashCard flashCard : deck.getDeck()) {
            System.out.println(flashCard.getQuestion());
            String givenAnswer = scanner.nextLine();

            while (!flashCard.checkAnswer(givenAnswer)) {
                System.out.println("Incorrect, try again:");
                givenAnswer = scanner.nextLine();
            }
            System.out.println("Correct");
        }

    }

}
