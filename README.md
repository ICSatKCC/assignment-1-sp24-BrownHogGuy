[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/3KlXVSr3)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=13504199)
# Assignment 1 - Fish Object


![carp](https://github.com/ICSatKCC/A1-Simple-Java-Object-Template/assets/279775/f2157d0d-98fb-48a3-bbc7-acf74a7c7d2f)

Code Review in 1 week, Thurs 1/25, during class.

Final version due Tues 1/30 at 11:55pm.

## Create a simple Fish object class. 


### Downloading and Submitting
 1. Open GitKraken on your computer
 2. Click on folder icon in upper left corner
 3. Choose "Clone" and "GitHub.com"
 4. Choose where to clone to (directory/folder you want your assignment code in)
 5. Choose Repository to clone (it should be in that list)
 6. Click "Clone the repo!" button
 5. Do your assignment, committing to your Git repo and pushing to Github regularly. 
 6.  **Before class on code review day** push what you have to GitHub.
     - I will show you how to do a review that day.
 7. When finished, push final version to GitHub and make a commit comment: *Assignment Submission*
    - Make sure you make a comment in the pull request about what you did to address your reviewer's comments!

## What to code
You are going to define a simple Fish Object class, `Fish.java`.

### Instance Variables
There should be 6 instance variables. *Names and types must be exactly as shown*
  * `String name`
  * `String bodyColor`
  * `String finColor`
  * `String food`
  * `int length`
  * `int weight`
  
These variables represent the characteristics of a simple fish model.  
  - `name` will be the fish type name, such as Ahi or Tiger Shark. 
  - `bodyColor` will be the color of the fish's body. 
  - `finColor` will be the color of the fish's fins and tail. 
  - `food` is this type of fish's favorite food to eat.
  - `length` is the length of this fish in millimeters.
  - `weight` is the weight of thie fish in grams.

### Constructors 
There should be two constructors.
 1. Takes in 5 parameters for: ```name, bodyColor, finColor, food, length```
 2. Takes in 4 parameters for: ```name, bodyColor, finColor, food```
   - The 4 parameter constructor should set ```length``` to a random int between 1 and 1000 inclusive. 
  
The ```weight``` is tied to the `length` and should be calculated and set automatically within the constructors. 
 - The formula for the weight is described below with the `setWeight` method
 - You can have the constructors call your `setWeight` method. This is the most correct way to do this.
   
### Get Methods
There should be a complete set of Accessor/Gets methods for all instance variables. 
 - These should be named `getName`, `getBodyColor`, `getFinColor`, `getFood`, `getLength`, and `getWeight` or the jUnit test will not compile.
 - Each get method should return the instance variable value as the specified type. 

### Set Methods
There should be a complete set of Mutator/Sets methods for all instance variables. 
  - These should be named `setName`, `setBodyColor`, `setFinColor`, `setFood`, `setLength`, and `setWeight` or the jUnit test will not compile.
  - All except the `setWeight` method should work as normal, setting the instance variable to a new value that comes in as a parameter.
  - The `setWeight` method is special!
     - It should not take in any parameters.
     - It should instead set the weight to `0.00001 * length^3` casted to an `int`
        - This is derived from the Wikipedia Article:[Standard weight in fish](https://en.wikipedia.org/wiki/Standard_weight_in_fish)
        - You may choose to make a constant instance variable for the 0.00001 coefficient.

### toString method
There should be a toString method that returns a String in this **exact** form, with the <...> replaced by the instance variable values (except length and 
width as described below):
```
Fish type: <name>
Body color: <bodyColor>
Fin color: <finColor>
Food: <food>
Length: <length> in
Weight: <weight> lbs

```
Special processing of length and weight for toString output:
- The length should be in **inches** rounded to two decimal places.
   - The formula to convert mm to inches is: `inches = mm/25.4`
- The weight should be in **pounds** (lbs) rounded to two decimal places.
   - The formula to convert grams to pounds is: `pounds = grams/453.6`
- You may use whatever method you know to output the values rounded to two decimal places. The JUnit test checks this using `DecimalFormat` for rounding.
- You may choose to make the two conversion factors into constant instance variables.

There should be a newline at the end of the String.

Example of printed toString output:

```
Fish type: carp
Body color: gold
Fin color: brown
Food: algae
Length : 4.76 in
Weight: 0.04 lbs

```


## JUnit Testing

Use the FishTest.java JUnit test file provided in this repository to run JUnit on your Fish objects. 
 - I will use this when grading to determine if your code does what was assigned.
 - You are welcome to make your own driver either in a separate file or in Fish.java itself to run your own tests, but the JUnit test will be used for grading.

## Commenting and Style

All code should be commented using Javadoc and should follow the [Google Java style guide](https://google.github.io/styleguide/javaguide.html) for formatting.
  - Run checkstyle on your file to check that it is following the style guide.
  - Your grade will be marked down for checkStyle errors.

## Exceptions and Validation

For now, do not worry about checking invalid input parameters or throwing Exceptions. Assume that correct Fish names, colors, food, and lengths will be given to the constructor.

## Grading

Assignment is worth 50 points.

### Rubric:

| Requirement | Points |
| --- | --- |
| Passes all JUnit tests | y/n | 
| Passes Checkstyle | y/n |
| Constructor with 5 parameters | 5 |
| Constructor with 4 parameters |5 |
| Gets Methods | 5 |
| Sets Methods (except for weight) | 5 |
| Weight calculation/setting | 10 |
| toString Method | 10 |
| Commenting and Style |  5 |
| Reviewed Code (partner:    ) | 2.5 |
| Responded to Review from (     ) | 2.5 |
| **Total** | **50** |

