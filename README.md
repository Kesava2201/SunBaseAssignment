# SunBaseAssignment

## Student CRUD Web Application
This project is a Java EE web application that demonstrates CRUD (Create, Read, Update, Delete) operations on a database table using JDBC, Servlets, and JSP.
- Prerequisites
1. Before running this application, ensure you have the following installed:
2. Java Development Kit (JDK) 8 or higher
3. Apache Tomcat 9.0 or compatible servlet container
4. MySQL or another compatible relational database
5. IDE (like Eclipse, IntelliJ IDEA) with support for Java EE web development

- Setup
1. Clone the repository:                                                                                                                                                                                          
     git clone https://github.com/your-username/StudentCRUDApp.git
2. Database Setup:                                                                                                                                                                                             
     Create a MySQL database named student_db.                                                                                                                                                                
     Execute the following SQL script to create the students table:</br>
        CREATE TABLE students ( </br>
           id INT PRIMARY KEY AUTO_INCREMENT, </br>
           name VARCHAR(50), </br>
           email VARCHAR(50), </br>
           age INT </br>
       ); </br>
4. Import Project into IDE:</br>
     - Open your IDE (Eclipse, IntelliJ IDEA, etc.).</br>
     - Import the project as a Dynamic Web Project.</br>
5. Configure JDBC Connection:</br>
     - Edit JDBC_Connection.java in the com.utility package to set your database connection details (URL, username, password).</br>
6. Build the Project:</br>
     - Build the project to resolve dependencies and compile the code.</br>
- Deployment</br>
1. Deploy to Tomcat:</br>
      - Configure your IDE to deploy the application to Apache Tomcat.
      - Start Tomcat and deploy the project to the server.
2. Access the Application:
      - Open a web browser and go to http://localhost:8080/StudentCRUDApp (replace 8080 with your Tomcat port if different).</br>

- Features
1. Create: Add new students to the database.
2. Read: Display a list of all students.
3. Update: Edit existing student information.
4. Delete: Remove a student from the database.
- Usage</br>
- Adding a Student:</br>
Click on "Add New Student" on the home page (add.jsp).</br>
Fill out the form and click "Add".</br>

 <img src="https://github.com/Kesava2201/SunBaseAssignment/assets/161606458/7781b93f-4bee-47e0-9ee1-e827463f661d" width="1000" height="500">

 - List of the students:</br>
 
 <img src="https://github.com/Gireesh123174/SunbaseAssignment/assets/85821830/16d3a7da-dbdf-4621-918e-16acd303b20e)" width="1000" height="500">


- Updating a Student</br>

On the student list page (list.jsp), click "Edit" next to a student.</br>
Update the information and click "Update".</br>

<img src="https://github.com/Gireesh123174/SunbaseAssignment/assets/85821830/8e4f95ad-e51e-4b26-90ca-9e2b840e9cf3)" width="1000" height="500">

- Updated Student</br>

<img src="https://github.com/Gireesh123174/SunbaseAssignment/assets/85821830/0551ced2-32ce-4ce6-a4fd-84a6d18e23de)" width="1000" height="500">

- Searching a Student Name</br>
<img src="https://github.com/Gireesh123174/SunbaseAssignment/assets/85821830/40d9b53a-75cd-4c2a-b7a5-6186fa808640)" width="1000" height="500">

- Searched Student Name</br>

<img src="https://github.com/Gireesh123174/SunbaseAssignment/assets/85821830/63d48250-b70e-4713-a222-ee548ab44698)" width="1000" height="500">

- Deleting a Student:</br>

On the student list page (list.jsp), click "Delete" next to a student to remove them from the database.</br>

<img src="https://github.com/Gireesh123174/SunbaseAssignment/assets/85821830/ce68b5a9-e9d2-4989-b200-b7637035756c)" width="1000" height="500">
