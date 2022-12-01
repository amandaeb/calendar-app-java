#Use Case: Create Conference Link
##Preconditions:
- The user selects the conference link menu.
  Invariants:
- The terminal is not closed
##Postconditions:
- A new conference link is created.
##Steps:
1. The user enters CONFERENCELINKS.
2. The user enters CREATE
3. The user enters an event id
4. The software creates and displays a conference link

#Use Case: Return A Conference Link That Was Already Created
##Preconditions:
- The user selects the conference link menu.
- User selects GET from conference link menu
  Invariants:
- The terminal is not closed
- The event Id exists
##Postconditions:
- The app prints the conference link
##Steps:
1.The user selects the conference link menu. 
2. User selects GET from conference link menu
3. app prompts for an event id
4. the app displays the event id and conference link

#Use Case: Delete A Conference Link That Was Already Created
##Preconditions:
- The user selects the conference link menu.
- User selects Delete from conference link menu
  Invariants:
- The terminal is not closed
- The event Id exists
##Postconditions:
- The event is deleted
##Steps:
1.The user selects the conference link menu.
2. User selects Delete from conference link menu
3. app prompts for an event id
4. the software deletes the event
5. App displays "done"

#Use Case: Create A Conference Link for a Non-Existent Event
##Preconditions:
- The user selects the conference link menu.
- User selects Create from conference link menu
  Invariants:
- The terminal is not closed
##Postconditions:
- No conference link is created
##Steps:
1.The user selects the conference link menu.
2. User selects Create from conference link menu
3. app prompts for an event id
4. the software checks for the event
5. App displays "Event does not exist"

#Use Case: Get A Conference Link for a Non-Existent Event
##Preconditions:
- The user selects the conference link menu.
- User selects Get from conference link menu
  Invariants:
- The terminal is not closed
  ##Postconditions:
- No conference is displayed
  ##Steps:
  1.The user selects the conference link menu.
2. User selects Get from conference link menu
3. app prompts for an event id
4. the software checks for the event
5. App displays "Conference link does not exist"

#Use Case: Join A Conference Link for a Non-Existent Event
##Preconditions:
- The user selects the conference link menu.
- User selects Join from conference link menu
  Invariants:
- The terminal is not closed
  ##Postconditions:
- Nothing changes
  ##Steps:
  1.The user selects the conference link menu.
2. User selects Join from conference link menu
3. app prompts for an event id
4. the software checks for the event
5. App displays "Conference link does not exist"

#Use Case: Get A Conference Link for a Non-Existent Conference Link
##Preconditions:
- The user selects the conference link menu.
- User selects Get from conference link menu
- valid event id
  Invariants:
- The terminal is not closed
  ##Postconditions:
- No conference is displayed
  ##Steps:
1.The user selects the conference link menu.
2. User selects Get from conference link menu
3. app prompts for an event id
4. the software checks for the event
5. App displays "Conference link does not exist"

#Use Case: Join A Conference Link for a Non-Existent Conference Link
##Preconditions:
- The user selects the conference link menu.
- User selects JOIN from conference link menu
- valid event id
  Invariants:
- The terminal is not closed
  ##Postconditions:
- No conference is displayed
  ##Steps:
  1.The user selects the conference link menu.
2. User selects join from conference link menu
3. app prompts for an event id
4. the software checks for the event
5. App displays "Conference link does not exist"
