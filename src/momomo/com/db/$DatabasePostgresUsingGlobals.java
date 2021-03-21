package momomo.com.db;

import momomo.com.annotations.informative.Protected;
import momomo.com.Globals;

/**
 * @author Joseph S.
 */
public interface $DatabasePostgresUsingGlobals extends $DatabasePostgres {
    
    @Override
    @Protected default String host() {
        return Globals.Configurable.DATABASE_SERVER_URL.get();
    }
    
    @Override
    @Protected default String port() {
        return Globals.Configurable.DATABASE_SERVER_PORT.get();
    }
    
    @Protected default String password() {
        return Globals.Configurable.DATABASE_SERVER_PASSWORD.get();
    }
    
}
