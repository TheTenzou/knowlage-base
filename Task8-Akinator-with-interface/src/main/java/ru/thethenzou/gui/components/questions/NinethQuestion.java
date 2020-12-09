package ru.thethenzou.gui.components.questions;

import ru.thethenzou.gui.components.Component;
import ru.thethenzou.gui.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NinethQuestion implements Component, ActionListener {

    private Mediator mediator;

    JLabel backGround = new JLabel();
    JLabel label = new JLabel("Ваш персонаж из DLC?");
    JButton answerOneButton = new JButton("Да");
    JButton answerSecondButton = new JButton("Нет");

    public NinethQuestion() {

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
        panel.add(backGround);
    }

    @Override
    public void show() {
        backGround.setVisible(true);
        label.setVisible(true);
        answerOneButton.setVisible(true);
        answerSecondButton.setVisible(true);
    }

    @Override
    public void hide() {
        backGround.setVisible(false);
        label.setVisible(false);
        answerOneButton.setVisible(false);
        answerSecondButton.setVisible(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        mediator.setAnswer(9, Integer.parseInt(e.getActionCommand()));
        mediator.nextPage();
    }
}
