<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spring MVC Calculator</title>
</head>
<body>
<h1>Spring MVC Calculator</h1>

<p>Spring MVC Calculator is a web application built using Spring Boot for basic arithmetic calculations.</p>

<h2>Table of Contents:</h2>

<ul>
    <li><a href="#introduction">Introduction</a></li>
    <li><a href="#features">Features</a></li>
    <li><a href="#setup">Setup</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#technologies">Technologies Used</a></li>
    <li><a href="#contributing">Contributing</a></li>
</ul>

<h2 id="introduction">Introduction:</h2>

<p>This project implements a simple calculator application using Spring MVC architecture. It allows users to perform arithmetic operations such as addition, subtraction, multiplication, and division. Users can register, login, and perform calculations based on their authenticated session.</p>

<h2 id="features">Features:</h2>

<ul>
    <li>User authentication and authorization</li>
    <li>Perform basic arithmetic calculations</li>
    <li>User-specific calculations history</li>
    <li>CRUD operations on calculations (admin only)</li>
</ul>

<h2 id="setup">Setup:</h2>

<p>To run this project locally, make sure you have Java and Maven installed on your system. Follow these steps:</p>

<ol>
    <li>Clone this repository to your local machine.</li>
    <li>Navigate to the project directory.</li>
    <li>Open a terminal and run <code>mvn spring-boot:run</code>.</li>
    <li>Once the application is running, open a web browser and go to <a href="http://localhost:8080">http://localhost:8080</a>.</li>
</ol>

<h2 id="usage">Usage:</h2>

<ol>
    <li>Register or login to your account.</li>
    <li>Use the calculator interface to perform arithmetic calculations.</li>
    <li>View your calculation history.</li>
    <li>Administrators can manage calculations (view, update, delete) of all users.</li>
</ol>

<h2 id="technologies">Technologies Used:</h2>

<ul>
    <li>Java</li>
    <li>Spring Boot</li>
    <li>Spring Security</li>
    <li>Spring Data JPA</li>
    <li>MySQL</li>
    <li>HTML/CSS (front-end templates not included in this README)</li>
</ul>

<h2 id="contributing">Contributing:</h2>

<p>Contributions are welcome! If you find any bugs or have suggestions for improvement, please feel free to open an issue or submit a pull request.</p>
</body>
</html>
