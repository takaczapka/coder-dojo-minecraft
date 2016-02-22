# Mods4Kids

The idea of the project is the introduction of JAVA programming concepts through Minecraft mod programming. TBC


## Installation

### Prerequisites

* Programming language we will develop the mods: **Java** JDK 1.8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
    * try: `java -version` in a command line - there are chances that you have one already installed
* Programming environment: **Idea IntelliJ Community Edition** https://www.jetbrains.com/idea/download/#
* Modding platform: **Minecraft Forge** source package (**MDK**, recommended version, not the latest) http://files.minecraftforge.net

### Environment Setup

This will do quite a lot of tasks: download most requirements (Minecraft, MCP (Mod Coder Pack), Java Libraries, Gradle, Forge, and FML). Set up Forge, with MCP and Gradle.

1. Install **Java** and **IntelliJ**
2. Create **dev/minecraft** folder in your home directory
3. Setup **Minecraft Forge** workspace (it might take more than 30 mins):
    * Copy **minecraft-forge-mdk.zip** to **dev/minecraft** and unzip it
    * rename it to **coder-dojo-forge**
    * In a command line console do:

        ```
            > cd [YOUR_HOME]/dev/minecraft/coder-dojo-forge
            > export JAVA_OPTS="-Xmx2g"
            > ./gradlew setupDecompWorkspace --refresh-dependencies --stacktrace
            > ./gradlew idea
        ```

4. Start **IntelliJ** and click Open Project and select **dev/minecraft/coder-dojo-forge**
    * build the project (setup SDK pointing to installed **Java8** if **IntelliJ** doesn’t see it)
    * choose “MinecraftClient” from runtime configurations and click a run button

## JAVA
The whole point of exercise is to sneak some programming concepts so as the part of the mods development we will have a Java sandbox project on the side to play with the following concepts:

- hello world
- static vs object methods
- class vs object scope
- startup arguments (task: print out all args passed to the program in the execution)
- string concatenation in output
- for loops
- collections: arrays, lists, sets, and basic operations (add, delete, contains, etc.)
- interface, inheritance (Animal.makeSound(), Cat, Dog), instanceof
- and more...

## MODS
Preferably don’t give kids the code straight away, or maybe just a template, or the simple case, and ask them to run it and then modify regarding to your requests. Ask kids about their favorite mods, why they are special and meaningful to them?

### Break Block Message

- explain how we can hack into the Minecraft, what are possibilities, etc (events, chaging blocks, physics, spawwning animals, executing commands, etc.)
- explain the idea of a EventBus and registration of event consumers
- modifications:
    - make the message to be of GOLD color
    - make the message to show a type of the block destroyed

### Super Jump + Parachute
- in a Java sandbox project create a simple hierarchy of Animals (Animal, Cat, Dog, Cow) making sounds to introduce concepts of inheritance, method overloading and type hierarchies
- based on EntityPlayer, show its type tree (or draw on paper)
- explain instanceof concept (in code: event.entity instanceof EntityPlayer)
- modifications
    - add chat message when jump starts with player’s initial position
    - experiment with height of a jump

### Flaming pigs, cows or sheep
- In Java sandbox project
    - command line arguments exercise
        - reading from input
        - print all incoming arguments out
        - parse string values into Integer
        - exceptions (ie. when parsing)
    - loops
        - 10 times printout “I love minecraft!"
    - create a list, add/remove/count elements, iterate through elements writing each one to std output
- explain: interfaces vs classes
- TBC