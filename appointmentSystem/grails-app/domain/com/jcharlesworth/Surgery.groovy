package com.jcharlesworth

class Surgery {

// Declaring variables
	String name 
	String address
	int postcode
	int telephone
	int numberOfPatients
	String description
	String openingTime 

    static constraints = {

// Constraints 
	name size:5..30, blank:false, unique:true
	address blank:false 
	postcode blank:false 
	telephone blank: false 
	numberOfPatients blank:false
	description size:5..25
	openingTime blank: false

// Relationship
//static belongsTo = []
//static hasMany = [receptionists:Receptionist, doctors:Doctor, nurses:Nurse]

    }
}
