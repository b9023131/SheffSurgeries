package com.jcharlesworth

class Prescription {

// Declaring Variables
	String pharmacyName
	int prescriptionNumber
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
//relationships
static hasMany = []
static belongsTo = []
static hasOne = [doctor:Doctor, patient:Patient]
}
