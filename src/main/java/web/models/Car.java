package web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    private int id;
    @Column(name = "engine")
    private String engine;
    @Column(name = "model")
    private String model;
    @Column(name = "licensePlate")
    private int licensePlate;

    public Car() {
    }

    public Car(String engine, String model, int licensePlate) {
        this.engine = engine;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return licensePlate == car.licensePlate && Objects.equals(engine, car.engine) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, model, licensePlate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                ", licensePlate=" + licensePlate +
                '}';
    }
}
