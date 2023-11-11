package com.dazn.interfaces.impress.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements IPrintable{
    private Person person;
    private String degree;
    private List<String> experiences;

    public Curriculum(String content, Person person, String degree) {
        super(content);
        this.person = person;
        this.degree = degree;
        this.experiences = new ArrayList<>();
    }
    public Curriculum addExp(String exp){
      this.experiences.add(exp);
      return this;
    };

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder("Name: ");
        sb.append(this.person.toString()).append("\n")
                .append("Resume: ").append(this.content).append("\n")
                .append("Degree: ").append(this.degree).append("\n")
                .append("Experiences: ").append("\n");
        for (String exp:
             this.experiences) {
            sb.append("+ ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
