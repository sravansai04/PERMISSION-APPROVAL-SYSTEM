# PERMISSION-APPROVAL-SYSTEM
<b>Permission Management System</b> is the process of making Permissions computerized. Employees who belongs to that company should have to register for the first time when they are accessing Permission management system portal. Every time one should login for accessing Permission management system portal to raise a request for permission with unique ID and automatically it will be submitted to both leader and manager of employees. Leader and the manager will decide if the permission is to be granted. When a leader or manager reject or accept the permission, it should be reflected on the status page in the employee account. If the manager  approves for the permission then a letter will be generated in the status page. Either manager approves or rejects, the response will be displayed on the dashboards of the employee.

<b>You will get the complete code <a href="https://github.com/sravansai04/PERMISSION-APPROVAL-SYSTEM/tree/master">here</a> 
  
<b>Modules </b>
  1. EMPLOYEE MODULE
  2. LEADER MODULE
  3. MANAGER MODULE
  
  Lets' have a discussion regarding all the modules
  
 ## 1. EMPLOYEE MODULE 
<p>When an employee login with valid credentials, there will be dashboard showcasing employee Name, Employee Image and the buttons as described below.>/p>
 
 ### Raise Permission:
 <p>
Employees can raise a request, when they click this button. They will be given text areas, where they can type the request information. When they click the submit button, letter with unique ID will be submitted to Leader. The raised request should be displayed in the previous Permissions list.</p>


 ## 2.LEADER MODULE
 <p>When an employee login through leader button with valid credentials, he/she can see the list of Pending Permissions applied by the employees working under him.</p>
 <b> Pending Permissions</b>
 <p>
 When an employee submitted a permission in employee module leader can view those permissions in his dashboard where a drop-down list will show the list of employees who raised    the permissions.</p>
 <p>Leader can click on any permission so that leader he can view, approve or delete permission. When a leader rejected the request, there will be a status change of permission in  previous permission list in employee module. On the other hand, when leader approved the raised permission, the letter with unique ID will be submitted to Manager.</p>
 
 ## MANAGER MODULE
<p>Here Manager can view a list of employees who applied for permissions under which a list of permissions applied by an employee.</p>
<b> Pending Permissions:</b>
<p>When an employee login through Manager button with valid credentials, he/she can see the list of Pending Permissions applied by the Employees working under designated leaders.</p><p> Manager can see both the employee who raised the permission and the leader of employee. Manager will validate the Permission and Unique ID generated at the time of raising a permission. </p><p>Whatever the response of Manager, it will be redirected to both leader and Employee <b>“PERMISSION WITH UNIQUE-ID 348 IS APPROVED/REJECTED” </b>and the status of permission in both Leader module and Employee Module need to be updated corresponding to the response of Manager.</p>

