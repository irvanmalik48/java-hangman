#!/bin/sh

echo "Checking if Java compiler is available..";

if hash javac 2>/dev/null; then
    echo "Compiling...";
    javac App.java \
        src/com/irvanma/Game.java \
        src/com/irvanma/Variables.java \
        src/com/irvanma/input/Input.java \
        src/com/irvanma/graphic/Graphic.java \
        src/com/irvanma/levels/Levels.java;
    echo "Bundling to JAR...";
    jar cfe JavaHangman.jar App \
        App.class \
        src/com/irvanma \
        src/com/irvanma/input \
        src/com/irvanma/levels \
        src/com/irvanma/graphic;
    mkdir dist;
    mv JavaHangman.jar dist/JavaHangman.jar;
    echo "Deleting leftovers...";
    rm -rf *.class \
        src/com/irvanma/*.class \
        src/com/irvanma/input/*.class \
        src/com/irvanma/levels/*.class;
    echo "Script succeeded.";
else
    echo "Please install Java JDK and try again.";
fi
