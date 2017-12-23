package com.example.android.architecture.blueprints.todoapp.root.task_flow.task_details_flow;

import com.uber.rib.core.RibTestBasePlaceholder;
import com.uber.rib.core.EmptyPresenter;
import com.uber.rib.core.InteractorHelper;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TaskDetailsFlowInteractorTest extends RibTestBasePlaceholder {

    @Mock EmptyPresenter presenter;
    @Mock TaskDetailsFlowRouter router;

    private TaskDetailsFlowInteractor interactor;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        interactor = TestTaskDetailsFlowInteractor.create();
    }

    /**
     * TODO: Delete this example and add real tests.
     */
    @Test
    public void anExampleTest_withSomeConditions_shouldPass() {
        // Use InteractorHelper to drive your interactor's lifecycle.
        InteractorHelper.attach(interactor, presenter, router, null);
        InteractorHelper.detach(interactor);

        throw new RuntimeException("Remove this test and add real tests.");
    }

}
