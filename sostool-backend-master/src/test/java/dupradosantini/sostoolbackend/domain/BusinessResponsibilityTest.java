package dupradosantini.sostoolbackend.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BusinessResponsibilityTest {

    private BusinessResponsibility businessResponsibility;

    @BeforeEach
    public void setUp() {
        businessResponsibility = new BusinessResponsibility();
    }

    @Test
    @DisplayName("Test setting and getting description")
    void testSetAndGetDescription() {
        String description = "Sample description";

        businessResponsibility.setDescription(description);

        Assertions.assertEquals(description, businessResponsibility.getDescription());
    }

    @Test
    @DisplayName("Test setting and getting parent responsibility")
    void testSetAndGetParentResponsibility() {
        ModelResponsibility parentResponsibility = new ModelResponsibility();

        businessResponsibility.setParentResponsibility(parentResponsibility);

        Assertions.assertEquals(parentResponsibility, businessResponsibility.getParentResponsibility());
    }

    @Test
    @DisplayName("Test setting and getting workspace")
    void testSetAndGetWorkspace() {
        Workspace workspace = new Workspace();

        businessResponsibility.setWorkspace(workspace);

        Assertions.assertEquals(workspace, businessResponsibility.getWorkspace());
    }

    @Test
    @DisplayName("Test equals and hashCode")
    void testEqualsAndHashCode() {
        BusinessResponsibility br1 = new BusinessResponsibility();
        BusinessResponsibility br2 = new BusinessResponsibility();
        BusinessResponsibility br3 = new BusinessResponsibility();

        // Same ID, should be equal
        br1.setId(1);
        br2.setId(1);
        Assertions.assertEquals(br1, br2);
        Assertions.assertEquals(br1.hashCode(), br2.hashCode());

        // Different ID, should not be equal
        br3.setId(2);
        Assertions.assertNotEquals(br1, br3);
        Assertions.assertNotEquals(br1.hashCode(), br3.hashCode());
    }
}
