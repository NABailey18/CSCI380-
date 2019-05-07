# CSCI 380-04: Assignment 2 - Due by 11:59 PM, Mar 13th, 2019
* * * 

	 By now, you should have Android Studio setup with an emulator. This assignment will let you play 
	 around with activities and using animations.
	 
	 Make sure to follow the same naming conventions from assignment 1 for this and all of your projects:
	 (https://google.github.io/styleguide/javaguide.html#s5-naming).
	 
	 Also make sure to complete each part in different git commits! 
	 See Lecture 5 (https://bhargman.github.io/csci-380-04/docs/CSCI-380-04-Lecture-5.pdf) 
	 slides to learn about the APIs needed for this assignment. 

# Part 0 - Github Setup - 5%
+ Setup this assignment the same way you did for `assignment1` (see [https://github.com/bhargman/assignment1#part-1---github-setup---5](https://github.com/bhargman/assignment1#part-1---github-setup---5). Name your repo
`assignment2` this time)
+ Add me as a collaborator (username : `bhargman`) to your private repo (see [https://help.github.com/articles/inviting-collaborators-to-a-personal-repository/](https://help.github.com/articles/inviting-collaborators-to-a-personal-repository/)).
    + **If you don't do this step, I'll have no way of grading your assignment**

# Part 1 - Android Studio - 5%
+ Import your `assignment2` repo into Android Studio
    + In the main Android Studio window, tap on "Open an existing Android Studio project"
    + Browse to your `assignment2` folder and select to open it
    + Android Studio will now load the project and you should be able to do the rest of this assignment
        + Note: This may take a few minutes, wait until the processes/indexing spinner in the lower right hand corner is complete
        + Make sure to let Android Studio have access to the internet while it loads the project, so it can fetch dependencies
        + If you get any pop up asking you to update the `Android Gradle Plugin`, please select `Don't remind me again for this project`

# Part 2 - MainActivity - 10%
+ Open up `MainActivity` and its layout (`activity_main.xml`)
+ Create fields for each view, and initialize them in `onCreate()` using `findViewById()`
+ Add click listeners to `viewPropertyAnimationsButton` and `objectAnimationsButton` to launch `ViewPropertyAnimationsActivity` and `ObjectAnimationsActivity`, respectively
+ You'll have a crash to fix when launching `ObjectAnimationsActivity`. Fix this before moving forward.

# Part 3 - ViewPropertyAnimationsActivity - 40%
+ Open up `ViewPropertyAnimationsActivity` and its layout (`activity_view_property_animations`)
+ Create fields for each view, and initialize them in `onCreate` using `findViewById()`
+ Add a click listener to each button that will allow you to start a specific view property animation to `dogImageView` 
(use any value you want, but make sure you actually see an animation):
    + `alphaButton` -> alpha animation
    + `rotationButton` -> rotation animation
    + `scaleButton` -> scale animation
    + `translationButton` -> translation animation
    + `resetButton` -> reset `dogImageView` back to its original settings

# Part 4 - ObjectAnimationsActivity - 40 %
+ Open up `ObjectAnimationsActivity` and its layout (`activity_object_animations`)
+ Create fields for each view, and initialize them in `onCreate` using `findViewById()`
+ Create an instance of `AppCompatSeekBar.OnSeekBarChangeListener` inside `onCreate()`, and set it on each SeekBar using `setOnSeekBarChangeListener()`
+ Fill in the `updatePreview()` method to satisfy the requirements in its comment