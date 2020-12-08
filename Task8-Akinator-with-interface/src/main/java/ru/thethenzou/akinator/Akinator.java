package ru.thethenzou.akinator;

import org.jpl7.Query;

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
}
