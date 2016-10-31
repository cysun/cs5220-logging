package cs520.logging;

import cs520.logging.bar.Bar;
import cs520.logging.foo.Foo;


public class LoggingTest {

    public static void main( String[] args )
    {
        (new Foo()).output();
        (new Bar()).output();
    }

}
