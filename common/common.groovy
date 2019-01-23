sendEmail() {
	emailext( 
			subject: '${DEFAULT_SUBJECT}', 
			body: '${DEFAULT_CONTENT}',
		to: PROPS.RECEPIENT_MAIL_ID
		);
	print 'mail sent'
}

def failureEmail(err) {
	emailext( 
			subject: 'BUILD Failure', 
		         body: "${err}",
		        to: PROPS.RECEPIENT_MAIL_ID
		);
	print 'mail sent'
}

def cleanWorkspace() {
	script {
		sh 'rm -rf ../'+JobName+'/*'
		print 'cleaned workspace'
	}
	
}
return this
