package com.daznj.elements;

public class TextareaForm extends  ElementForm{
    private int rows;
    private int columns;

    public TextareaForm(String name) {
        super(name);
    }

    public TextareaForm(String name, int rows, int columns) {
        super(name);
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    @Override
    public String paintHTML() {
        return "<textarea name='"+this.name+"' cols='"+this.columns+"' rows='"+this.rows+"'>"+this.value+" </textarea>";
    }

}
