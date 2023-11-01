# God of War: Betrayal Decompilation Project

This project aims to decompile the mobile game God of War: Betrayal, which was released in 2007 for Java-enabled mobile phones. The game was developed by Javaground and published by Sony Pictures Mobile.

## Project Overview

There's no single "best" version of the game. the older ones support running in high resolution through emulators, but have many bugs that make the experience unenjoyable (either due to the increased resolution or outdated game code). I aim to make the go-to version of the game, and will try to rework controls and visuals to work better as I'm not limited to mobile phones in 2007.

## Project Goals

The main goals of the project are:

- To create a decompiled version of the game's source code
- To identify and address any bugs or glitches in the original game
- To potentially modify or enhance the game's code for modern platforms
- Backport any fixes identified in later versions (these versions use lower resolution assets so were not ideal for being the base of the project)

## Project Status

The project is currently in progress. Decompilation is complete, as the output was quite good and only needed minimal cleanup to get running, work on initial tweaks and improvements has begun.

## Compiling

This project requires [IntelliJ 2019.3.5](https://download.jetbrains.com/idea/ideaIU-2019.3.5.exe), the [J2ME Plugin](https://plugins.jetbrains.com/plugin/12318-j2me), [Java 8](https://www.oracle.com/ca-en/java/technologies/javase/javase8-archive-downloads.html), and the [Oracle Java ME SDK 8.3.1](http://download.oracle.com/otn/java/javame/8/oracle-jmesdk-8-3-1-rr-win-bin.exe). All other dependencies are included. To run the compiled code, you must put the compiled class files into [an original game .jar](https://archive.org/download/j2me-hipnosis/God%20Of%20War%20Betrayal.zip/God%20Of%20War%20Betrayal%20%5B1.4.58%5D%20%5BLockedRes%5D%20%5B352x416%5D%20%5BEn%2CFr%2CEs%2CDe%2CIt%2CPt%5D.jar). There are currently no tools to work with the game's resource files.

## License

As this is a decompilation and not a reverse-engineering effort, The majority of this code is of course, not mine, even if it is abandonware, I cannot license this code in any way.