package com.jcharlesworth

class Appointment {

// Declaring Variables 
	Date appDate
	String appTime
	String appDuration 
	int roomNumber 

    static constraints = {

// Constraints 
	appDate blank:false
	//appTime 
	//appDuration
	roomNumber blank:false
    }

//Relationships
static belongsTo = [doctor:Doctor]
static hasOne = [patient:Patient]
static hasMany = [surgery:Surgery]
}
