package com.daznj.elements.validator;

public class NoNull extends Validator{
    protected String message = "El campo %s no puede ser Null";
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
        return (value != null);
    }
}
