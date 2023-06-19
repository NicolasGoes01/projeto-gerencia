package dupradosantini.sostoolbackend.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class WorkspaceMemberTest {

    private WorkspaceMember workspaceMember;

    @BeforeEach
    public void setUp() {
        workspaceMember = new WorkspaceMember();
    }

    @Test
    @DisplayName("Test setting and getting appUser")
    void testSetAndGetAppUser() {
        AppUser appUser = new AppUser();
        appUser.setId(1);

        workspaceMember.setAppUser(appUser);

        Assertions.assertEquals(appUser, workspaceMember.getAppUser());
    }

    @Test
    @DisplayName("Test setting and getting businessRole")
    void testSetAndGetBusinessRole() {
        BusinessRole businessRole = new BusinessRole();
        businessRole.setId(1);

        workspaceMember.setBusinessRole(businessRole);

        Assertions.assertEquals(businessRole, workspaceMember.getBusinessRole());
    }

    @Test
    @DisplayName("Test setting and getting workspace")
    void testSetAndGetWorkspace() {
        Workspace workspace = new Workspace();
        workspace.setId(1);

        workspaceMember.setWorkspace(workspace);

        Assertions.assertEquals(workspace, workspaceMember.getWorkspace());
    }

    @Test
    @DisplayName("Test setting and getting activities")
    void testSetAndGetActivities() {
        Set<Activity> activities = new HashSet<>();

        Activity activity1 = new Activity();
        activity1.setId(1);
        Activity activity2 = new Activity();
        activity2.setId(2);

        activities.add(activity1);
        activities.add(activity2);

        workspaceMember.setActivities(activities);

        Assertions.assertEquals(activities, workspaceMember.getActivities());
    }

    @Test
    @DisplayName("Test setting and getting startDate")
    void testSetAndGetStartDate() {
        Date startDate = new Date();

        workspaceMember.setStartDate(startDate);

        Assertions.assertEquals(startDate, workspaceMember.getStartDate());
    }

    @Test
    @DisplayName("Test setting and getting endDate")
    void testSetAndGetEndDate() {
        Date endDate = new Date();

        workspaceMember.setEndDate(endDate);

        Assertions.assertEquals(endDate, workspaceMember.getEndDate());
    }

    @Test
    @DisplayName("Test constructor")
    void testConstructor() {
        AppUser appUser = new AppUser();
        BusinessRole businessRole = new BusinessRole();
        Workspace workspace = new Workspace();
        Date startDate = new Date();

        WorkspaceMember member = new WorkspaceMember(appUser, businessRole, workspace, startDate);

        Assertions.assertEquals(appUser, member.getAppUser());
        Assertions.assertEquals(businessRole, member.getBusinessRole());
        Assertions.assertEquals(workspace, member.getWorkspace());
        Assertions.assertEquals(startDate, member.getStartDate());
    }

    @Test
    @DisplayName("Test equals and hashCode")
    void testEqualsAndHashCode() {
        WorkspaceMember member1 = new WorkspaceMember();
        WorkspaceMember member2 = new WorkspaceMember();
        WorkspaceMember member3 = new WorkspaceMember();

        // Same ID and attributes, should be equal
        member1.setId(1);
        member1.setStartDate(new Date());
        member2.setId(1);
        member2.setStartDate(new Date());

        Assertions.assertNotEquals(member1, member2);
        Assertions.assertNotEquals(member1.hashCode(), member2.hashCode());

        // Different ID, should not be equal
        member3.setId(2);
        member3.setStartDate(new Date());

        Assertions.assertNotEquals(member1, member3);
        Assertions.assertNotEquals(member1.hashCode(), member3.hashCode());
    }
}
