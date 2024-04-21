import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class QuizQuestion {
    private String question;
    private ArrayList<String> options;
    private int correctOptionIndex;

    public QuizQuestion(String question, ArrayList<String> options, int correctOptionIndex) {
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
}

public class QuizApp {
    private static ArrayList<QuizQuestion> questions = new ArrayList<>();
    private static int currentQuestionIndex = 0;
    private static int score = 0;
    private static Timer timer = new Timer();

    public static void main(String[] args) {
        initializeQuestions();

        startQuiz();
    }

    private static void initializeQuestions() {
        // Sample quiz questions
        ArrayList<String> options1 = new ArrayList<>();
        options1.add("A. New Delhi");
        options1.add("B. Hyderabad");
        options1.add("C. Mumbai");
        options1.add("D. Kolkata");
        questions.add(new QuizQuestion("What is the Capital of India?", options1, 0)); 
        ArrayList<String> options2 = new ArrayList<>();
        options2.add("A. Antartica");
        options2.add("B. Asia");
        options2.add("C. Europe");
        options2.add("D. Africa");
        questions.add(new QuizQuestion("Which Continent doesnt have deserts?", options2, 2));    }

    private static void startQuiz() {
        if (currentQuestionIndex < questions.size()) {
            QuizQuestion currentQuestion = questions.get(currentQuestionIndex);
            displayQuestion(currentQuestion);
            startTimer(10); 
        } else {
            endQuiz();
        }
    }

    private static void displayQuestion(QuizQuestion question) {
        System.out.println(question.getQuestion());
        ArrayList<String> options = question.getOptions();
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Your answer (Enter option letter): ");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine().toUpperCase();

        processAnswer(userAnswer, question);
    }

    private static void startTimer(int seconds) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up!");
                processAnswer("", questions.get(currentQuestionIndex));
            }
        }, seconds * 10);
    }

    private static void processAnswer(String userAnswer, QuizQuestion question) {
        timer.cancel(); // Cancel the timer
        int correctOptionIndex = question.getCorrectOptionIndex();
        String correctOption = Character.toString((char) ('A' + correctOptionIndex));
        if (userAnswer.equals(correctOption)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is: " + correctOption);
        }
        currentQuestionIndex++;
        startQuiz(); // Move to the next question
    }

    private static void endQuiz() {
        System.out.println("Quiz ended!");
        System.out.println("Your score: " + score + "/" + questions.size());
            }
}
