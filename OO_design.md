## Lab 08: OO Design

Problem summary:

se the file recentquotes.json to show random popular book quotes. Your program should use GSON to parse the .json file. The app needs no functionality other than showing the quote and the author when it is run. The app should choose one quote each time it is run.

so what’s interesting here?

The interesting parts of this lab are:

How do I use GSON?
What class(es) should I write to encapsulate this functionality?
How does the App class use the class(es) I write?
How do I test this functionality?

## Directions for testing:
Use JUnit to write at least one test for each of the Feature Tasks.

## Tests:
The following tests were performed for the functionality of the app.

testGetsRandomQuote:
This tests makes sure that a random quote with an author is generated every time the app is run.

testError:
This test makes sure that user gets proper error feedback when incorrect file path is feeded.

testGetsRandomNumber:
This test makes sure that a random number within the provided maximum and minimum range is generated when getRandomNumber method is called.
  
  ## Instructions on running the app:
  
  The app can be run from app.java. Once you run the app, it reads the json file and converts it into JSON array.Then we loop through the JSON array to look at each objects inside of the array and get the author and quotes from the objects. Authors and Quotes are stored in two array lists. A random number is generated between 0 and the length of the JSON array and user is presented with a random quote and author stored on that random number index of the array lists.

[Link to App.java](https://github.com/sadhikari07/java-quotes/blob/master/src/main/java/Quotes/App.java)

[Link to AppTest.java](https://github.com/sadhikari07/java-quotes/blob/master/src/test/java/Quotes/AppTest.java)
