package ru.thethenzou.gui.components.questions;

import ru.thethenzou.gui.components.Component;
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

        backGround.setBounds(320, 390, 250, 60);
        backGround.setOpaque(true);
        backGround.setBackground(new Color(250, 183, 60));

        label.setFont(new Font("Serif", Font.PLAIN, 16));
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(445 - labelSize.width/2, 410, labelSize.width, labelSize.height);

        answerOneButton.setBounds(320, 460, 250, 30);
        answerOneButton.setFocusPainted(false);
        answerOneButton.setActionCommand("1");
        answerOneButton.addActionListener(this);

        answerSecondButton.setBounds(320, 500, 250, 30);
        answerSecondButton.setFocusPainted(false);
        answerSecondButton.setActionCommand("2");
        answerSecondButton.addActionListener(this);

        answerThirdButton.setBounds(320, 540, 250, 30);
        answerThirdButton.setFocusPainted(false);
        answerThirdButton.setActionCommand("3");
        answerThirdButton.addActionListener(this);
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
        mediator.setAnswer(1, Integer.parseInt(e.getActionCommand()));
        mediator.nextPage();
    }
}
