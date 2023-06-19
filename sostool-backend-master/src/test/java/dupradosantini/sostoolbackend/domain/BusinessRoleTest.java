package dupradosantini.sostoolbackend.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class BusinessRoleTest {

    /* Esses testes verificam a configuração e obtenção dos campos name, description, teams, workspace e parentRole.
    Além disso, testam a igualdade e o hashCode com base no ID do papel de negócios.
    */

    private BusinessRole businessRole;

    @BeforeEach
    public void setUp() {
        businessRole = new BusinessRole();
    }

    @Test
    @DisplayName("Test setting and getting name")
    void testSetAndGetName() {
        String name = "Sample Role";

        businessRole.setName(name);

        Assertions.assertEquals(name, businessRole.getName());
    }

    @Test
    @DisplayName("Test setting and getting description")
    void testSetAndGetDescription() {
        String description = "Sample description";

        businessRole.setDescription(description);

        Assertions.assertEquals(description, businessRole.getDescription());
    }

    @Test
    @DisplayName("Test setting and getting teams")
    void testSetAndGetTeams() {
        Set<Team> teams = new HashSet<>();

        Team team1 = new Team();
        team1.setId(1);
        Team team2 = new Team();
        team2.setId(2);

        teams.add(team1);
        teams.add(team2);

        businessRole.setTeams(teams);

        Assertions.assertEquals(teams, businessRole.getTeams());
    }

    @Test
    @DisplayName("Test setting and getting workspace")
    void testSetAndGetWorkspace() {
        Workspace workspace = new Workspace();
        workspace.setId(1);

        businessRole.setWorkspace(workspace);

        Assertions.assertEquals(workspace, businessRole.getWorkspace());
    }

    @Test
    @DisplayName("Test setting and getting parent role")
    void testSetAndGetParentRole() {
        ModelRole parentRole = new ModelRole();
        parentRole.setId(1);

        businessRole.setParentRole(parentRole);

        Assertions.assertEquals(parentRole, businessRole.getParentRole());
    }

    @Test
    @DisplayName("Test equals and hashCode")
    void testEqualsAndHashCode() {
        BusinessRole br1 = new BusinessRole();
        BusinessRole br2 = new BusinessRole();
        BusinessRole br3 = new BusinessRole();

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
