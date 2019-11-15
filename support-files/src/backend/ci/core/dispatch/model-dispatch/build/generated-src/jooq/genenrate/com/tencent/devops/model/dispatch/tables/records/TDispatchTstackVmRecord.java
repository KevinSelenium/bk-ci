/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables.records;


import com.tencent.devops.model.dispatch.tables.TDispatchTstackVm;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDispatchTstackVmRecord extends UpdatableRecordImpl<TDispatchTstackVmRecord> implements Record11<Long, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -1592388452;

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.ID</code>.
     */
    public TDispatchTstackVmRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.TSTACK_VM_ID</code>.
     */
    public TDispatchTstackVmRecord setTstackVmId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.TSTACK_VM_ID</code>.
     */
    public String getTstackVmId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_IP</code>.
     */
    public TDispatchTstackVmRecord setVmIp(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_IP</code>.
     */
    public String getVmIp() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_NAME</code>.
     */
    public TDispatchTstackVmRecord setVmName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_NAME</code>.
     */
    public String getVmName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_OS</code>.
     */
    public TDispatchTstackVmRecord setVmOs(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_OS</code>.
     */
    public String getVmOs() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_OS_VERSION</code>.
     */
    public TDispatchTstackVmRecord setVmOsVersion(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_OS_VERSION</code>.
     */
    public String getVmOsVersion() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_CPU</code>.
     */
    public TDispatchTstackVmRecord setVmCpu(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_CPU</code>.
     */
    public String getVmCpu() {
        return (String) get(6);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_MEMORY</code>.
     */
    public TDispatchTstackVmRecord setVmMemory(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.VM_MEMORY</code>.
     */
    public String getVmMemory() {
        return (String) get(7);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.STATUS</code>. AVAILABLE|BUILDING|RECYCLABLE|DESTROYED
     */
    public TDispatchTstackVmRecord setStatus(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.STATUS</code>. AVAILABLE|BUILDING|RECYCLABLE|DESTROYED
     */
    public String getStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.CREATED_TIME</code>.
     */
    public TDispatchTstackVmRecord setCreatedTime(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.CREATED_TIME</code>.
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.UPDATED_TIME</code>.
     */
    public TDispatchTstackVmRecord setUpdatedTime(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_VM.UPDATED_TIME</code>.
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.TSTACK_VM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.VM_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.VM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.VM_OS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.VM_OS_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.VM_CPU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.VM_MEMORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return TDispatchTstackVm.T_DISPATCH_TSTACK_VM.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTstackVmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getVmIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getVmName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getVmOs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getVmOsVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getVmCpu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getVmMemory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value2(String value) {
        setTstackVmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value3(String value) {
        setVmIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value4(String value) {
        setVmName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value5(String value) {
        setVmOs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value6(String value) {
        setVmOsVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value7(String value) {
        setVmCpu(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value8(String value) {
        setVmMemory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value9(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value10(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord value11(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackVmRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, LocalDateTime value10, LocalDateTime value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDispatchTstackVmRecord
     */
    public TDispatchTstackVmRecord() {
        super(TDispatchTstackVm.T_DISPATCH_TSTACK_VM);
    }

    /**
     * Create a detached, initialised TDispatchTstackVmRecord
     */
    public TDispatchTstackVmRecord(Long id, String tstackVmId, String vmIp, String vmName, String vmOs, String vmOsVersion, String vmCpu, String vmMemory, String status, LocalDateTime createdTime, LocalDateTime updatedTime) {
        super(TDispatchTstackVm.T_DISPATCH_TSTACK_VM);

        set(0, id);
        set(1, tstackVmId);
        set(2, vmIp);
        set(3, vmName);
        set(4, vmOs);
        set(5, vmOsVersion);
        set(6, vmCpu);
        set(7, vmMemory);
        set(8, status);
        set(9, createdTime);
        set(10, updatedTime);
    }
}