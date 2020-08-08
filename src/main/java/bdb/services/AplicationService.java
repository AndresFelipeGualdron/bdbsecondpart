package bdb.services;

import bdb.model.Location;

import java.util.List;

public interface AplicationService {

    List<Location> getLocations();

    Location getLocation(String name);

    Location setLocation(Location location);

    Location saveLocation(Location location);

}
