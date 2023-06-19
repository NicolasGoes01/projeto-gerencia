package dupradosantini.sostoolbackend.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class WorkspaceTest {

    private Workspace workspace;

    @BeforeEach
    public void setUp() {
        workspace = new Workspace();
    }

    @Test
    @DisplayName("Test setting and getting name")
    void testSetAndGetName() {
        String name = "Sample Workspace";

        workspace.setName(name);

        Assertions.assertEquals(name, workspace.getName());
    }

    @Test
    @DisplayName("Test setting and getting description")
    void testSetAndGetDescription() {
        String description = "Sample description";

        workspace.setDescription(description);

        Assertions.assertEquals(description, workspace.getDescription());
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

        workspace.setTeams(teams);

        Assertions.assertEquals(teams, workspace.getTeams());
    }

    @Test
    @DisplayName("Test setting and getting business roles")
    void testSetAndGetBusinessRoles() {
        Set<BusinessRole> businessRoles = new HashSet<>();

        BusinessRole role1 = new BusinessRole();
        role1.setId(1);
        BusinessRole role2 = new BusinessRole();
        role2.setId(2);

        businessRoles.add(role1);
        businessRoles.add(role2);

        workspace.setBusinessRoles(businessRoles);

        Assertions.assertEquals(businessRoles, workspace.getBusinessRoles());
    }

    @Test
    @DisplayName("Test setting and getting business responsibilities")
    void testSetAndGetBusinessResponsibilities() {
        Set<BusinessResponsibility> businessResponsibilities = new HashSet<>();

        BusinessResponsibility responsibility1 = new BusinessResponsibility();
        responsibility1.setId(1);
        BusinessResponsibility responsibility2 = new BusinessResponsibility();
        responsibility2.setId(2);

        businessResponsibilities.add(responsibility1);
        businessResponsibilities.add(responsibility2);

        workspace.setBusinessResponsibilities(businessResponsibilities);

        Assertions.assertEquals(businessResponsibilities, workspace.getBusinessResponsibilities());
    }

    @Test
    @DisplayName("Test setting and getting members")
    void testSetAndGetMembers() {
        Set<WorkspaceMember> members = new HashSet<>();

        WorkspaceMember member1 = new WorkspaceMember();
        member1.setId(1);
        WorkspaceMember member2 = new WorkspaceMember();
        member2.setId(2);

        members.add(member1);
        members.add(member2);

        workspace.setMembers(members);

        Assertions.assertEquals(members, workspace.getMembers());
    }

    @Test
    @DisplayName("Test setting and getting activities")
    void testSetAndGetActivities() {
        List<Activity> activities = new ArrayList<>();

        Activity activity1 = new Activity();
        activity1.setId(1);
        Activity activity2 = new Activity();
        activity2.setId(2);

        activities.add(activity1);
        activities.add(activity2);

        workspace.setActivities(activities);

        Assertions.assertEquals(activities, workspace.getActivities());
    }

    @Test
    @DisplayName("Test equals and hashCode")
    void testEqualsAndHashCode() {
        Workspace workspace1 = new Workspace();
        Workspace workspace2 = new Workspace();
        Workspace workspace3 = new Workspace();

        // Same ID and name, should be equal
        workspace1.setId(1);
        workspace1.setName("Workspace 1");

        workspace2.setId(1);
        workspace2.setName("Workspace 1");

        Assertions.assertEquals(workspace1, workspace2);
        Assertions.assertEquals(workspace1.hashCode(), workspace2.hashCode());

        // Different ID, should not be equal
        workspace3.setId(2);
        workspace3.setName("Workspace 1");

        Assertions.assertNotEquals(workspace1, workspace3);
        Assertions.assertNotEquals(workspace1.hashCode(), workspace3.hashCode());
    }
}
