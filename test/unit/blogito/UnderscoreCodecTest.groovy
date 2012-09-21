package blogito;

import static org.junit.Assert.*;
import grails.test.mixin.TestFor;
import blogito.UnderscoreCodec

@TestFor(UnderscoreCodec)
class UnderscoreCodecTest {
	void testEncode() {
		String test = "this is a test"
		assert UnderscoreCodec.encode(test) == "this_is_a_test"
	}
	
	void testDecode() {
		String test = "this_is_a_test"
		assert UnderscoreCodec.decode(test) == "this is a test"
	}
}
