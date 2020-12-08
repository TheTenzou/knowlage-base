package ru.thethenzou.models;

import java.util.Objects;

/**
 * Персонаж.
 */
public class Character {
    /**
     * Name
     */
    String name;

    /**
     * First question.
     */
    int firstQuestion;

    /**
     * Second question.
     */
    int secondQuestion;

    /**
     * Forth question.
     */
    int forthQuestion;

    /**
     * Fifth question;
     */
    int fifthQuestion;

    /**
     * Sixth question.
     */
    int sixthQuestion;

    /**
     * Seven question.
     */
    int seventhQuestion;

    /**
     * Eighth question.
     */
    int eighthQuestion;

    /**
     * Nineth question
     */
    int ninethQuestion;

    /**
     * Tenth question.
     */
    int tenthQuestion;

    /**
     * Eleventh question.
     */
    int elevenQuestion;


    public Character(String name, int firstQuestion, int secondQuestion, int forthQuestion, int fifthQuestion,
                     int sixthQuestion, int seventhQuestion, int eighthQuestion, int ninethQuestion,
                     int tenthQuestion, int elevenQuestion) {
        this.name = name;
        this.firstQuestion = firstQuestion;
        this.secondQuestion = secondQuestion;
        this.forthQuestion = forthQuestion;
        this.fifthQuestion = fifthQuestion;
        this.sixthQuestion = sixthQuestion;
        this.seventhQuestion = seventhQuestion;
        this.eighthQuestion = eighthQuestion;
        this.ninethQuestion = ninethQuestion;
        this.tenthQuestion = tenthQuestion;
        this.elevenQuestion = elevenQuestion;
    }

    public Character(int firstQuestion, int secondQuestion, int forthQuestion, int fifthQuestion,
                     int sixthQuestion, int seventhQuestion, int eighthQuestion, int ninethQuestion,
                     int tenthQuestion, int elevenQuestion) {
        this.firstQuestion = firstQuestion;
        this.secondQuestion = secondQuestion;
        this.forthQuestion = forthQuestion;
        this.fifthQuestion = fifthQuestion;
        this.sixthQuestion = sixthQuestion;
        this.seventhQuestion = seventhQuestion;
        this.eighthQuestion = eighthQuestion;
        this.ninethQuestion = ninethQuestion;
        this.tenthQuestion = tenthQuestion;
        this.elevenQuestion = elevenQuestion;
    }

    public Character() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirstQuestion() {
        return firstQuestion;
    }

    public void setFirstQuestion(int firstQuestion) {
        this.firstQuestion = firstQuestion;
    }

    public int getSecondQuestion() {
        return secondQuestion;
    }

    public void setSecondQuestion(int secondQuestion) {
        this.secondQuestion = secondQuestion;
    }

    public int getForthQuestion() {
        return forthQuestion;
    }

    public void setForthQuestion(int forthQuestion) {
        this.forthQuestion = forthQuestion;
    }

    public int getFifthQuestion() {
        return fifthQuestion;
    }

    public void setFifthQuestion(int fifthQuestion) {
        this.fifthQuestion = fifthQuestion;
    }

    public int getSixthQuestion() {
        return sixthQuestion;
    }

    public void setSixthQuestion(int sixthQuestion) {
        this.sixthQuestion = sixthQuestion;
    }

    public int getSeventhQuestion() {
        return seventhQuestion;
    }

    public void setSeventhQuestion(int seventhQuestion) {
        this.seventhQuestion = seventhQuestion;
    }

    public int getEighthQuestion() {
        return eighthQuestion;
    }

    public void setEighthQuestion(int eighthQuestion) {
        this.eighthQuestion = eighthQuestion;
    }

    public int getNinethQuestion() {
        return ninethQuestion;
    }

    public void setNinethQuestion(int ninethQuestion) {
        this.ninethQuestion = ninethQuestion;
    }

    public int getTenthQuestion() {
        return tenthQuestion;
    }

    public void setTenthQuestion(int tenthQuestion) {
        this.tenthQuestion = tenthQuestion;
    }

    public int getElevenQuestion() {
        return elevenQuestion;
    }

    public void setElevenQuestion(int elevenQuestion) {
        this.elevenQuestion = elevenQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return firstQuestion == character.firstQuestion &&
                secondQuestion == character.secondQuestion &&
                forthQuestion == character.forthQuestion &&
                fifthQuestion == character.fifthQuestion &&
                sixthQuestion == character.sixthQuestion &&
                seventhQuestion == character.seventhQuestion &&
                eighthQuestion == character.eighthQuestion &&
                ninethQuestion == character.ninethQuestion &&
                tenthQuestion == character.tenthQuestion &&
                elevenQuestion == character.elevenQuestion &&
                Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstQuestion, secondQuestion, forthQuestion, fifthQuestion, sixthQuestion,
                seventhQuestion, eighthQuestion, ninethQuestion, tenthQuestion, elevenQuestion);
    }
}
