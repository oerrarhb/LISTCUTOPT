# LISTCUTOPT

ListCut is a mini Maven Java 11 project.

To test you need JDK 11 and Maven 3.6 installed on your machine.

This project Cut a List into lists of size n.
This project contains two classes :
- Service class to cut the list.
- Testing class to test the service

The service is developed in two ways 
- O(log(n)) recursive solution
- O(n) iterative solution

To run the tests

```sh
mvn clean test
```