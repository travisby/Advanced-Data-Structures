// return value when performing on empty
// return value when performing on filled
// state change on empty
// state change on filled

// return value on index = 0
// return value on 0 < index < size - 1
// return value on index = size - 1
// return value on index = size
// return value on index = 2 * size + 1
// state change value on index = 0
// state changevalue on 0 < index < size - 1
// state change value on index = size - 1
// state change value on index = size
// state change value on index = 2 * size + 1

// return value when index = -1 with empty list
// return value when index = -1 with full list
// state change when index = -1 with empty list
// state change when index = -1 with full list


/*
 *
 * get(int)
 *
*/

// return value when performing on empty
// TODO
// Scenario: Gettingg an element from an empty list should... ?
// Given a circularlist size 0 with items []
// When I get item 0
// Then ... ?

// return value when performing on filled
Scenario: get(int) should return the item in position int with a full list
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 0
Then it is item 0

// state change on empty
// TODO
// See Scenario: Gettingg an element from an empty list should... ?

// state change on filled
Scenario: get(int) should not change state of a full list while accessing 0th element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 0
Then our list is [0, 1, 2, 3, 4]

// return value on index = 0
// See Scenario: get(int) should return the item in position int with a full list

// return value on 0 < index < size - 1
Scenario: get(int) should return the item in position int with a full list while accessing a middle element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 2
Then it is item 2

// return value on index = size - 1
Scenario: get(int) should return the item in position int with a full list while accessing the last element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 4
Then it is item 4

// return value on index = size
Scenario: get(int) should return the item in position int with a full list while looping
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 5
Then it is item 0

// return value on index = 2 * size + 1
Scenario: get(int) should return the item in position int with a full list while looping multiple times
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 11
Then it is item 1

// state change on index = 0
// See Scenario: get(int) should not change state of a full list

// state change on 0 < index < size - 1
Scenario: get(int) should not change state of a full list while accessing the middle element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 3
Then our list is [0, 1, 2, 3, 4]

// state change on index = size - 1
Scenario: get(int) should not change state of a full list while accessing the last element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 4
Then our list is [0, 1, 2, 3, 4]

// state change on index = size
Scenario: get(int) should not change state of a full list while looping
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 5
Then our list is [0, 1, 2, 3, 4]

// state change on index = 2 * size + 1
Scenario: get(int) should not change state of a full list while looping multiple times
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I get item 11
Then our list is [0, 1, 2, 3, 4]

// return value when index = -1 with empty list
Scenario: IndexOutOfBoundsException gets thrown when getting a negative index of empty list
Given a circularlist size 0 with items []
When I get item -1
Then throws IndexOutOfBoundsException

// return value index = -1 with full list
Scenario: IndexOutOfBoundsException gets thrown when getting a negative index of a full list
Given a circularlist size 1 with items [1]
When I get item -1
Then throws IndexOutOfBoundsException

// state change when index = -1 with empty list
// See Scenario: IndexOutOfBoundsException gets thrown when getting a negative index of empty list

// state change when index = -1 with full list
// See Scenario: IndexOutOfBoundsException gets thrown when getting a negative index of a full list



/*
 *
 * add(E)
 *
*/

// return value when performing on empty
Scenario: Adding an item to an empty list should return true
Given a circularlist size 0 with items []
When I add item 0 to the end of the list
Then the boolean return should be true

// return value when performing on filled
Scenario: Adding an item to a filled list should return true
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I add item 5 to the end of the list
Then the boolean return should be true

// state change on empty
Scenario: Adding an item to an empty list should make the list have only our element
Given a circularlist size 0 with items []
When I add item 0 to the end of the list
Then our list is [0]

// state change on filled
Scenario: Adding an item to the end of the list adds our element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I add item 5 to the end of the list
Then our list is [0, 1, 2, 3, 4, 5]

 // return value when index = -1 with empty list
Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index on an empty list
Given a circularlist size 0 with items []
When I add item -1 to the end of the list
Then throws IndexOutOfBoundsException

 // return value when index = -1 with full list
Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index on a filled list
Given a circularlist size 10 with items [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
When I add item -1 to the end of the list
Then throws IndexOutOfBoundsException

// state change when index = -1 with empty list
// See Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index on an empty list

// state change when index = -1 with full list
// See Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index on a filled list


/*
 *
 * add(index, E)
 *
*/

// TODO
// return value when performing on empty
// Scenario: Adding an item to an empty list should return true
// Given a circularlist size 0 with items []
// When I add item 0 to index 5
// Then ... ?

// return value when performing on filled
// void

// state change on empty
Scenario: Adding an item to an empty list should make the list have only our element
Given a circularlist size 0 with items []
When I add item 0 to index 0
Then our list is [0]

// state change on filled
Scenario: Adding an item to the end of the list adds our element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I add item 5 to index 5
Then our list is [0, 1, 2, 3, 4, 5]

// return value on index = 0
// void

// return value on 0 < index < size - 1
// void

// return value on index = size - 1
// void

// return value on index = size
// void

// return value on index = 2 * size + 1
// void

// state change value on index = 0
Scenario: Adding an item to the beginning of the list shifts all elements
Given a circularlist size 5 with items [1, 2, 3, 4, 5]
When I add item 0 to index 0
Then our list is [0, 1, 2, 3, 4, 5]

// state changevalue on 0 < index < size - 1
Scenario: Adding an item to the middle of the list shifts other elements
Given a circularlist size 5 with items [0, 1, 2, 3, 5]
When I add item 4 to index 4
Then our list is [0, 1, 2, 3, 4, 5]

// state change value on index = size - 1
Scenario: Addng an item to the end of our list adds it to the end
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I add item 5 to index 5
Then our list is [0, 1, 2, 3, 4, 5]

// state change value on index = size
Scenario: Adding an item to the end+1 of our list adds it to the beginning
Given a circularlist size 5 with items [1, 2, 3, 4, 5]
When I add item 0 to index 6
Then our list is [0, 1, 2, 3, 4, 5]

// state change value on index = 2 * size + 1
Scenario: Addng an item should add items while looping multiple times
Given a circularlist size 5 with items [1, 2, 3, 4, 5]
When I add item 0 to index 11
Then our list is [0, 1, 2, 3, 4, 5]

// return value when index = -1 with empty list
// void

// return value when index = -1 with full list
// void

// state change when index = -1 with empty list
Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index on an empty list
Given a circularlist size 0 with items []
When I add item -1 to index -1
Then throws IndexOutOfBoundsException

// state change when index = -1 with full list
Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index on a filled list
Given a circularlist size 10 with items [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
When I add item -1 to index -1
Then throws IndexOutOfBoundsException



/*
 *
 * remove(int)
 *
*/

// return value when performing on empty
// TODO
// Scenario: Removing an element from an empty list should... ?
// Given a circularlist size 0 with items []
// When I remove item 0
// Then ... ?

// return value when performing on filled
Scenario: Removing an element from the beginning of the list should return that item
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 0
Then the item return should be 0

// state change on empty
// TODO
// Scenario: Removing an element from an empty list should... ?

// state change on filled
Scenario: Removing an element from a size 1 list should then give us an empty list
Given a circularlist size 1 with items [0]
When I remove item 0
Then our list is []

// return value on index = 0
Scenario: Removing element 0 of a filled list should return element 0
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 0
Then the item return should be 0

// return value on 0 < index < size - 1
Scenario: Removing a middle element of a filled list should return that element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 2
Then the item return should be 2

// return value on index = size - 1
Scenario: Removing the last element of a filled list should return that element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 4
Then the item return should be 4

// return value on index = size
Scenario: Removing the last+1 element of a filled list should return the first element
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 5
Then the item return should be 0

// return value on index = 2 * size + 1
Scenario: Removing an element from multiple loops should wrap.
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 11
Then the item return should be 1

// state changee on index = 0
Scenario: Removing element 0 of a filled list should remove that item
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 0
Then our list is [1, 2, 3, 4]

// return value on 0 < index < size - 1
Scenario: Removing a middle element of a filled list should remove that item
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 2
Then our list is [0, 1, 3, 4]

// return value on index = size - 1
Scenario: Removing the last element of a filled list should remove that itemt
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 4
Then our list is [0, 1, 2, 3]

// return value on index = size
Scenario: Removing the last+1 element of a filled list should remove that itemt
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 5
Then our list is [1, 2, 3, 4]

// return value on index = 2 * size + 1
Scenario: Removeng an element from multiple loops should wrap.
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item 11
Then our list is [0, 2, 3, 4]

// return value when index = -1 with empty list
Scenario: IndexOutOfBoundsException gets thrown when removing a negative index with an empty list
Given a circularlist size 0 with items []
When I remove item -1
Then throws IndexOutOfBoundsException

// return value when index = -1 with full list
Scenario: IndexOutOfBoundsException gets thrown when removing aa negative index with a filled list
Given a circularlist size 5 with items [0, 1, 2, 3, 4]
When I remove item -1
Then throws IndexOutOfBoundsException

// state change when index = -1 with empty list
// See Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index with an empty list

// state change when index = -1 with full list
// See Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index with a filled list


/*
 *
 * isEmpty()
 *
*/

// return value when performing on empty
Scenario: isEmpty() should return True on 0 item list
Given a circularlist size 0 with items []
When I ask if it is an empty list
Then the boolean return should be True

// return value when performing on filled
Scenario: isEmpty() should return False on 1 item list
Given a circularlist size 1 with items [0]
When I ask if it is an empty list
Then the boolean return should be False

// state change on empty
Scenario: isEmpty() should not change anything when run with an empty list
Given a circularlist size 0 with items []
When I ask if it is an empty list
Then our list is []

// state change on filled
Scenario: isEmpty() should not change anything when run with a filled list
Given a circularlist size 1 with items [0]
When I ask if it is an empty list
Then our list is [0]


// Extra
Scenario: isEmpty() should return False on 10 item list
Given a circularlist size 1 with items [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
When I ask if it is an empty list
Then the boolean return should be False


/*
 *
 * size()
 *
/*

// return value when performing on empty
Scenario: size() should return 0 on empty list
Given a circularlist size 0 with items []
When I ask for the size
Then the integer return should be 0

// return value when performing on filled
Scenario: size() should return 1 on list of 1
Given a circularlist size 1 with items [0]
When I ask for the size
Then the integer return should be 1

// state change on empty
Scenario: size() should not change an empty list
Given a circularlist size 0 with items []
When I ask for the size
Then our list is []

// state change on filled
Scenario: size() should not change a filled list
Given a circularlist size 1 with items [0]
When I ask for the size
Then our list is [0]


// Extra
Scenario: size() should return 10 on list of 10
Given a circularlist size 10 with items [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
When I ask for the size
Then the integer return should be 10


/*
 *
 * clear()
 *
*/

// return value when performing on empty
// void method

// return value when performing on filled
// void method

// state change on empty
Scenario: clear() should leave an empty list
Given a circularlist size 0 with items []
When I clear the list
Then the size should be 0

// state change on filled
Scenario: clear() should empty a full list
Given a circularlist size 1 with items [0]
When I clear the list
Then the size should be 0

/*
 *
 * iterator()
 *
*/

// TODO
