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

 <img src="https://github.com/Kesava2201/SunBaseAssignment/assets/161606458/7781b93f-4bee-47e0-9ee1-e827463f661d)" width="1000" height="500">

 - List of the students:</br>
 
 <img src="https://github.com/Kesava2201/SunBaseAssignment/assets/161606458/55b7328b-8716-4304-b2e0-1949a14ce03e)" width="1000" height="500">
 

- Updating a Student</br>

On the student list page (list.jsp), click "Edit" next to a student.</br>
Update the information and click "Update".</br>

<img src="https://github.com/Kesava2201/SunBaseAssignment/assets/161606458/bc48cff0-ea15-4faf-bb39-7c9021f03cd5)" width="1000" height="500">


- Updated Student</br>

<img src="https://github.com/Kesava2201/SunBaseAssignment/assets/161606458/bbb43677-755a-406f-b7e3-9a015d4af930)" width="1000" height="500">

- Searching a Student Name</br>
<img src="https://github.com/Kesava2201/SunBaseAssignment/assets/161606458/14dff97f-f11b-4884-9fcd-9af337f958eb)" width="1000" height="500">

- Searched Student Name</br>

<img src="https://github.com/Kesava2201/SunBaseAssignment/assets/161606458/f78dafab-806d-4f2e-b94c-d4bd0e00c5f0)" width="1000" height="500">

- Deleting a Student:</br>

On the student list page (list.jsp), click "Delete" next to a student to remove them from the database.</br>

<img src="https://github.com/Kesava2201/SunBaseAssignment/assets/161606458/aae3dbc4-812a-45fc-826a-8400932cc562)" width="1000" height="500">
