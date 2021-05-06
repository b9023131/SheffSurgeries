package com.jcharlesworth



class BootStrap {

    def init = { servletContext ->

//Surgery Data 

	def SurgeryOne=new Surgery(
		name: 'Crook hill Surgery', 
		address: '11 creswick street, Sheffield', 
		postcode: 'S62YD', 
		telephone: '073275322', 
		numberOfPatients: '2', 
		description: 'Crooks Comunity GP and walk in.', 
		openingTime: '10:00am.'
     	       ) .save()

	def SurgeryTwo=new Surgery(
		name: 'City Center Group Practice', 
		address: '492 Almond Grove, Sheffield', 
		postcode: 'S15KW', 
		telephone: '077528174', 
		numberOfPatients: '2', 
		description: 'City center GP and walk in.', 
		openingTime: '10:00am.'
     	       ) .save()

//Doctor Data

	def DoctorOne=new Doctor(
		fullName: 'David Humfree', 
		qualification: 'City and Guilds', 
		position: 'GP Surgeon', 
		doctorEmail: 'DavidHumfreelive.com', 
		password: '2J947sfXcz3', 
		doctorOffice: 'Room 6', 
		doctorPhone: '01142453910.',
		bio: 'djhgsgecushedes'
     	       ) .save()

	def DoctorTwo=new Doctor(
		fullName: 'Elliot Davis', 
		qualification: 'PHD', 
		position: 'GP Surgeon', 
		doctorEmail: 'ElliotDavis.com', 
		password: '2J9dhepPSz3', 
		doctorOffice: 'Room 3', 
		doctorPhone: '01184462910.',
		bio: 'djhgsgecushedes'
     	       ) .save()

//Nurse Data

	def NurseOne=new Nurse(
		nurseName: 'Sarah Kowski', 
		qualifications: 'Health and Social',  
		nurseEmail: '.com',  
		nurseOffice: 'Room 1', 
		nursePhone: '01184462910.',
		bio: 'djhgsgecushedes'
     	       ) .save()

	def NurseTwo=new Nurse(
		nurseName: 'Evans Lamar', 
		qualifications: 'Health and Social',  
		nurseEmail: '.com',  
		nurseOffice: 'Room 1', 
		nursePhone: '01184462910.',
		bio: 'djhgsgecushedes'
     	       ) .save()

//Receptionist Data - Change recepphone data type in class

	def ReceptionistOne=new Receptionist(
		recepName: 'Sally efrey',  
		recepEmail: 'Sallyefr.com',  
		recepUsername: 'SalRec1', 
		recepPassword: 'sallyonreception', 
		recepPhone: '011893662910.'
     	       ) .save()

	def ReceptionistTwo=new Receptionist(
		recepName: 'Jhoane Palmer ',  
		recepEmail: 'Jpalmer.com',  
		recepUsername: 'JoRec1', 
		recepPassword: 'Jhoaneonreception', 
		recepPhone: '011893662910.'
     	       ) .save()

//Patient Data

	def PatientOne=new Patient(
		patientName: 'Jimmy Jeffers',  
		patientAddress: '6 kilner drive, Sheffield',  
		patientResidence: '??', 
		patientDob: new Date('03/02/1989'), 
		patientID: '001',
		dateRegistered: new Date ('05/03/2001'),
		patientPhone: '07738295648'
     	       ) .save()

	def PatientTwo=new Patient(
		patientName: 'Dean Parkinson',  
		patientAddress: '130 green avenue, sheffield',  
		patientResidence: '??', 
		patientDob: new Date('06/09/1993'), 
		patientID: '002',
		dateRegistered: new Date('06/07/2004'),
		patientPhone: '07717182366'
     	       ) .save()

//Appointment data

	def AppointmentOne=new Appointment(
		appDate: new Date('05/04/2021'),  
		appTime: '2:00pm',  
		appDuration: '30', 
		roomNumber: 'Room 3'
     	       ) .save()

	def AppointmentTwo=new Appointment(
		appDate: new Date('02/07/2020'),  
		appTime: '3:00pm',  
		appDuration: '15', 
		roomNumber: 'Room 6'
     	       ) .save()

//Appointment needs
//DoctorFullName, nurseName, patientID. the surgery it is at???


//Prescription data 

	def PrescriptionOne=new Prescription(
		pharmacyName: 'NewPharmacy',  
		prescriptionNumber: '01',  
		medicine: 'Penicillin', 
		totalCost: 0,
		dateIssued: new Date('02/03/2021'),
		patientPaying: 'Jimmy Jeffers'
     	       ) .save()

	def PrescriptionTwo=new Prescription(
		pharmacyName: 'NewPharmacy',  
		prescriptionNumber: '2',  
		medicine: 'No medicine needed or N/A', 
		totalCost: 0,
		dateIssued: new Date('22/03/2021'),
		patientPaying: 'Jimmy Jeffers'
     	       ) .save()

//Patient paying would be ID - New pharmacy class needded? 


    }

    def destroy = {
    }
}
