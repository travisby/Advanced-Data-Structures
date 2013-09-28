Meta:

Narrative:
As a user
I want to access the beginning of the list after I hit the end
So that I can create an infinite loop

Scenario: Return to First Element
Given a circularlist size 5
When I get item 6
Then it is item 1
