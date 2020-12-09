package ru.thethenzou.gui.mediator;

import ru.thethenzou.gui.components.Component;

public interface Mediator {
    void registerComponent(Component component);
    void setAnswer(int question, int answer);
    void setName(String name);
    String getName();
    void nextPage();
    void startAgain();
    void createGUI();
}
