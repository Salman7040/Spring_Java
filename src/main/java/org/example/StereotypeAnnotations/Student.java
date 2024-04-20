package org.example.StereotypeAnnotations;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Student {
    private String stdName;
    private String stdCity;

    public  Student(){}
    public Student(String stdName, String stdCity) {
        this.stdName = stdName;
        this.stdCity = stdCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", stdCity='" + stdCity + '\'' +
                '}';
    }
}
