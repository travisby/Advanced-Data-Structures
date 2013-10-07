/**
 * User: Travis Beatty
 * Date: 9/28/13
 * Time: 5:59 PM
 */

import circularlist.CircularListArrayBased;
import circularlist.CircularListReferenceBased;
import org.jbehave.core.annotations.Given;

import java.util.List;

@SuppressWarnings({"InstanceVariableOfConcreteClass", "SuppressionAnnotation", "UnusedDeclaration", "Annotation", "ClassWithoutLogger", "PublicMethodWithoutLogging", "ClassHasNoToStringMethod", "ClassWithTooManyFields", "UnqualifiedFieldAccess", "LocalCanBeFinal", "AssertEqualsMayBeAssertSame", "MessageMissingOnJUnitAssertion", "UseOfObsoleteAssert", "InstanceVariableNamingConvention", "NonBooleanMethodNameMayNotStartWithQuestion"})
class CircularListSteps {

    @SuppressWarnings("FieldMayBeStatic")
    private final int integerReturn = 0;
    @SuppressWarnings("FieldMayBeStatic")
    private final boolean booleanReturn = false;
    private final int itemReturn = 0;
    private CircularListArrayBased<Integer> arrayBased = null;
    private CircularListReferenceBased<Integer> referenceBased = null;
    private int arrayBasedItem = 0;
    private int referenceBasedItem = 0;
    private Exception thrownByArrayBased = null;
    private Exception thrownByReferenceBased = null;
    private boolean arrayBasedBooleanReturn = false;
    private boolean referenceBasedBooleanReturn = false;
    private int arrayBasedIntegerReturn = 0;
    private int referenceBasedIntegerReturn = 0;

    @Given("a circularlist size $size with items $items")
    public void setList(int size, List<Integer> items) {
        arrayBased = new CircularListArrayBased<Integer>();
        referenceBased = new CircularListReferenceBased<Integer>();
        for (int i = 0; i < size; i++) {
            arrayBased.add(i, items.get(i));
            referenceBased.add(i, items.get(i));
        }
    }

    @Given("a circularlist size 0 with empty circularlist")
    public void emptyList() {
        setList(0, null);
    }
}
