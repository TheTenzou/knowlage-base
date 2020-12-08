package ru.thethenzou.akinator;

import org.jpl7.*;
import org.jpl7.Integer;
import ru.thethenzou.models.Character;

import java.util.Optional;
import java.util.Properties;

/**
 * Класс для взаимодействия с акинатором написанным на прологе.
 */
public class Akinator {

    /**
     * Свойства.
     */
    Properties properties;

    /**
     * Конструктор.
     *
     * @param properties Свойства
     */
    public Akinator(Properties properties) {
        this.properties = properties;
        Query consult = new Query("consult('" + properties.getProperty("prolog.path") + "')");
        consult.hasMoreSolutions();
        loadPredicats();
    }

    private void loadPredicats() {
        Query loadQ1 = new Query("load_q1('" + properties.getProperty("q01") + "')");
        loadQ1.hasSolution();
        Query loadQ2 = new Query("load_q2('" + properties.getProperty("q02") + "')");
        loadQ2.hasSolution();
        Query loadQ4 = new Query("load_q4('" + properties.getProperty("q04") + "')");
        loadQ4.hasSolution();
        Query loadQ5 = new Query("load_q5('" + properties.getProperty("q05") + "')");
        loadQ5.hasSolution();
        Query loadQ6 = new Query("load_q6('" + properties.getProperty("q06") + "')");
        loadQ6.hasSolution();
        Query loadQ7 = new Query("load_q7('" + properties.getProperty("q07") + "')");
        loadQ7.hasSolution();
        Query loadQ8 = new Query("load_q8('" + properties.getProperty("q08") + "')");
        loadQ8.hasSolution();
        Query loadQ9 = new Query("load_q9('" + properties.getProperty("q09") + "')");
        loadQ9.hasSolution();
        Query loadQ10 = new Query("load_q10('" + properties.getProperty("q10") + "')");
        loadQ10.hasSolution();
        Query loadQ11 = new Query("load_q11('" + properties.getProperty("q11") + "')");
        loadQ11.hasSolution();
    }

    /**
     * Мето позволяет задать вопрос прологу.
     * @param character персонаж
     * @return optional с персонажем если он есть, а если нет то пустой
     */
    public Optional<Character> guess(Character character) {
        Variable characterName = new Variable("Name");
        Query guess = new Query("q", new Term[] {
                characterName,
                new Integer(character.getFirstQuestion()),
                new Integer(character.getSecondQuestion()),
                new Integer(character.getForthQuestion()),
                new Integer(character.getFifthQuestion()),
                new Integer(character.getSixthQuestion()),
                new Integer(character.getSeventhQuestion()),
                new Integer(character.getEighthQuestion()),
                new Integer(character.getNinethQuestion()),
                new Integer(character.getTenthQuestion()),
                new Integer(character.getElevenQuestion())
        });

        Optional<Character> answer;
        if (guess.hasSolution()) {
            character.setName(guess.oneSolution().get("Name").name());
            answer = Optional.of(character);
        } else {
            answer = Optional.empty();
        }
        return answer;
    }

    public void save(Character character) {
        Query guess = new Query("assert", new Term[] {
                new Atom(character.getName()),
                new Integer(character.getFirstQuestion()),
                new Integer(character.getSecondQuestion()),
                new Integer(character.getForthQuestion()),
                new Integer(character.getFifthQuestion()),
                new Integer(character.getSixthQuestion()),
                new Integer(character.getSeventhQuestion()),
                new Integer(character.getEighthQuestion()),
                new Integer(character.getNinethQuestion()),
                new Integer(character.getTenthQuestion()),
                new Integer(character.getElevenQuestion())
        });
        guess.hasSolution();

        Query saveQ1 = new Query("save_q1('" + properties.getProperty("q01") + "')");
        saveQ1.hasSolution();
        Query saveQ2 = new Query("save_q2('" + properties.getProperty("q02") + "')");
        saveQ2.hasSolution();
        Query saveQ4 = new Query("save_q4('" + properties.getProperty("q04") + "')");
        saveQ4.hasSolution();
        Query saveQ5 = new Query("save_q5('" + properties.getProperty("q05") + "')");
        saveQ5.hasSolution();
        Query saveQ6 = new Query("save_q6('" + properties.getProperty("q06") + "')");
        saveQ6.hasSolution();
        Query saveQ7 = new Query("save_q7('" + properties.getProperty("q07") + "')");
        saveQ7.hasSolution();
        Query saveQ8 = new Query("save_q8('" + properties.getProperty("q08") + "')");
        saveQ8.hasSolution();
        Query saveQ9 = new Query("save_q9('" + properties.getProperty("q09") + "')");
        saveQ9.hasSolution();
        Query saveQ10 = new Query("save_q10('" + properties.getProperty("q10") + "')");
        saveQ10.hasSolution();
        Query saveQ11 = new Query("save_q11('" + properties.getProperty("q11") + "')");
        saveQ11.hasSolution();

        loadPredicats();
    }
}
