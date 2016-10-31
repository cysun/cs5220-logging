package cs520.logging.foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {

    private static Logger logger = LoggerFactory.getLogger( Foo.class );

    public Foo()
    {
    }

    public void output()
    {
        System.out.println( "Class Foo:" );

        logger.error( "This is an error message." );
        logger.warn( "This is a warning message." );
        logger.info( "This is an informational message." );
        logger.debug( "This is a debug message" );
        logger.trace( "This is a more detailed debug message" );
    }

}
