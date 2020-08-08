package bdb.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Location {
    @Id
    String name;
    int area_m2;

    @OneToOne
    Location parentLocation;

    @OneToMany
    Collection<Location> internalLocations;

    public Location() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea_m2() {
        return area_m2;
    }

    public void setArea_m2(int area_m2) {
        this.area_m2 = area_m2;
    }

    public Location getParentLocation() {
        return parentLocation;
    }

    public void setParentLocation(Location parentLocation) {
        this.parentLocation = parentLocation;
    }

    public Collection<Location> getInternalLocations() {
        return internalLocations;
    }

    public void setInternalLocations(Collection<Location> internalLocations) {
        this.internalLocations = internalLocations;
    }

}
