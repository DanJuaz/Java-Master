package com.daznj.elements.validator;

public class Email extends Validator{

    protected String message = "The fild %s The Email  is incorrect";
    final private String EMAIL_REGEX="^(.+)@(.+).(.+)$";

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
        return (value.matches(EMAIL_REGEX));
    }
}
