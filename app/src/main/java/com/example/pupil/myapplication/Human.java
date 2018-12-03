package com.example.pupil.myapplication;

import timber.log.Timber;

public abstract class Human implements HumanInterface {
    private String name;
    private String surname;
    private String age;
    private String sex;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    private String eyes;
    private String hair;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Timber.i("Я могу бегать.");
    }

    @Override
    public void eat() {
        Timber.i("Я могу кушать.");
    }
}


