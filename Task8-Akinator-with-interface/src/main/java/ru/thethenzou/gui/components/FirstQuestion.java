package ru.thethenzou.gui.components;

import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstQuestion implements Component, ActionListener {

    private Mediator mediator;

    JLabel backGround = new JLabel();
    JLabel label = new JLabel("Какого пола ваш персонаж?");
    JButton answerOneButton = new JButton("Мужской");
    JButton answerSecondButton = new JButton("Женский");
    JButton answerThirdButton = new JButton("Другое");

    public FirstQuestion() {

        backGround.setBounds(320, 400, 250, 60);
        backGround.setOpaque(true);
        backGround.setBackground(new Color(250,183,60));

        label.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(350,420,labelSize.width,labelSize.height);

        Dimension buttonSize = answerOneButton.getPreferredSize();
        answerOneButton.setBounds(320,470, 250, 30);
        answerOneButton.setFocusPainted(false);
        answerOneButton.setActionCommand("1");
        answerOneButton.addActionListener(this);

        Dimension buttonSize1 = answerOneButton.getPreferredSize();
        answerSecondButton.setBounds(320,510, 250, 30);
        answerSecondButton.setFocusPainted(false);
        answerSecondButton.setActionCommand("2");
        answerSecondButton.addActionListener(this);

        Dimension buttonSize2 = answerOneButton.getPreferredSize();
        answerThirdButton.setBounds(320,550, 250, 30);
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
        panel.add(backGround);
    }

    @Override
    public void show() {
        backGround.setVisible(true);
        label.setVisible(true);
        answerOneButton.setVisible(true);
        answerSecondButton.setVisible(true);
        answerThirdButton.setVisible(true);
    }

    @Override
    public void hide() {
        backGround.setVisible(false);
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
