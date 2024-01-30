<h1 align="center">LoanTracker</h1>

<p align="center">
The purpose of this application is to maintain the total balance of a "loan" for the customer. Along with this, the customer would be able to make "payments" to the loan and the loan total should reflect the payment. Each payment shall also be saved along with the ending balance and payment date after each payment.
</p>

<h2>About the Project</h2>

<p align="center">
  <img src="https://github.com/Anthony-Gonzales/LoanTracker/blob/main/images/main_page.png?raw=true" alt="Application Main Page" style="width: 50%; height: auto;">
</p>

<p>
  <strong>User Story</strong>: As a loan owner, I want to be able to pull up my loan total, type in how much I want to pay and keep a record of my payments to make paying back the loan easier for me to manage.
</p>

<br>

<h3>Development Environment</h3>
<ul>
  <li>Eclipse IDE 2023-09 (4.29.0)</li>
  <li>Java Version 1.8.0_381</li>
  <li>JavaFX SDK 21.0.2</li>
  <li>Microsoft Excel</li>
</ul>

<br>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
<ul>
  <li>Install Eclipse IDE</li>
  <li>Install Java</li>
  <li>Install JavaFX SDK</li>
</ul>

<h3>Installation</h3>
<ol>
  <li>Download project</li>
  <li>Open project in Eclipse IDE</li>
  <li>Add JavaFX path as a User Library</li>
  <li>Add JavaFX User Library into project library</li>
  <li>Edit run configuration by adding the following VM option</li>
  <ul>
    <li>--module-path "\path\to\javafx-sdk-21.0.2\lib" --add-modules javafx.controls,javafx.fxml</li>
  </ul>
  <li>Run the applicatin</li>
</ol>

<h2>Use of Application</h2>

<h3>Make a Payment</h3>
<p>
  Once within the app, the user can input the amount in dollars they are ready to pay within the "Make a Payment" section and hit submit.
</p>

<p align="center">
  <img src="https://github.com/Anthony-Gonzales/LoanTracker/blob/main/images/make_payment.png?raw=true" alt="Make a Payment" style="width: 50%; height: auto;">
</p>

<p>
  Once payment is complete, the payment date, payment amount and balance total will be saved in the list of payments for future reference.
</p>

<p align="center">
  <img src="https://github.com/Anthony-Gonzales/LoanTracker/blob/main/images/payment_complete.png?raw=true" alt="Payment Complete" style="width: 50%; height: auto;">
</p>

<h3>Save After Close</h3>

<p>
  Even after closing, the balance total and previous payments will be saved onto an Excel file for future use. 
</p>

<p align="center">
  <img src="https://github.com/Anthony-Gonzales/LoanTracker/blob/main/images/excel.png?raw=true" alt="Excel Snippet" style="width: 50%; height: auto;">
</p>

<p>
  Upon restart of the application, the information is pulled from the Excel, and the up to date balance will be listed along with the previous payments.
</p>

<p align="center">
  <img src="https://github.com/Anthony-Gonzales/LoanTracker/blob/main/images/final_page.png?raw=true" alt="Final Page" style="width: 50%; height: auto;">
</p>

<h2>Roadmap</h2>

<ol>
  <li>Create home page template for application</li>
  <li>Have program read total from excel file and display it</li>
  <li>Have payment input into proram and be saved onto excel sheet</li>
  <li>Have program read payments from excel sheet and display on payments list</li>
  <li>Organize program so that total is being overwritten correctly</li>
  <li>Ensure data is correctly saved on excel sheet after closing of application</li>
  <li>Have the total and payments list be displayed upon re-opening of the application</li>
</ol>

<br>

