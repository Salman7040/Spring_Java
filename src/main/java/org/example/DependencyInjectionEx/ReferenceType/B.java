package org.example.DependencyInjectionEx.ReferenceType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class B {
    private String y;

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}
