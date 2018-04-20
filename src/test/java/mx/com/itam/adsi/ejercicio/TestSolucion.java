package mx.com.itam.adsi.ejercicio;

	import static org.junit.Assert.assertTrue;

	import org.apache.log4j.Logger;
	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;


	public class TestSolucion {
	    private final static Logger LOG = Logger.getLogger(TestSolucion.class);
	    
	    

	    private static String s = "";
	    

	    private Solucion p = new Solucion();
		
	    public boolean calc(boolean a, boolean b){
		return a == b;
		}

	    @Test
	    public void correArchivo1() {
		s = "holaholahola"; 
		LOG.info("Ejecutando la prueba 1");
		
		assertTrue("Calculo para archivo 1:", calc(p.repetido(s),true));
	    }

	    @Test
	    public void correArchivo2() {
		s = "0"; 
		LOG.info("Ejecutando la prueba 1");
		
		assertTrue("Calculo para archivo 1:", calc(p.repetido(s),false));
	    }

	    @Test
	    public void correArchivo3() {
		s = ""; 
		LOG.info("Ejecutando la prueba 1");
		
		assertTrue("Calculo para archivo 1:", calc(p.repetido(s),true));
	    }

	    @Test
	    public void correArchivo4() {
		s = "meLlamoMoni"; 
		LOG.info("Ejecutando la prueba 1");
		
		assertTrue("Calculo para archivo 1:", calc(p.repetido(s),false));
	    }

	    @Test
	    public void correArchivo5() {
		s = "holaholahola"; 
		LOG.info("Ejecutando la prueba 1");
		
		assertTrue("Calculo para archivo 1:", calc(p.repetido(s),true));
	    }
	
	    
	    
	}

