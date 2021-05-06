package com.jcharlesworth

class Patient {

//Declaring Variables
	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	int patientID
	Date dateRegistered
	String patientPhone	

    static constraints = {

// Constraints
	patientName blank: false
	patientAddress blank: false
	patientResidence blank: false
	patientDob blank: false
	patientID blank: false, unique: false 
	dateRegistered blank: false
	patientPhone blank: false
    }

//Class Diagram Relationships
	//static belongsTo = [doctor:Doctor]
	//static hasMany = [surgery:Surgery, prescription:Prescription, doctor:Doctor]
	//static hasOne = [appointment:Appointment]


//static hasMany = []
//static belongsTo = []
//static hasOne

}
