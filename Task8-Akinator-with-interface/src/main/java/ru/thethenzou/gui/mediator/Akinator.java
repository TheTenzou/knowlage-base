package ru.thethenzou.gui.mediator;

import ru.thethenzou.gui.components.Component;
import ru.thethenzou.gui.panel.ImagePanel;
import ru.thethenzou.models.Character;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Akinator implements Mediator {

    List<Component> componentList = new ArrayList<>();

    Character character;

    private int page = 0;

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        component.hide();

        componentList.add(component);
    }

    @Override
    public String getName() {
        if (character.getName() != null) {
            return character.getName();
        } else {
            return "error";
        }
    }

    @Override
    public void setAnswer(int question, int answer) {
        System.out.println("Question " + question + " answer " + answer);
        switch (question) {
            case 1:
                character.setFirstQuestion(answer);
                break;
            case 2:
                character.setSecondQuestion(answer);
                break;
            case 4:
                character.setForthQuestion(answer);
                break;
            case 5:
                character.setFifthQuestion(answer);
                break;
            case 6:
                character.setSixthQuestion(answer);
                break;
            case 7:
                character.setSeventhQuestion(answer);
                break;
            case 8:
                character.setEighthQuestion(answer);
                break;
            case 9:
                character.setNinethQuestion(answer);
                break;
            case 10:
                character.setTenthQuestion(answer);
                break;
            case 11:
                character.setElevenQuestion(answer);
                componentList.get(10).hide();
                componentList.get(11).show();
                break;
        }
    }

    @Override
    public void nextPage() {
        if (page + 1 < componentList.size()) {
            componentList.get(page + 1).show();
            componentList.get(page).hide();
            page++;
        } else {
            componentList.get(page).hide();
            componentList.get(0).show();
            page = 0;
        }
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

        componentList.forEach(component -> component.setPenel(panel));
        componentList.get(0).show();
        panel.setVisible(true);
        akinator.add(panel);

        akinator.setVisible(true);
    }
}
