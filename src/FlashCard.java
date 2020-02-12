public class FlashCard {

    private String question;
    private String answer;
    public FlashCard() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * Check's the user's answer against the one provided to the flashcard
     * Not case sensitive
     * @param givenAnswer is the user's answer
     * @return boolean check
     */
    public boolean checkAnswer(String givenAnswer) {
        return (givenAnswer.equalsIgnoreCase(getAnswer()));
    }

}
