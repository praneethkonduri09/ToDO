# Todo Management Project

## Overview
Welcome to the Todo Management Project! This Java Spring Boot application allows users to manage tasks (todos) within projects. It includes features like creating, updating, deleting projects and todos, managing todo status, and exporting project summaries in Markdown format via GitHub Gists.

### Features
- **User Authentication:** Register, login, and manage user accounts using Spring Security.
- **Project Management:** Create, edit, and delete projects.
- **Todo Management:** Add, update, delete, and mark todos as completed or pending.
- **Status Updates:** Change todo status directly from the homepage.
- **Summary Export:** Generate and export project summaries in Markdown format using GitHub Gist API.

## Installation

### Prerequisites
Make sure you have the following installed:
- **Java 11 or higher**
- **Spring Boot 2.5+**
- **Maven** for dependency management
- **GitHub Token** for exporting Gists
- **MySQL** database (or any other MySQL-compatible DB)

### Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/todo-management-project.git
   cd todo-management-project
2)Install Dependencies: This project uses Maven for dependency management. You can either use an IDE like IntelliJ IDEA or Eclipse, which will automatically download dependencies, or you can run the following to download them:
3)Configure Application Properties: Update src/main/resources/application.properties with your MySQL database configuration. 
spring.datasource.url=jdbc:mysql://localhost:3306/todo_management_db
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.show_sql=true
URL Patterns
Here are the key routes available in the application:

/ - Home Page: View all projects and todos.
/login/ - Login Page: User login.
/logout/ - Logout: End the current user session.
/register/ - Registration Page: Create a new user account.
/project/new/ - Create Project: Create a new project.
/todo/delete/{id}/ - Delete Todo: Remove a todo.
/view_project/{project_id}/ - Project Details: View details of a specific project.
/edit_project_title/{project_id}/ - Edit Project Title: Change the title of a project.
/todo/new/{project_id}/ - Create Todo: Add a new todo to a project.
/todo/update/{todo_id}/ - Update Todo: Modify an existing todo.
/todo/delete/{todo_id}/ - Delete Todo: Remove a todo.
/todo/{todo_id}/ - Todo Details: View details of a specific task.
/project/export/{project_id}/ - Export Project Summary as Gist: Generate and export a project summary in Markdown format.
