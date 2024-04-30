# UNI Budget tracker

The UNI Budget tracker is a project designed to help students track their income and expenses.

## Usage
The UNI Budget tracker offers the following features:
1. Create, view, edit, and delete records for expenses and income.
2. Obtain a summary of expenses by type.
3. Obtain monthly expense reports.
4. Check balance.

## Requirements:
1. XAMPP (or any similar software) for running the database server
2. Netbeans IDE (or any similar IDE)
-required if you choose to run the project using IDE
3. JDK [19] installed on your machine
-required if you choose to run the project using command prompt or BAT file

## Steps to run the project
1. Extract the "JavaCrew.zip" file.
2. Start XAMPP.
3. Click the "Start" buttons under the row Apache and MySQL, ensure that both Apache and MySQL services are running.
4. Click the "Admin" button under the row MySQL. 
5. Create a database named "budgetplanner" in phpMyAdmin. 
6. Import the provided SQL file namely "budgetplanner.sql" into your database.

[Choose one of the following method to run the project]
- Netbeans
1. Start Netbeans, then click "File" and then click "Open Project" to open the downloaded project.
2. Run the project in NetBeans.

- Command prompt
1. Go into the "JavaCrew" folder, then go into the "dist" folder.
2. Copy the directory.
3. Open command prompt, type "cd <paste_the_folder_path_here>.
4. Type "java -jar NetbeansProject.jar". (do not include the double quotation mark)

- BAT file
1. Go into the "JavaCrew" folder, then go into the "dist" folder.
2. Click the BAT file named "execution.bat".

## JDK Version
The project is compiled using JDK version 19. Please ensure that you have JDK version 19 installed on your system in order to run the project successfully. If you prefer to use a different JDK version, follow the steps below:

1. Go to the directory "JavaCrew\JavaCrew\nbproject".
2. Open the "build-impl.xml" file.
3. Locate the following lines of code:
   <property name="default.javac.source" value="19"/>
   <property name="default.javac.target" value="19"/>

4. Change the values to the JDK version you wish to use (e.g., value="17").

## Troubleshooting
If you encounter issues running the project due to no JAR file imported to the library of the project, follow the steps below:

1. Right click the folder "Libraries" under the project "NetbeansProject" in netbeans
2. Click Add JAR/Folder... to import the JAR file.
3. Import all the JAR file which located in the directory "UniBudgetTracker\NetbeansProject\lib" to the libraries.
