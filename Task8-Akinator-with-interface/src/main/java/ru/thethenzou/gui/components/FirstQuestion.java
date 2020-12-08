package ru.thethenzou.gui.components;

import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstQuestion implements Component, ActionListener {

    private Mediator mediator;
    JLabel label = new JLabel("Какого пола ваш персонаж?");
    JButton answerOneButton = new JButton("Мужской");
    JButton answerSecondButton = new JButton("Женский");
    JButton answerThirdButton = new JButton("Другое");

    public FirstQuestion() {

        label.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(350,300,labelSize.width,labelSize.height);

        Dimension buttonSize = answerOneButton.getPreferredSize();
        answerOneButton.setBounds(400,340, buttonSize.width, buttonSize.height);
        answerOneButton.setFocusPainted(false);
        answerOneButton.setActionCommand("1");
        answerOneButton.addActionListener(this);

        Dimension buttonSize1 = answerOneButton.getPreferredSize();
        answerSecondButton.setBounds(400,380, buttonSize1.width, buttonSize1.height);
        answerSecondButton.setFocusPainted(false);
        answerSecondButton.setActionCommand("2");
        answerSecondButton.addActionListener(this);

        Dimension buttonSize2 = answerOneButton.getPreferredSize();
        answerThirdButton.setBounds(400,420, buttonSize2.width, buttonSize2.height);
        answerThirdButton.setFocusPainted(false);
        answerThirdButton.setActionCommand("3");
        answerThirdButton.addActionListener(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
       return "FirstQuestion";
    }

    @Override
    public void setPenel(JPanel panel) {
        panel.add(label);
        panel.add(answerOneButton);
        panel.add(answerSecondButton);
        panel.add(answerThirdButton);
    }

    @Override
    public void show() {
        label.setVisible(true);
        answerOneButton.setVisible(true);
        answerSecondButton.setVisible(true);
        answerThirdButton.setVisible(true);
    }

    @Override
    public void hide() {
        label.setVisible(false);
        answerOneButton.setVisible(false);
        answerSecondButton.setVisible(false);
        answerThirdButton.setVisible(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "1":
                mediator.setFirstAnswer(1);
                break;
            case "2":
                mediator.setFirstAnswer(2);
                break;
            case "3":
                mediator.setFirstAnswer(3);
                break;
        }
        mediator.nextPage();
    }
}
