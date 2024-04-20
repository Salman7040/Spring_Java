package org.example.DependencyInjectionEx.ReferenceType;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class A {
    private String x;
    private  B obj;

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }
}
