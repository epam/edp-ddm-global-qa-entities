package platform.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import platform.qa.entities.Ceph;

public class EntityBuilderTest {

    @Test
    public void checkEntityBuilder() {
        Ceph ceph = Ceph.builder().build();
        Assertions.assertNotNull(ceph);
    }
}
