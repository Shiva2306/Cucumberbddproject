package nammastepdefinitions;

	import io.cucumber.java.After;
	import io.cucumber.java.Before;

	public class Hooks extends BaseClass {

	    @Before
	    public void setUp() {
	        initDriver();
	    }

	    @After
	    public void tearDown() {
	        closeDriver();
	    }
	}


