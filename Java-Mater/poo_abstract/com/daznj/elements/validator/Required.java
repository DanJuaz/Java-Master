package com.daznj.elements.validator;

public class Required extends Validator{
    protected String message = "This field %s is required";
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
        return (value != null && value.length()>0);
    }
}
