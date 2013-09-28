/**
 * User: Travis Beatty
 * Date: 9/28/13
 * Time: 5:59 PM
 */

import junit.framework.Assert;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@SuppressWarnings({"InstanceVariableOfConcreteClass", "SuppressionAnnotation", "UnusedDeclaration", "Annotation", "ClassWithoutLogger", "PublicMethodWithoutLogging", "ClassHasNoToStringMethod"})
class CircularListSteps<E> {

    private CircularListArrayBased<E> arrayBased = null;
    private CircularListReferenceBased<E> referenceBased = null;
    private E arrayBasedItem = null;
    private E referenceBasedItem = null;

    CircularListSteps() {
    }

    @Given("a circularlist size $size with items $items")
    public final void setList(int size, E[] items) {
        arrayBased = new CircularListArrayBased<E>();
        referenceBased = new CircularListReferenceBased<E>();
        for (int i = 0; i < size; i++) {
            arrayBased.add(i, items[i]);
            referenceBased.add(i, items[i]);
        }
    }

    @When("I get item $index")
    public final void getItem(int index) {
        arrayBasedItem = arrayBased.get(index);
        referenceBasedItem = referenceBased.get(index);
    }

    @Then("it is item $index")
    public final void isEqualToItemAtIndex(int index) {
        Assert.assertEquals(arrayBased.get(index), arrayBasedItem);
        Assert.assertEquals(referenceBased.get(index), referenceBasedItem);
    }
}
