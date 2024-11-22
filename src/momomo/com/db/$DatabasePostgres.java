package momomo.com.db;

import momomo.com.annotations.informative.Private;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.PostgreSQL10Dialect;

import java.sql.Driver;

/**
 * Implements $Database partially. 
 * 
 * @author Joseph S.
 */
public interface $DatabasePostgres extends $Database, $DatabaseSystemSequences {
    
    @Override
    @Private default Class<? extends Driver> driverClass() {
        return org.postgresql.Driver.class;
    }
    
    @Override
    @Private default Class<? extends Dialect> dialect() {
        return PostgreSQL10Dialect.class;
    }
    
    @Override
    @Private default String getSystemDatabase() {
        return "postgres";
    }
    
    @Override
    default String sqlListSequences() {
        return "SELECT c.relname FROM pg_class c WHERE (c.relkind = 'S')";
    }
    
    /**
     * This will forcefully drop the database, first disconeccting all other connections so nothing gets in the way. Used in development. 
     */
    @Override
    @Private default String sqlDropDatabase() {
        return "SELECT pg_terminate_backend(pg_stat_activity.pid) FROM pg_stat_activity WHERE datname = '"+ name() + "' AND pid <> pg_backend_pid();" + $Database.super.sqlDropDatabase();
    }
}
