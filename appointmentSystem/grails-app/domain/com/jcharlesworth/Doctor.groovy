package com.jcharlesworth

class Doctor {

// Declaring Variables 
	String fullName
	String qualification 
	String position
	String doctorEmail 
	String password
	String doctorOffice
	int doctorPhone
	String bio

    static constraints = {

// Constraints 
	fullName blank:false  
	qualification blank:false  
	position blank:false  
	doctorEmail email:true, blank:false, unique:true
	password size: 8..20
	doctorOffice blank:false
	doctorPhone blank: false
	bio size:20..100

//Relationship


    }
}
