package module6.t01.t03;

import module6.t01.t04.Goods;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать классы в соотвестствии с моделью программы для тестирования
 * Тест -> Вопросы -> Варианты ответов
 *
 * (рядом приведена UML-диаграмма классов)
 */
public class Main {
    public static void main(String[] args) {
        Option option1 = new Option(1,"Option1", true);
        Option option2 = new Option(2,"Option2", true);
        Option option3 = new Option(3,"Option3", false);

        //массив опций
        Option[] options  = {option1, option2, option3};

        Question question1 = new Question(1, "Вопрос 1:", options );
        Question question2 = new Question(2, "Вопрос 2:", options);

        //массив вопросов
        Question[] questionList = {question1 , question2};

        Quiz quiz = new Quiz(1,"quiz1", questionList);

    }
}
