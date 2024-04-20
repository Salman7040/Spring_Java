package org.example.AutoWiring.XmlAutoWiring;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Emp {
    private Address add;
    public Emp() {}
    public Emp(Address add) {
        this.add = add;
    }


    @Override
    public String toString() {
        return "add: " + add ;

    }
}
