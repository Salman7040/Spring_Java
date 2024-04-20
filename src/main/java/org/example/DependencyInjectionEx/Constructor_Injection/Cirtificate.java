package org.example.DependencyInjectionEx.Constructor_Injection;

public class Cirtificate {
    private String cirtyName;

    public Cirtificate(String cirtyName) {
        this.cirtyName = cirtyName;
    }

    @Override
    public String toString() {
        return "Cirtificate{" +
                "cirtyName='" + cirtyName + '\'' +
                '}';
    }
}
