package com.daznj.elements.validator;

public class Number extends Validator{
    protected String message = "This field %s must to be Number";

    @Override
    public void setMessage(String message) {
        this.message=message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isValidate(String value) {
        try {
            Integer.parseInt(value);
            return true;

        }catch (NumberFormatException e){
            return false;
        }
    }
}
