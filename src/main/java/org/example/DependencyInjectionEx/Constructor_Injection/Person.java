package org.example.DependencyInjectionEx.Constructor_Injection;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Person {
    private int id;
    private  String pId;
    private  Cirtificate cirtificate;
    private List<String> list;


    public Person(int id, String pId, Cirtificate cirtificate,List<String> list) {
        this.id = id;
        this.pId = pId;
        this.cirtificate = cirtificate;
        this.list=list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", pId='" + pId + '\'' +
                ", cirtificate=" + cirtificate +
                ", list=" + list +
                '}';
    }
}
