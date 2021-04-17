package com.jcharlesworth

class Prescription {

// Declaring Variables
	String pharmacyName
	int prescripNumber
	String medicine
	int totalCost
	Date dateIssued
	String patientPaying

    static constraints = {

// Constraints 
	pharmacyName Blank:false
	prescriptionNumber blank:false, unique:false
	medicine blank:false 
	totalCost blank:false
	dateIssued blank:false
	

    }
}
