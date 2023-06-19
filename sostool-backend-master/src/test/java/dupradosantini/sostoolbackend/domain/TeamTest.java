package dupradosantini.sostoolbackend.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class TeamTest {

    private Team team;

    @BeforeEach
    public void setUp() {
        team = new Team();
    }

    @Test
    @DisplayName("Test setting and getting name")
    void testSetAndGetName() {
        String name = "Sample Team";

        team.setName(name);

        Assertions.assertEquals(name, team.getName());
    }

    @Test
    @DisplayName("Test setting and getting workspace")
    void testSetAndGetWorkspace() {
        Workspace workspace = new Workspace();
        workspace.setId(1);

        team.setWorkspace(workspace);

        Assertions.assertEquals(workspace, team.getWorkspace());
    }

    @Test
    @DisplayName("Test setting and getting team assigned roles")
    void testSetAndGetTeamAssignedRoles() {
        Set<BusinessRole> teamAssignedRoles = new HashSet<>();

        BusinessRole role1 = new BusinessRole();
        role1.setId(1);
        BusinessRole role2 = new BusinessRole();
        role2.setId(2);

        teamAssignedRoles.add(role1);
        teamAssignedRoles.add(role2);

        team.setTeamAssignedRoles(teamAssignedRoles);

        Assertions.assertEquals(teamAssignedRoles, team.getTeamAssignedRoles());
    }

    @Test
    @DisplayName("Test equals and hashCode")
    void testEqualsAndHashCode() {
        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();

        // Same ID, name, and workspace, should be equal
        team1.setId(1);
        team1.setName("Team 1");
        team1.setWorkspace(new Workspace());

        team2.setId(1);
        team2.setName("Team 1");
        team2.setWorkspace(new Workspace());

        Assertions.assertEquals(team1.getName(), team2.getName());
        Assertions.assertEquals(team1.hashCode(), team2.hashCode());

        // Different ID, should not be equal
        team3.setId(2);
        team3.setName("Team 1");
        team3.setWorkspace(new Workspace());

        Assertions.assertNotEquals(team1, team3);
        Assertions.assertNotEquals(team1.hashCode(), team3.hashCode());
    }
}
