package list.tests; /**
 * User: Travis Beatty
 * Date: 9/28/13
 * Time: 5:59 PM
 */

import list.ArrayList;
import list.LinkedList;
import org.jbehave.core.annotations.AsParameterConverter;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.util.List;

@SuppressWarnings({"InstanceVariableOfConcreteClass", "ClassWithTooManyFields", "SuppressionAnnotation", "Annotation", "ClassIndependentOfModule", "ConstantNamingConvention"})
public class ListSteps {

    private int integerReturn;
    private boolean booleanReturn;
    private int itemReturn;
    private ArrayList<Integer> arrayBased;
    // private LinkedList<Integer> referenceBased = null;
    private LinkedList<Integer> referenceBased;

    private int arrayBasedItem;
    private int referenceBasedItem;
    private Exception thrownByArrayBased;
    private Exception thrownByReferenceBased;
    private boolean arrayBasedBooleanReturn;
    private boolean referenceBasedBooleanReturn;
    private int arrayBasedIntReturn;
    private int referenceBasedIntReturn;

    @AsParameterConverter
    public boolean toBool(String s) {
        if (s.equals("true")) {
            return true;
        }
        return false;
    }

    @Given("an empty list")
    public void setListEmpty() {
        arrayBased = new ArrayList<Integer>();
        // referenceBased = new LinkedList<Integer>();
        referenceBased = new LinkedList<Integer>();

    }

    @Given("a list size $size with items $items")
    public void setList(int size, List<Integer> items) {
        arrayBased = new ArrayList<Integer>();
        // referenceBased = new LinkedList<Integer>();
        referenceBased = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            arrayBased.add(i, items.get(i));
            referenceBased.add(i, items.get(i));
        }
    }


    @When("I get item $index")
    public void getItem(int index) {
        try {
            arrayBasedItem = arrayBased.get(index);
        } catch (IndexOutOfBoundsException e) {
            thrownByArrayBased = e;
        }

        try {
            referenceBasedItem = referenceBased.get(index);
        } catch (IndexOutOfBoundsException e) {
            thrownByReferenceBased = e;
        }
    }

    @When("I add item $item to index $index")
    public void addItem(int item, int index) {
        try {
            arrayBased.add(index, item);
        } catch (IndexOutOfBoundsException e) {
            thrownByArrayBased = e;
        }

        try {
            referenceBased.add(index, item);
        } catch (IndexOutOfBoundsException e) {
            thrownByReferenceBased = e;
        }
    }

    @When("I remove item $index")
    public void removeItem(int index) {
        try {
            arrayBasedItem = arrayBased.remove(index);
        } catch (IndexOutOfBoundsException e) {
            thrownByArrayBased = e;
        }

        try {
            referenceBasedItem = referenceBased.remove(index);
        } catch (IndexOutOfBoundsException e) {
            thrownByReferenceBased = e;
        }
    }

    @When("I ask if it is an empty list")
    public void setIsEmpty() {
        arrayBasedBooleanReturn = arrayBased.isEmpty();
        referenceBasedBooleanReturn = referenceBased.isEmpty();
    }

    @When("I add item $item to the end of the list")
    public void addItemToEnd(int item) {
        try {
            arrayBasedBooleanReturn = arrayBased.add(item);
        } catch (Exception e) {
            thrownByArrayBased = e;
        }

        try {
            referenceBasedBooleanReturn = referenceBased.add(item);
        } catch (Exception e) {
            thrownByReferenceBased = e;
        }
    }

    @When("I ask for the size")
    public void setSize() {
        arrayBasedIntReturn = arrayBased.size();
        referenceBasedIntReturn = referenceBased.size();
    }

    @When("I clear the list")
    public void clear() {
        arrayBased.clear();
        referenceBased.clear();

        arrayBasedIntReturn = arrayBased.size();
        referenceBasedIntReturn = referenceBased.size();
    }

    @Then("it is item $value")
    public void isEqualToItemAtIndex(int value) {
        Assert.assertEquals(value, arrayBasedItem);
        Assert.assertEquals(value, referenceBasedItem);

        // manually reset...
        arrayBasedItem = -1;
        referenceBasedItem = -1;
    }

    @SuppressWarnings("NestedMethodCall")
    @Then("throws IndexOutOfBoundsException")
    public void whenThrew() {
        Assert.assertEquals(IndexOutOfBoundsException.class, thrownByArrayBased.getClass());
        Assert.assertEquals(IndexOutOfBoundsException.class, thrownByReferenceBased.getClass());

        // manually reset them since the runner classes don't seem to...
        thrownByArrayBased = null;
        thrownByReferenceBased = null;
    }

    // Don't ask why!
    @Then("throws $garbage")
    public void throwsGarbage(String garbage) {
        whenThrew();
    }

    @Then("our list is empty")
    public void emptyList() {
        // TODO
    }

    @Then("our list is $list")
    public void ourListIs(List<Integer> list) {
        // TODO
    }

    @Then("the boolean return should be $tf")
    public void boolReturn(boolean tf) {
        Assert.assertTrue(tf == arrayBasedBooleanReturn);
        Assert.assertTrue(tf == referenceBasedBooleanReturn);

        // reset...
        arrayBasedBooleanReturn = false;
        referenceBasedBooleanReturn = false;
    }

    @Then("the item return should be $item")
    public void itemReturn(int item) {
        Assert.assertEquals(item, arrayBasedItem);
        Assert.assertEquals(item, referenceBasedItem);

        // reset...
        arrayBasedItem = -1;
        referenceBasedItem = -1;
    }

    @Then("the integer return should be $value")
    public void intReturn(int value) {
        Assert.assertEquals(value, arrayBasedIntReturn);
        Assert.assertEquals(value, referenceBasedIntReturn);

        // reset...
        arrayBasedIntReturn = -1;
        referenceBasedIntReturn = -1;
    }

    @Then("the size should be $size")
    public void isSize(int size) {
        Assert.assertEquals(size, arrayBasedIntReturn);
        Assert.assertEquals(size, referenceBasedIntReturn);

        // reset...
        arrayBasedIntReturn = -1;
        referenceBasedIntReturn = -1;
    }

    @Then("the boolean return should be $bool")
    public void boolResult(boolean bool) {
        Assert.assertEquals(bool, arrayBasedBooleanReturn);
        Assert.assertEquals(bool, referenceBasedBooleanReturn);

        // reset...
        arrayBasedBooleanReturn = false;
        referenceBasedBooleanReturn = false;
    }

}
