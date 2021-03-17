package ru.developer.android;

public class Tutorial {
    private String nameTutorial;
    private int iconTutorial;

    public Tutorial(String nameTutorial, int iconTutorial) {
        this.nameTutorial = nameTutorial;
        this.iconTutorial = iconTutorial;
    }

    public String getNameTutorial() {
        return nameTutorial;
    }

    public void setNameTutorial(String nameTutorial) {
        this.nameTutorial = nameTutorial;
    }

    public int getIconTutorial() {
        return iconTutorial;
    }

    public void setIconTutorial(int iconTutorial) {
        this.iconTutorial = iconTutorial;
    }
}
