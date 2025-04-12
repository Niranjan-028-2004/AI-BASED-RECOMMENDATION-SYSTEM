# AI-BASED-RECOMMENDATION-SYSTEM

COMPANY:CODTECH IT SOLUTIONS

NAME:NIRANJAN J U

INTERN ID:COD74035

IN PDF OFFER LETTER:CT04WP135

DOMAIN:JAVA

DURATION:4 WEEKS

MENTOR:NEELA SANTHOSH

 1. Download Required Libraries
You’ll need these Mahout JARs (or use Maven):

mahout-core-x.x.jar

mahout-math-x.x.jar

commons-lang3.jar

slf4j-api.jar

slf4j-simple.jar

You can download these manually or use Maven/Gradle. Place them in the lib/ folder.

Place the Mahout JARs in a lib/ folder.

Compile and run using terminal:
javac -cp ".;lib/*" -d bin src/RecommenderApp.java
java -cp ".;bin;lib/*" RecommenderApp

On macOS/Linux use : instead of ; in the classpath.
OUTPUT:
Recommendations for User 2:
Item ID: 104, Strength: 4.32
Item ID: 105, Strength: 3.89
This output suggests items 104 and 105 to User 2 based on similar users' ratings.

How It Works:
Collaborative Filtering: Uses Pearson correlation to compare user preferences.

Nearest Neighbors: Finds users similar to the target user.

Recommendation Engine: Predicts and ranks unrated items for the user.

Next Steps / Enhancements
Use Item-based filtering

Integrate a GUI

Store data in databases (like MySQL)

Switch to Maven for dependency management

Add a web interface using Spring Boot
