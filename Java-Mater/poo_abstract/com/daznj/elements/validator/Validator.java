package com.daznj.elements.validator;

abstract public class Validator {
    protected String message;
    abstract public void setMessage(String message);
    abstract public String getMessage();
    abstract public boolean isValidate(String value);
}
