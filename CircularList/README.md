SUMMARY
=======
In this assignment create two implementations of a circular list. This assignment will reinforce
your understanding of interfaces, generics, and iterators.

DEADLINE
========
This assignment is due on Friday, October 11 at 11:00 pm.

SPECIFICATIONS
==============
In this assignment you will create two implementations of a circular list. A circular list wraps
around when an index greater or equal to the size is requested. E.g., if the list contains 5 elements
and index 7 is requested, then the element at index 2 is returned.
Included with the assignment is the ﬁle CircularList.java. This is an interface for a circular
list. You are to create two implementations for this interface. The ﬁrst implementation should be
saved as CircularListArrayBased.java and should be array based. You must use an array as
your core data structure for this implementation. You may not use java.util.ArrayList or another collection from the JCF.
The second implementation should be saved as CircularListReferenceBased.java and
should be reference (linked list) based. This implementation must use a linked list with a node class
that you deﬁne. You may not use java.util.LinkedList or another collection from the JCF.
For both implementations, you must implement all methods in the interface. You must throw the
proper exceptions when negative indexes are requested.
You must also return an iterator to the list. The iterator should visit an inﬁnite sequence of elements, beginning at the ﬁrst, and following the circular pattern. You must deﬁne your own iterator
class (or classes).
All the methods to implement, as well as descriptions of their behavior are included in the interface. Make sure your code behaves correctly. If you have any clariﬁcation questions be sure to ask
via class, oﬃce hours, or email.

JCF
===
Remember, you may not use collection classes from the JCF for this assignment. You must write
your own data structure implementations. You may (and should) use the interfaces
java.util.Iterable and java.util.Iterator. You may not use any other imports from
java.util, or any other collection libraries.

TESTING
=======
Also provided with the assignment is a test ﬁle TestList.java. This provides a simple main
method to test your code. This test is not exhaustive, so you may wish to add to it to test all your
methods.

COMMENTS
========
You must use full Javadoc comments in your program. Be sure to include yourself as the author
of any ﬁles you create.

SUBMISSION
=========
All the classes you create must be in the package circularlist. Submit a zip ﬁle named
circularlist.zip, which has at the root level a directory named circularlist containing the
ﬁles CircularListArrayBased.java and CircularListReferenceBased.java, as well as
your iterator classes and any other classes you create for the assignment. Do not submit the ﬁle
CircularList.java. Do not submit any .class ﬁles or any other ﬁles. Points will be deducted
for incorrectly named ﬁles/directories or erroneous ﬁles



-- Professor Carle
