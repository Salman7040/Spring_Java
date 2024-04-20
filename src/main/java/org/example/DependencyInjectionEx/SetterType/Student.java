package org.example.DependencyInjectionEx.SetterType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private  int stdId;
    private  String stdName;
    private String stdAdd;


    @Override
    public String toString() {
        return "stdId:" + stdId + "  stdName:" + stdName +"  stdAdd:" + stdAdd  ;

    }
}
