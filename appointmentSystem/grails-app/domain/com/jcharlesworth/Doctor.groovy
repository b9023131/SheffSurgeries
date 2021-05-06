package com.jcharlesworth

class Doctor {

// Declaring Variables 
	String fullName
	String qualification 
	String position
	String doctorEmail 
	String password
	String doctorOffice
	String doctorPhone
	String bio

    static constraints = {

// Constraints 
	fullName blank: false  
	qualification blank: false  
	position blank: false  
	doctorEmail blank: false
	password size: 8..15
	doctorOffice blank: false
	doctorPhone blank: false
	bio size: 5..100

    }

//Class Diagram Relationships
	//static belongsTo = [surgery:Surgery]
	//static hasMany = [nurse:Nurse, patient:Patient, appointment:Appointment, 		//	prescription:Prescription]

}
