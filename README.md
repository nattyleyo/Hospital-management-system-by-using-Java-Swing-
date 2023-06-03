# Hospital-management-system-by-using-Java-Swing-
In this his project I tried to set main functionality of this system and I designed UI for it by using Java Swing
Function
--------------------------------------------
A-Admin-owner
----------
1-Employeed Admins
-Search Employeed Admins by using name or id
-Crud on Employeed Admins
-Display info
-Send messages
-----------
2-My data
-Change password
-Notification
---------------------------------------------------
---------------------------------------------------
B-Admin-employeed
---------------------------------------------------
1-doctors
# manage docters info
-Search doctors by using name or id
-Crud on doctors
-Display info
-Send messages
--------------
2-receptionists
-Search doctors by using name or id
-Crud on doctors
-Display info
-Send messages
---------------
5-optional
-generate reports
---------------
4-My data
-Change password
-Notification
------------------------------
-----------------------------------------------------
C-Receptionist
----------------------------------------------------
1-Patients
# manage Patients info
-Search Patients by using name or id
-crud on Patients consider check-in and out
-Display info
-Send messages
--------------
2-check-in
--------------
3-check-out
--------------
4-optional
-generate reports
---------------
5-My data
-Change password
-Notification
-----------------------------------------------------
D-Doctors
----------------------------------------------------
1-Appointment Scheduling
-Search apointment by using date or apoint_id
-reschedule,display,cancel on patient appointment with Patients
--------------
2-Prescribe Medication
-display apointed patients
-add prescription by using prescribe button
--------------
3-Patient Diagnosis Info
-Search histry of patients by using name and id
-display it
--------------
4- my data
-Change password
-Notification
------------------------------------------------------
E-Patients
----------------------------------------------------
1-Booking Appointments
-Search apointment by using date or apoint_id
-reschedule,display,cancel on Booked appointment with different professionals
--------------
2-View Prescriptions
-Search apointment by using date or apoint_id
-display prescription detail from doctors
--------------
3- my data
-Bill
-Change password
-Notification
---------------------------------------------------------------------------

-------------------------------------------------------------------------------------------------------------
       Class of HMS
-------------------------------------------------------------------------------------------------------------
~~Package-HMS classses
-----------------
1-Person>abtract
-fullname
-age
-gender
-phone
-password
#constractor
#setter and  getter
#tostring
-------------
A-Patients
-patient_id
-checkInStatus>bool
-bill
-checkin value
-patientApointments>array list>type-class Appointment
-prescription>array list>type-class Prescription
-------------
B-Staff>abstract
-staff_id
-salary

-------------
B.1-Doctors
-speciality
-DoctorApointments>array list>type-class Appointment
B.2-Receptionist
-construct all
-----------
C-Admin
----------
C.1-Admin_owner
-speciality
-DoctorApointments>array list>type-class Appointment
C.2-Receptionist
-construct all
