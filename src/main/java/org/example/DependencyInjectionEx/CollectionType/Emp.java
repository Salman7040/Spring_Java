package org.example.DependencyInjectionEx.CollectionType;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Set;


@Setter
@Getter
public class Emp {
    private String eName;
    private List<Integer> ePhoneNumber;
    private Set<String> eAddresses;
    private Map<String,String> eCourses;

    @Override
    public String toString() {
        return "eName="+ eName + "\nePhoneNumber=" + ePhoneNumber +"\neAddresses=" + eAddresses + "\neCourses=" + eCourses ;

    }
}
