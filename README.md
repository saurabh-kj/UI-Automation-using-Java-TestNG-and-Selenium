# trell-shop-test-automation-suite



## Getting started

To make it easy for you to get started with Github, here's a list of recommended next steps.

Already a pro? Just edit this README.md and make it your own. Want to make it easy? [Use the template at the bottom](#editing-this-readme)!

## Add your files

push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://gitlab.com/trell/trell-shop-test-automation-suite.git
git branch -M main
git push -uf origin main
```

# Objective
Developed a sample framework which support to develop automation test scripts for functional testing.

## Libraries used:
  1. Java
  2. Selenium
  3. TestNG
  4. Extentreports
  5. Maven
  
## Steps to start:
  1. Clone / Download the project into your local.
  2. Open the Command prompt and navigate to project location.

Execute the following Maven command's
  1. mvn clean :- To clean the maven repo.
  2. mvn install :- To install the maven requirements.
  3. mvn test :- To execute the test scenarios.


## UI application details:
It is an ecommerce based web application where user can navigate or do following actions:
  1. Product Listing Page
  2. Product Details
  3. Wishlist products
  4. Add Products to Cart
  5. Checkout
  6. Orders Page
  
## Approach:
  1. Implemented modular driven approach.
  2. Used page object model design pattern.
  3. Maintained low level and high level logs.
  4. Implemented FileUtil, RandomUtil, Screenshot libraries.
  5. Test data maintained in properties files.
  6. Browser and environment are parameterized from xml suits.
  7. Maintained groups for all test scripts.
  8. Used TestNG library for assertions & reporting.
  9. Added screenshots with emailable-report.
  10. Added Extentreports with screenshots.
