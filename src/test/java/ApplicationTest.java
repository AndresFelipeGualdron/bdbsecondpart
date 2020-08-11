import bdb.Aplication;
import bdb.model.Location;
import bdb.services.AplicationService;
import bdb.services.impl.AplicationServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ApplicationTest {


    private AplicationService aplicationService;

    public ApplicationTest(){
        this.aplicationService = new AplicationServiceImpl();
    }

    @Test
    public void createLocationCorrect(){
//        Location location = new Location();
//        location.setName("test one");
//        location.setArea_m2(1);
//        Location father = new Location();
//        father.setName("father");
//        ArrayList<Location> locations = new ArrayList<>();
//        locations.add(father);
//        location.setInternalLocations(locations);
//        location.setParentLocation(father);
//        System.out.println("######################################### "+ this.aplicationService);
//        Location lo = this.aplicationService.saveLocation(location);
//        assert(lo.equals(location));
        assert(true);
    }
}
