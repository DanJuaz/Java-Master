package com.daznj.elements;

import com.daznj.elements.validator.Validator;
import com.daznj.elements.validator.message.IMessageFormatable;

import java.util.ArrayList;
import java.util.List;

abstract public  class ElementForm {
    protected String name;
    protected String value;

    private List<Validator> validators;
    private List<String> errors;

    public ElementForm() {
        this.validators = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ElementForm(String name) {
        this();
        this.name = name;
    }

    public ElementForm addValidator(Validator validator){
        this.validators.add(validator);
        return this;
    };

    public List<String> getErrors(){
      return errors;
    };

    public boolean isValidate(){
        for (Validator v:validators) {
            if(!v.isValidate(this.value)){
                if(v instanceof IMessageFormatable) {
                    this.errors.add(((IMessageFormatable)v).getMenssageFormatable(name));
                }else{
                    this.errors.add(String.format(v.getMessage(), name));
                }
            }
        }
        return this.errors.isEmpty();
    };
    public void setValue(String value) {
        this.value = value;
    }

    abstract public String paintHTML();
}
