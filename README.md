# Selenium-TestNG

## Selenium TestNG framework

In this project, I have used TestNG and Selenium to do some cross browser, data driven and parallel testing.
I have used the website "https://magento.softwaretestingboard.com" to automate the testcases which include
account registration, login and data driven tests.

**#Includes ::**
1. PageObjects : classes for different relevant pages of the website.
2. testBase    : contains common methods and code used in all test cases.
3. testCases   : contains test for account registration with randomly generated email and password,
                 test for login with correct and incorrect credentials and a data driven test using an excel file.
4. utilities   : contains data provider, excel read and write and report generation code.
5. reports     : contains generated test reports.
6. testOutput  : contains xml files for cross browser testing, data driven testing and parallel testing using TestNG.

**Tools and technologies used ::**
> Java, 
> Selenium, 
> TestNG, 
> ExtentReports, 
> Log4j
