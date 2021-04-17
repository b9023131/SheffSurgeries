package com.jcharlesworth

class Patient {

//Declaring Variables
	String patientName
	String patientAddress
	String patientResidence
	int patientDob
	int patientID
	Date dateRegistered
	int patientPhone	

    static constraints = {

// Constraints
	patientName blank:false
	patientAddress blank:false
	patientResidence blank:false
	patientDob blank:false
	patientID blank:false, unique:false 
	dateRegistered blank:false
	patientPhone blank:false
    }
}
