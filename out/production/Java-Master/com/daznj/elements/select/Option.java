package com.daznj.elements.select;

public class Option {
    private String name;
    private String value;
    private boolean selected;

    public Option() {
    }

    public Option(String name, String value) {
        this.name = name;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public Option setSelected() {
        this.selected = true;
        return this;
    }
}
