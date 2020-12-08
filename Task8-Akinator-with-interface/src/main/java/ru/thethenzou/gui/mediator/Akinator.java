package ru.thethenzou.gui.mediator;

import ru.thethenzou.gui.components.Component;
import ru.thethenzou.gui.components.FirstQuestion;
import ru.thethenzou.gui.components.StartPanel;
import ru.thethenzou.gui.panel.ImagePanel;
import ru.thethenzou.models.Character;

import javax.swing.*;

public class Akinator implements Mediator {

    private StartPanel startPanel;
    private FirstQuestion firstQuestion;

    Character character;

    private int page = 0;

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);

        switch (component.getName()) {
            case "StartPenal":
                startPanel = (StartPanel) component;
                startPanel.hide();
                break;
            case "FirstQuestion":
                firstQuestion = (FirstQuestion) component;
                firstQuestion.hide();
                break;
        }

    }

    @Override
    public void setFirstAnswer(int answer) {
        System.out.println("First " + answer);
    }

    @Override
    public void setSecondAnswer(int answer) {

    }

    @Override
    public void setFourthAnswer(int answer) {

    }

    @Override
    public void setFifthAnswer(int answer) {

    }

    @Override
    public void setSixthAnswer(int answer) {

    }

    @Override
    public void setSeventhAnswer(int answer) {

    }

    @Override
    public void setEighthAnswer(int answer) {

    }

    @Override
    public void setNinethAnswer(int answer) {

    }

    @Override
    public void setTenthAnswer(int answer) {

    }

    @Override
    public void setEleventhAnswer(int answer) {

    }

    @Override
    public void nextPage() {
        page++;
        switch (page) {
            case 1:
                startPanel.hide();
                firstQuestion.show();
                break;
            case 2:
                firstQuestion.hide();
                break;
        }
    }

    @Override
    public void setCharacterName(String name) {

    }

    @Override
    public void startAgain() {

    }

    @Override
    public void createGUI() {
        JFrame akinator = new JFrame("Akinator");
        akinator.setSize(600, 700);
        akinator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new ImagePanel();
        panel.setLayout(null);

        character = new Character();

        startPanel.setPenel(panel);
        firstQuestion.setPenel(panel);
        startPanel.show();
        panel.setVisible(true);
        akinator.add(panel);

        akinator.setVisible(true);
    }
}
