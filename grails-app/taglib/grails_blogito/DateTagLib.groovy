package grails_blogito

import java.text.SimpleDateFormat

class DateTagLib {
	def longDate = { attrs, body ->
		// parse the incoming date
		def b = attrs.body ?: body()
		def d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(b.toString())
		
		def pattern = attrs["format"] ?: "EEEE, MMM d, yyyy"
		out << new SimpleDateFormat(pattern).format(d)
	}

}
