## Lab 09: Web requests

Problem summary:
Potent Quotables:

Overview
Today you’ll update your lab from yesterday: rather than using a hardcoded file of JSON data with quotes, you’ll grab quotes from an API and display those to the user.

Setup
Continue building on your work from lab 8. 
If your partner was the one who created the repo in that lab, create a fork of their repo and clone that fork to hold your work for today. 
(If you had already created your own fork, make a PR from the base fork to your fork to ensure you have all of your work from yesterday, and then pull your repo.)

Feature Tasks
Start by refactoring anything that you don’t like about your solution from yesterday.

When running the application, don’t read in the quotes file. Instead, make a request to an API to get a random quote.

please do not delete your existing code, look at the very next feature task, you will still need that code
Some examples of APIs you could choose to use:

FavQs: sign up for a free API key (takes 2 minutes) to get random quotes

Formismatic: no API key required, visit http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en to get random quotes

Star Wars Quotes API

Ron Swanson Quotes

Rather than a Quote of the Day, please use an API that allows you to show a random quote.

We do still have this quotes file, though, and it might still be useful! 

Ensure that if your app has errors in connecting to the Internet, you instead display a random quote from your file.

When we grab a random quote from the Internet, we could add it to our file of quotes, for use if the app goes offline in the future. 

Add that functionality: when a quote comes back from a request, it’s also cached in the json file.

## Directions for testing:
Use JUnit to write at least one test for each of the Feature Tasks.

## Tests:
The following tests were performed for the functionality of the app.

testGetsRandomQuote:
This tests makes sure that a random quote with an author is generated every time the app is run and when app makes succesful API request to the internet.

testWhenUrlBreaks:
This test makes sure that user gets proper error feedback when internet breaks and quotes are shown from the existing file.

ttestIfAddingToFile:
This test makes sure one new quote is being added to the existing file every time we get a succesful response from the internet with a quote.

  ## Instructions on running the app:
  
 The app can be run from app.java. Once you run the app, it attempts to make a request to the star wars quotes api to get and display a random quote from star wars characters.
 Upon succesful response, the response quote is stored on the local file of quotes.
 If the API request is unsuccesful, a random quote that is stored in local file is displayed. 
 
[Link to App.java](https://github.com/sadhikari07/java-quotes/blob/master/src/main/java/Quotes/App.java)

[Link to AppTest.java](https://github.com/sadhikari07/java-quotes/blob/master/src/test/java/Quotes/AppTest.java)
