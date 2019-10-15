package Planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {

    private MilitaryType planeType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType planeType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.planeType = planeType;
    }

    public MilitaryType getPlaneType() {
        return planeType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + planeType +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return planeType == that.planeType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), planeType);
    }
}
