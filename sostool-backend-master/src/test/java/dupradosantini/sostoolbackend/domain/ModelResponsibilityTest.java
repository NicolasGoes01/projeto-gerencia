package dupradosantini.sostoolbackend.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class ModelResponsibilityTest {

    private ModelResponsibility modelResponsibility;

    @BeforeEach
    public void setUp() {
        modelResponsibility = new ModelResponsibility();
    }

    @Test
    @DisplayName("Test setting and getting description")
    void testSetAndGetDescription() {
        String description = "Sample description";

        modelResponsibility.setDescription(description);

        Assertions.assertEquals(description, modelResponsibility.getDescription());
    }

    @Test
    @DisplayName("Test setting and getting son responsibilities")
    void testSetAndGetSonResponsibilities() {
        Set<BusinessResponsibility> sonResponsibilities = new HashSet<>();

        BusinessResponsibility responsibility1 = new BusinessResponsibility();
        responsibility1.setId(1);
        BusinessResponsibility responsibility2 = new BusinessResponsibility();
        responsibility2.setId(2);

        sonResponsibilities.add(responsibility1);
        sonResponsibilities.add(responsibility2);

        modelResponsibility.setSonResponsibilities(sonResponsibilities);

        Assertions.assertEquals(sonResponsibilities, modelResponsibility.getSonResponsibilities());
    }

    @Test
    @DisplayName("Test equals and hashCode")
    void testEqualsAndHashCode() {
        ModelResponsibility mr1 = new ModelResponsibility();
        ModelResponsibility mr2 = new ModelResponsibility();
        ModelResponsibility mr3 = new ModelResponsibility();

        // Same ID, should be equal
        mr1.setId(1);
        mr2.setId(1);
        Assertions.assertEquals(mr1, mr2);
        Assertions.assertEquals(mr1.hashCode(), mr2.hashCode());

        // Different ID, should not be equal
        mr3.setId(2);
        Assertions.assertNotEquals(mr1, mr3);
        Assertions.assertNotEquals(mr1.hashCode(), mr3.hashCode());
    }
}
