Feature: Hotel Reservation in Adactin Application

Scenario:
Given user Launch the application
When user Enters The Username In The Username Field
And  user Enters The Password In The Password Field
Then user Click On The Login Button To Navigate To Search Hotel Page

Scenario:
When user Select The Location From The Location Dropdown Field
And  user Select The Hotels From The Hotels Dropdown Field
And  user Select The Room Type From The Room Type Dropdown Field
And  user Select The Number of Rooms From The Number of Rooms Dropdown Field
And  user Select The Adults per Room From The Adults per Room Dropdown Field
And  user Select The Children per Room From The Children per Room Dropdown Field
Then user Click On The Search Button To Navigate To Select Hotel Page

Scenario:
When user Select The Option From The Option Field
Then user Click On The Continue Button To Navigate To Book A Hotel Page

Scenario:
When user Enters The First Name In The First Name Field
And  user Enters The Last Name In The Last Name Field
And  user Enters The Billing Address In The Billing Address Field
And  user Enters The Credit Card No In The Credit Card No Field
And  user Select The Credit Card Type From The Credit Card Type Dropdown Field
And  user Select The Expiry Date Month From The Expiry Date Month Dropdown Field
And  user Select The Expiry Date Year From The Expiry Date Year Dropdown Field
And  user Enters The CVV Number In The CVV Number Field
Then user Click On The Book Now button To Navigate To Booking Confirmation Page

Scenario:
Then user Click On The My Itinerary Button To Navigate To Booked Itinerary Page

Scenario:
Then user Click On The Logout Button To Logout From The Page