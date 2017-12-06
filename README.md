# Library-Management-System
A Java based application for Library Management

This is a JAVA based application that facilitates the management of a physical library. The app makes use of database integration through MySQL to store and manage its data such as the list of books, members, issues, etc., and makes use of Swing components for its design. 
The application has features like the ability to add a book to the library, add a member, issue a book, return a book, search the database, etc. I am planning to add some more functionalities in the future. 

Note: Before running this application, make sure to fire up MySQL and create the following tables in a database named library:
1. books with the rows bookNo, bookName, author, publisher, pages, stock and balance.
2. issues with the rows bookNo, bookName, memberNo, memberName, phone, noOfCopies, dateOfIssue, leftCopies
3. returns with the rows bookNo, bookName, memberNo, memberName, phone, noOfCopies, dateOfReturn, leftCopies
4. purchases with the rows bookNo, bookName, noOfCopies, dateOfPurchase, type, costPerCopy, totalCost
5. members with the rows memberNo, memberName, address, dob, phone


Currently, I do not possess the knowledge for automating the creation of all the databases when the app is on a new machine and the set-up of the MySQL connection within the app on a new machine on which there is no MySQL connector. So, you'll have to take some pains to have the application up and running. 

Feedback is appreciated!

