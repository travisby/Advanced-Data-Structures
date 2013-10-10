package circularlist.tests;

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
public class CircularListTest extends JUnitStories {
    private Configuration configuration;

    public CircularListTest() {
        super();
        configuration = new MostUsefulConfiguration();
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("circularlist/tests/circular_list_test.story");

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
/*
    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats())
                .usePendingStepStrategy(new FailingUponPendingStep())
                .useStoryControls(
                        new StoryControls()
                                .doSkipScenariosAfterFailure(true)
                                .doResetStateBeforeScenario(true)
                                .doResetStateBeforeStory(true)
                                .doSkipBeforeAndAfterScenarioStepsIfGivenStory(true)
                );
    }
               */
