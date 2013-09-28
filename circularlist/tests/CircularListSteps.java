/**
 * User: Travis Beatty
 * Date: 9/28/13
 * Time: 5:59 PM
 */

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CircularListSteps {

    private CircularListArrayBased<Integer> arrayBased;
    private CircularListReferenceBased<Integer> referenceBased;
    private Integer arrayBasedItem;
    private Integer referenceBasedItem;

    @Given("a circularlist size $size")
    public void setList(int size) {
        arrayBased = new CircularListArrayBased<Integer>();
        referenceBased = new CircularListReferenceBased<Integer>();
        for (int i = 0; i < size; i++) {
            arrayBased.add(i, i);
            referenceBased.add(i, i);
        }
    }

    @When("I get item $index")
    public void getItem(int index) {
        arrayBasedItem = arrayBased.get(index);
        referenceBasedItem = referenceBased.get(index);
    }

    @Then("it is item $index")
    public void isEqualToItemAtIndex(int index) {
        // TODO
    }
}
