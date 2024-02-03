## A1 - Feedback and Grading
---
### Score:
40/50 points.

### Comments:
 - I'm not sure what happened here, because the code review you gave to your partner is more correct
 than what I have here in your repository. Also there are a bunch of Checkstyle errors though you made a commit that
 says they're all fixed.

 - JUnit test cannot compile due to incorrect set methods. All of the set methods (except for the special 
    setWeight method) need to take in a 
 parameter of the same type as the instance variable they are setting. The instance variable should then be 
 assigned that value. The set methods you submitted take no parameters.
 
  - If I comment all of those out in the JUnit test, two tests still fail. The toString output is not exactly
  as required.
  
  - 96 checkstyle errors. Make sure you are using the right Checkstyle `kcc_checks.xml` file from Laulima and set your indent to be 3 spaces wide, that's what the checkstyle expects. 
  All instance variables and methods require Javadoc comments.
  


 - Very good code review!

### Rubric:

| Requirement | Points |
| --- | --- |
| Passes all JUnit tests | n | 
| Passes Checkstyle | n |
| Constructor with 5 parameters | 5/5 |
| Constructor with 4 parameters | 5/5 |
| Gets Methods | 5/5 |
| Sets Methods (except for weight | 1/5 |
| Weight calculation and setting | 10/10 |
| toString Method | 8/10 |
| Commenting and Style |  1/5 |
| Reviewed Code (partner: Silver ) | 2.5/2.5 |
| Responded to Review from ( Silver ) | 2.5/2.5 |
| **Total** | **40/50** |