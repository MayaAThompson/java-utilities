# Java Utilities

This project has some helpful utilities that can be imported and used in a wide variety of java projects.  
These are compiled from YearUp United class 5 LC3 "Codeo" students, then edited and documented by me.  

## IOUtils

These are utilities related to user input and console output.  
Utilities currently include are:  

### messageAndResponse
The basis of this util is that a message is passed in, printed to console and the users input is collected and returned.  
Different versions allow the return to be a String, int, or double.  
There is also an overloaded version that can make it required that the return string is not empty.  

### pauseReturn
Pauses the application and continues when the user presses enter.

### capitalizeWords
Accepts a string, separates it my spaces and capitalizes the first letter of each word and makes every other letter lower case.  
Returns the edited string.

## FormatUtils

These are utilities that are related to formatting of things in the console.

### printDivider
Prints a line to the console to be used as a visual divider or separation.  
It accepts a string and an integer or just an integer.  
If a string is passed in it will be used as the divider. If no string is passed in "-" is the default divider.  
The int denotes the number of times the divider string will be repeated.  

### makeColor
These methods simply take in a string and return it in the color stated in the method name.  
Example:  
```Java
public class Main {

    public static void main(String[] args) {
        System.out.println(FormatUtils.makeGreen("Hello, world!"));
    }
}
```  

will print Hello, world! in green

## Using this in your Java project

From the project you want to use the utilities in:  
File -> New -> Module from existing sources...  
Navigate to /java-utilities/  
Select pom.xml  
Open  

The first time you attempt to use one of the utils it will not autopopulate, you will have to mouse over and click "add dependency". After the dependency is added you will have to import the class:  
```Java
import com.pluralsight.utils.*;
```
After that you are ready to go!  
If you would like your utility added to this project please contact me.

<br>  

###### Maya Thompson 2025
