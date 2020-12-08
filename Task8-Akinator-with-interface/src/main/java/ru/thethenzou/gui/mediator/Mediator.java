package ru.thethenzou.gui.mediator;

import ru.thethenzou.gui.components.Component;

public interface Mediator {
    void registerComponent(Component component);
    void setFirstAnswer(int answer);
    void setSecondAnswer(int answer);
    void setFourthAnswer(int answer);
    void setFifthAnswer(int answer);
    void setSixthAnswer(int answer);
    void setSeventhAnswer(int answer);
    void setEighthAnswer(int answer);
    void setNinethAnswer(int answer);
    void setTenthAnswer(int answer);
    void setEleventhAnswer(int answer);
    void nextPage();
    void setCharacterName(String name);
    void startAgain();
    void createGUI();
}
