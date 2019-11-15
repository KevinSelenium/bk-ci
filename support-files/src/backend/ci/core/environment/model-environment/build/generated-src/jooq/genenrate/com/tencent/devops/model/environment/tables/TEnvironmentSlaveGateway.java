/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.environment.tables;


import com.tencent.devops.model.environment.DevopsEnvironment;
import com.tencent.devops.model.environment.Keys;
import com.tencent.devops.model.environment.tables.records.TEnvironmentSlaveGatewayRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TEnvironmentSlaveGateway extends TableImpl<TEnvironmentSlaveGatewayRecord> {

    private static final long serialVersionUID = 713626127;

    /**
     * The reference instance of <code>devops_environment.T_ENVIRONMENT_SLAVE_GATEWAY</code>
     */
    public static final TEnvironmentSlaveGateway T_ENVIRONMENT_SLAVE_GATEWAY = new TEnvironmentSlaveGateway();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TEnvironmentSlaveGatewayRecord> getRecordType() {
        return TEnvironmentSlaveGatewayRecord.class;
    }

    /**
     * The column <code>devops_environment.T_ENVIRONMENT_SLAVE_GATEWAY.ID</code>.
     */
    public final TableField<TEnvironmentSlaveGatewayRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>devops_environment.T_ENVIRONMENT_SLAVE_GATEWAY.NAME</code>.
     */
    public final TableField<TEnvironmentSlaveGatewayRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_environment.T_ENVIRONMENT_SLAVE_GATEWAY.SHOW_NAME</code>.
     */
    public final TableField<TEnvironmentSlaveGatewayRecord, String> SHOW_NAME = createField("SHOW_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_environment.T_ENVIRONMENT_SLAVE_GATEWAY.GATEWAY</code>.
     */
    public final TableField<TEnvironmentSlaveGatewayRecord, String> GATEWAY = createField("GATEWAY", org.jooq.impl.SQLDataType.VARCHAR.length(32).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>devops_environment.T_ENVIRONMENT_SLAVE_GATEWAY</code> table reference
     */
    public TEnvironmentSlaveGateway() {
        this("T_ENVIRONMENT_SLAVE_GATEWAY", null);
    }

    /**
     * Create an aliased <code>devops_environment.T_ENVIRONMENT_SLAVE_GATEWAY</code> table reference
     */
    public TEnvironmentSlaveGateway(String alias) {
        this(alias, T_ENVIRONMENT_SLAVE_GATEWAY);
    }

    private TEnvironmentSlaveGateway(String alias, Table<TEnvironmentSlaveGatewayRecord> aliased) {
        this(alias, aliased, null);
    }

    private TEnvironmentSlaveGateway(String alias, Table<TEnvironmentSlaveGatewayRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsEnvironment.DEVOPS_ENVIRONMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TEnvironmentSlaveGatewayRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_ENVIRONMENT_SLAVE_GATEWAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TEnvironmentSlaveGatewayRecord> getPrimaryKey() {
        return Keys.KEY_T_ENVIRONMENT_SLAVE_GATEWAY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TEnvironmentSlaveGatewayRecord>> getKeys() {
        return Arrays.<UniqueKey<TEnvironmentSlaveGatewayRecord>>asList(Keys.KEY_T_ENVIRONMENT_SLAVE_GATEWAY_PRIMARY, Keys.KEY_T_ENVIRONMENT_SLAVE_GATEWAY_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TEnvironmentSlaveGateway as(String alias) {
        return new TEnvironmentSlaveGateway(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TEnvironmentSlaveGateway rename(String name) {
        return new TEnvironmentSlaveGateway(name, null);
    }
}