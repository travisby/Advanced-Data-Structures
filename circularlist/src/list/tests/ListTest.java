package list.tests;

import circularlist.tests.CircularListSteps;
import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Travis on 10/6/13.
 */
@RunWith(JUnitReportingRunner.class)
public class ListTest extends JUnitStories {
    private Configuration configuration;

    public ListTest() {
        super();
        configuration = new MostUsefulConfiguration();
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("list/tests/list_test.story");

    }

    @Override
    public Configuration configuration() {
        return configuration;
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new CircularListSteps());
    }
}