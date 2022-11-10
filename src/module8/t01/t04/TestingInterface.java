package module8.t01.t04;

public interface TestingInterface {

    public default boolean checkAnswer(int answerNumber) {
        if (answerNumber == 1) {
            return true;
        } else return false;
    }
}
