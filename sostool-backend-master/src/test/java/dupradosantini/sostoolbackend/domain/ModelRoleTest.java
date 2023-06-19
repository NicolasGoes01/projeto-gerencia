package dupradosantini.sostoolbackend.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class ModelRoleTest {

    private ModelRole modelRole;

    @BeforeEach
    public void setUp() {
        modelRole = new ModelRole();
    }

    @Test
    @DisplayName("Test setting and getting name")
    void testSetAndGetName() {
        String name = "Sample name";

        modelRole.setName(name);

        Assertions.assertEquals(name, modelRole.getName());
    }

    @Test
    @DisplayName("Test setting and getting description")
    void testSetAndGetDescription() {
        String description = "Sample description";

        modelRole.setDescription(description);

        Assertions.assertEquals(description, modelRole.getDescription());
    }

    @Test
    @DisplayName("Test setting and getting son roles")
    void testSetAndGetSonRoles() {
        Set<BusinessRole> sonRoles = new HashSet<>();

        BusinessRole role1 = new BusinessRole();
        role1.setId(1);
        BusinessRole role2 = new BusinessRole();
        role2.setId(2);

        sonRoles.add(role1);
        sonRoles.add(role2);

        modelRole.setSonRoles(sonRoles);

        Assertions.assertEquals(sonRoles, modelRole.getSonRoles());
    }

    @Test
    @DisplayName("Test equals and hashCode")
    void testEqualsAndHashCode() {
        ModelRole mr1 = new ModelRole();
        ModelRole mr2 = new ModelRole();
        ModelRole mr3 = new ModelRole();

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
