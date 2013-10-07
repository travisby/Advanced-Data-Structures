import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import list.tests.ListSteps;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

/**
 * Created by Travis on 10/6/13.
 */

@RunWith(JUnitReportingRunner.class)

public class CircularListTest extends JUnitStory {
    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats())
                .usePendingStepStrategy(new FailingUponPendingStep())
                ;
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new ListSteps(), new CircularListSteps());

    }
}
