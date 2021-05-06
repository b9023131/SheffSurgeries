package com.jcharlesworth

class Prescription {

// Declaring Variables
	String pharmacyName
	int prescriptionNumber
	String medicine
	float totalCost
	Date dateIssued
	String patientPaying

    static constraints = {

// Constraints 
	pharmacyName Blank:false
	prescriptionNumber blank:false, unique: true
	medicine blank:false 
	
	dateIssued blank:false

    }

//Class Diagram Relationships
	//static hasMany = []
	//static belongsTo = []
	//static hasOne = [doctor:Doctor, patient:Patient]

//Other Relationships
	//static hasMany = []
	//static belongsTo = []
	//static hasOne

}
