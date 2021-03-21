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
public interface $DatabasePostgres extends $Database, $DatabaseSystemSequence {
    
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
    @Private default String protocol() {
        return "jdbc:postgresql://";
    }
    
    /**
     * This will forcefully drop the database, first disconeccting all other connections.
     */
    @Override
    @Private default String sqlDropDatabase() {
        return "SELECT pg_terminate_backend(pg_stat_activity.pid)\n" + "FROM pg_stat_activity\n" + "WHERE datname = '"+ name() + "'\n" + " AND pid <> pg_backend_pid();" + $Database.super.sqlDropDatabase();
    }
    
    @Override
    default String port() {
        return "5432";
    }
    
    @Override
    default String username() {
        return "postgres";
    }
    
    @Override
    default String sqlListSequences() {
        return "select c.relname FROM pg_class c WHERE (c.relkind = 'S')"; 
    }
}
