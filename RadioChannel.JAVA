
class RadioChannel {

    boolean isQuestionTurn = true;

    // Question method
    public synchronized void askQuestion(String msg) {

        while (!isQuestionTurn) {
            try {
                wait();
            } catch (Exception e) {}
        }

        System.out.println("Q: " + msg);
        isQuestionTurn = false;
        notify();
    }

    // Answer method
    public synchronized void answerQuestion(String msg) {

        while (isQuestionTurn) {
            try {
                wait();
            } catch (Exception e) {}
        }

        System.out.println("A: " + msg);
        isQuestionTurn = true;
        notify();
    }
}

// Thread for questions
class QuestionThread extends Thread {

    RadioChannel rc;
    String[] questions = {"Hi?", "How are you?", "What are you doing?"};

    QuestionThread(RadioChannel rc) {
        this.rc = rc;
    }

    public void run() {
        for (String q : questions) {
            rc.askQuestion(q);
        }
    }
}

// Thread for answers
class AnswerThread extends Thread {

    RadioChannel rc;
    String[] answers = {"Hello!", "I am fine.", "Studying Java."};

    AnswerThread(RadioChannel rc) {
        this.rc = rc;
    }

    public void run() {
        for (String a : answers) {
            rc.answerQuestion(a);
        }
    }
}

// Main class
public class Assignment3 {
    public static void main(String[] args) {

        RadioChannel rc = new RadioChannel();

        QuestionThread t1 = new QuestionThread(rc);
        AnswerThread t2 = new AnswerThread(rc);

        t1.start();
        t2.start();
    }
}
