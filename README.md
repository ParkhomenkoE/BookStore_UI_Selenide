# BookStore_UI_Selenide
# QA Automation Project – BookStore

## Project Overview

This project demonstrates end-to-end testing of a BookStore web application:
https://demoqa.com/books

It covers UI automation, API testing, BDD approach, and test management, simulating a real QA workflow.
The project is split into multiple repositories for UI, API, and BDD testing.
This project was created as part of QA automation training and demonstrates practical skills in test automation.

## Tech Stack

* Java
* Selenide (UI automation)
* RestAssured (API testing)
* Cucumber (BDD)
* TestNG / JUnit
* Gradle
* Qase (test management)

## Test Coverage

### UI Testing

* Login (valid / invalid scenarios)
* Book search
* Add to cart
* Remove from cart
* Checkout process

### API Testing

* GET books
* POST user/login
* DELETE book
* Negative scenarios

### BDD Testing

* User scenarios described in Gherkin
* Feature files + step definitions

## Test Types

* Functional testing
* UI testing
* API testing
* Regression testing
* Basic security testing

## Project Structure

- `pages` – Page Object classes  
- `tests` – UI test classes  
- `utils` – helper methods  

API and BDD tests are located in separate repositories (see below)

## Related Repositories

- API Testing:
https://github.com/ParkhomenkoE/BookStore_API_Gradle

- BDD Testing:
https://github.com/ParkhomenkoE/BookStore_Cucumber
 
## How to Run Tests

### UI tests
./gradlew test
### API tests
./gradlew apiTest

## Test Management
Test cases are managed in Qase: 
https://app.qase.io/project/BOOKSTORE 

## Test Documentation
Test Plan:
https://docs.google.com/document/d/1zCxkANNW9xXMXQtrVPzbAXa0uQdm6H-XyzK1Gcr1eUE/edit?tab=t.0#heading=h.f6khr2ja0tul

## Project Presentation
https://docs.google.com/presentation/d/1NqXFxOTqGhxBmjMnyt6aV-NRQF3-kqut/edit?slide=id.p1#slide=id.p1

#  Author

Junior QA Automation Engineer (Java, Selenide, API Testing)
Open to opportunities in Germany
