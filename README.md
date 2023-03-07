1. `TimeDuration` 

    Create a `TimeDuration` class in `TimeDuration.java` that represents an interval of time. It should have:

    * a 3-argument constructor that takes 3 integers representing a number of hours, minutes, and seconds (respectively) that specify the length of time 
    * a `toString` method that formats the time duration in format "hh:mm:ss", portions of which are zero padded as necessary to keep the output string always the same length
    * a `parseFromString` method that takes as input a `String`, and returns a newly created `TimeDuration` object using the information from the input. It should be flexible and accept representations using one or two colons to separate parts of the duration, or at least one of the letters 'h', 'm', and 's'. For example:
        * `"2m"` represents 00:02:00
        * `"1 h, 7 s"` represents 01:00:07
        * `"2:20"` represents 00:02:20
    * a way to track how many `TimeDuration` objects have been created 
    * a `main` method that showcases your class being used
