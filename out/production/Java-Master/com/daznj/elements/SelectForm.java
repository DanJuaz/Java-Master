package com.daznj.elements;

import com.daznj.elements.select.Option;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends  ElementForm{
    private List<Option> opciones;

    public SelectForm(String name) {
        super(name);
        this.opciones=new ArrayList<Option>();
    }
    public SelectForm addOption(Option option){
        this.opciones.add(option);
        return this;
    }
    @Override
    public String paintHTML() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.name)
                .append("'>");
        for (Option option:this.opciones){
            sb.append("\n<option value='")
                    .append(option.getValue())
                    .append("'");
            if(option.isSelected()){
                sb.append(" selected");
                this.value = option.getValue();
            }
            sb.append(">")
                    .append(option.getName())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
