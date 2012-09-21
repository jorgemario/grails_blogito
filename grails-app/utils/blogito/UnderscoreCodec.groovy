package blogito

class UnderscoreCodec {

	public static encode = { target ->
		return target.replaceAll(" ", "_")
	}
	
	static decode = { target ->
		return target.replaceAll("_", " ")
	}
}
