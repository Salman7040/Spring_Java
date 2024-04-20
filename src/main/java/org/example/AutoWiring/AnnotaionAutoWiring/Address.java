package org.example.AutoWiring.AnnotaionAutoWiring;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String street;
    private String city;


    @Override
    public String toString() {
        return "street=" + street +"  city" + city ;
    }
}
