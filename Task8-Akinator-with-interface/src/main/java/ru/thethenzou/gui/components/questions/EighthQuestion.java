package ru.thethenzou.gui.components.questions;

import ru.thethenzou.gui.components.Component;
import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EighthQuestion implements Component, ActionListener {

    private Mediator mediator;

    JLabel backGround = new JLabel();
    JLabel label = new JLabel("Сколько лет вашему персонажу?");
    JButton answerOneButton = new JButton("Меньше 30 лет");
    JButton answerSecondButton = new JButton("меньше 55 лет");
    JButton answerThirdButton = new JButton("больше 55 лет");
    JButton answerFourthButoon = new JButton("ДА!");
    JButton answerFifthButoon = new JButton("Не известно");

    public EighthQuestion() {

        backGround.setBounds(320, 390, 250, 60);
        backGround.setOpaque(true);
        backGround.setBackground(new Color(250,183,60));

        label.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(445 - labelSize.width/2,410,labelSize.width,labelSize.height);

        answerOneButton.setBounds(320,460, 250, 30);
        answerOneButton.setFocusPainted(false);
        answerOneButton.setActionCommand("1");
        answerOneButton.addActionListener(this);

        answerSecondButton.setBounds(320,500, 250, 30);
        answerSecondButton.setFocusPainted(false);
        answerSecondButton.setActionCommand("2");
        answerSecondButton.addActionListener(this);

        answerThirdButton.setBounds(320,540, 250, 30);
        answerThirdButton.setFocusPainted(false);
        answerThirdButton.setActionCommand("3");
        answerThirdButton.addActionListener(this);

        answerFourthButoon.setBounds(320,580, 250, 30);
        answerFourthButoon.setFocusPainted(false);
        answerFourthButoon.setActionCommand("3");
        answerFourthButoon.addActionListener(this);

        answerFifthButoon.setBounds(320,620, 250, 30);
        answerFifthButoon.setFocusPainted(false);
        answerFifthButoon.setActionCommand("3");
        answerFifthButoon.addActionListener(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void setPenel(JPanel panel) {
        panel.add(label);
        panel.add(answerOneButton);
        panel.add(answerSecondButton);
        panel.add(answerThirdButton);
        panel.add(answerFourthButoon);
        panel.add(answerFifthButoon);
        panel.add(backGround);
    }

    @Override
    public void show() {
        backGround.setVisible(true);
        label.setVisible(true);
        answerOneButton.setVisible(true);
        answerSecondButton.setVisible(true);
        answerThirdButton.setVisible(true);
        answerFourthButoon.setVisible(true);
        answerFifthButoon.setVisible(true);
    }

    @Override
    public void hide() {
        backGround.setVisible(false);
        label.setVisible(false);
        answerOneButton.setVisible(false);
        answerSecondButton.setVisible(false);
        answerThirdButton.setVisible(false);
        answerFourthButoon.setVisible(false);
        answerFifthButoon.setVisible(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "1":
                mediator.setAnswer(6, 1);
                break;
            case "2":
                mediator.setAnswer(6, 2);
                break;
            case "3":
                mediator.setAnswer(6, 3);
                break;
        }
        mediator.nextPage();
    }
}
