package dupradosantini.sostoolbackend.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

public class TestActivity {

    private Activity activity;

    @Mock
    private Workspace workspace;

    @Mock
    private Set<WorkspaceMember> workspaceMembers;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        activity = new Activity("Test Activity");
        activity.setWorkspace(workspace);
        activity.setWorkspaceMember(workspaceMembers);
    }

    @Test
    public void testActivityInitialization() {
        Assertions.assertEquals("Test Activity", activity.getName());
        Assertions.assertEquals(ActivityState.NOT_STARTED, activity.getState());
    }

    @Test
    public void testActivitySettersAndGetters() {
        // Test getters
        Assertions.assertEquals("Test Activity", activity.getName());
        Assertions.assertNull(activity.getDescription());
        Assertions.assertEquals(workspace, activity.getWorkspace());
        Assertions.assertEquals(workspaceMembers, activity.getWorkspaceMember());
        Assertions.assertEquals(ActivityState.NOT_STARTED, activity.getState());

        // Test setters
        activity.setName("Updated Activity");
        activity.setDescription("Activity Description");
        activity.setState(ActivityState.IN_PROGRESS);

        Assertions.assertEquals("Updated Activity", activity.getName());
        Assertions.assertEquals("Activity Description", activity.getDescription());
        Assertions.assertEquals(ActivityState.IN_PROGRESS, activity.getState());
    }
}
