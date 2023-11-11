package com.daznj.elements.validator;

import com.daznj.elements.validator.message.IMessageFormatable;

public class Lenght extends Validator implements IMessageFormatable {
    protected String message="This field  has to have %s min of caracters and  %s max of carachters ";
    private int min;
    private int max = Integer.MAX_VALUE;

    public Lenght() {
    }

    public Lenght(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMessage(String message) {
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValidate(String value) {
        this.message = String.format(this.message, this.min, this.max);

        if(value == null){
            return true;
        }
        return (value.length() >= min && value.length() <= max);
    }

    @Override
    public String getMenssageFormatable(String field) {
        return String.format(this.message, field, this.min, this.max);
    }
}
