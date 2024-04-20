package org.example.AutoWiring.AnnotaionAutoWiring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Emp {

    private Address add;
    public Emp() {}
    @Autowired
    public Emp(Address add) {
        this.add = add;
    }


    @Override

    public String toString() {
        return "add: " + add ;

    }
}
