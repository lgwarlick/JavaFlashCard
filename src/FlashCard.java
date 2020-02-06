public class FlashCard {
    private long ID;
    private String question;
    private String answer;

    public FlashCard(long ID, String question, String answer) {
        this.ID = ID;
        this.question = question;
        this.answer = answer;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
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
}
