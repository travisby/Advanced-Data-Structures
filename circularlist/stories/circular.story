Meta:

Narrative:
As a user
I want to access the beginning of the list after I hit the end
So that I can create an infinite loop

Scenario: Return to First Element
Given a circularlist size 5 with items [1,2,3,4,5]
When I get item 6
Then it is item 1

Scenario: IndexOutOfBoundsException gets thrown when getting a negative index
Given a circularlist size 1 with items [1]
When I get item -1
Then throws IndexOutOfBoundsException

Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index
Given a circularlist size 0 with items []
When I add item -1 to index -1
Then throws IndexOutOfBoundsException

Scenario: IndexOutOfBoundsException gets thrown when adding to a negative index
Given a circularlist size 0 with items []
When I remove item -1
Then throws IndexOutOfBoundsException

