# Practical tasks
(https://university.epam.com/courses/EPAM/0059/2016_1/courseware/409eb788e67b42f68235a6cd55ff6cbd/26123ea0d22f48969e00d9b75c166446/)
Time: 8-16 hours
**Expected result:show demonstration and provide code.**
https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet

## Task description:

Create Spring application with the following services and logic using either XML or Annotation configuration. 
Create domain objects as needed. Create DAO classes for storing data in simple static maps 
(later, they will be replaced for storing data in DB).

Application for managing a Movie Theater. 

Allows for admins to enter events, view purchased tickets. 
Allows for users to register, view events with air dates and times, get ticket price, buy tickets.

There is no application UI for now. 
Create a simple console application that demonstrates the work. 
Additionally, unit tests could also be created.

Use Maven for building a project. 
Use latest Spring 3 version (3.x.x)

@ Services and their descriptions:

# UserService - Manages registered users
- +register
- +remove
- +getById
- +getUserByEmail
- +getUsersByName
- !getBookedTickets

# EventService - Manages events (movie shows).
Event contains only basic information:
    name, base price for tickets, rating (high, mid, low).
Event can be presented on several dates and several times within each day. 
For each dateTime an Event will be presented only in single auditorium.

- +create
- +remove
- +getByName
- +getAll
- !assignAuditorium(event, auditorium, date) - assign auditorium for event for specific date.
Only one auditorium for Event for specific dateTime
- getForDateRange(from, to) - returns events for specified date range (OPTIONAL)
- getNextEvents(to) - returns events from now till the ‘to’ date (OPTIONAL)

# AuditoriumService - Returns info about auditoriums and places
Since auditorium information is usually static, store it in some property file. 
The information that needs to be stored is:
   name
   number of seats
   vip seats (comma-separated list of expensive seats)

Several auditoriums can be stored in separate property files, information from them could be injected into the AuditoriumService
 - getAuditoriums(), getSeatsNumber(), getVipSeats()

# BookingService - Manages tickets, prices, bookings

- getTicketPrice(event, date, time, seats, user) - returns price for ticket for specified event on specific date and time for 
specified seats.
  User is needed to calculate discount (see below)
  Event is needed to get base price, rating
  Vip seats should cost more than regular seats (For example, 2xBasePrice)
  All prices for high rated movies should be higher (For example, 1.2xBasePrice)
- bookTicket(user, ticket) - user could  be registered or not.
If user is registered, then booking information is stored for that user. Purchased tickets for particular event should be stored
- getTicketsForEvent(event, date) - get all purchased tickets for event for specific date

# DiscountService - Counts different discounts for purchased tickets
- getDiscount(user, event, date) - returns discount for each ticket for the user on particular event
- DiscountStrategy - single class with logic for calculating discount
   Birthday strategy - give 5% if user has birthday
   Every 10th ticket - give 50% for every 10th ticket purchased by user
- All discount strategies should be injected as list into the DiscountService. The getDiscount method will execute each strategy to get max available discount.
- Define DiscountService with all strategies as separate beans in separate configuration file (either separate XML or separate Java config class)
