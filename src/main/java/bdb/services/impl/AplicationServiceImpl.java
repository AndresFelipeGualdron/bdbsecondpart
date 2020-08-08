package bdb.services.impl;

import bdb.model.Location;
import bdb.repositories.LocationRepository;
import bdb.services.AplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AplicationServiceImpl implements AplicationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location getLocation(String name) {
        return this.locationRepository.findById(name).get();
    }

    @Override
    public Location setLocation(Location location) {
        return this.locationRepository.save(location);
    }

    @Override
    public Location saveLocation(Location location) {
        return this.locationRepository.save(location);
    }
}
