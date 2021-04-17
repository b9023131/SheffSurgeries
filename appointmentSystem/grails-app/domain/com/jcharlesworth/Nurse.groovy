package com.jcharlesworth

class Nurse {

// Declaring Variables
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	int nursePhone 
	String bio

    static constraints = {

// Constraints 
	nurseName blank:false 
	nurseEmail blank:false
	nurseOffice blank:false
	nursePhone blank:false
	bio size:10..50

// Relationship


    }
}
