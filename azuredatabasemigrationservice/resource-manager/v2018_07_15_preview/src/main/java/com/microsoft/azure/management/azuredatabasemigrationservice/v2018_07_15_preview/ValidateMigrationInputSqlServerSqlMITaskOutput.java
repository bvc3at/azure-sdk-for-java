/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Output for task that validates migration input for SQL to Azure SQL Managed
 * Instance migrations.
 */
public class ValidateMigrationInputSqlServerSqlMITaskOutput {
    /**
     * Result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Name of database.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Errors associated with the RestoreDatabaseName.
     */
    @JsonProperty(value = "restoreDatabaseNameErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> restoreDatabaseNameErrors;

    /**
     * Errors associated with the BackupFolder path.
     */
    @JsonProperty(value = "backupFolderErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> backupFolderErrors;

    /**
     * Errors associated with backup share user name and password credentials.
     */
    @JsonProperty(value = "backupShareCredentialsErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> backupShareCredentialsErrors;

    /**
     * Errors associated with the storage account provided.
     */
    @JsonProperty(value = "backupStorageAccountErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> backupStorageAccountErrors;

    /**
     * Errors associated with existing backup files.
     */
    @JsonProperty(value = "existingBackupErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> existingBackupErrors;

    /**
     * Information about backup files when existing backup mode is used.
     */
    @JsonProperty(value = "databaseBackupInfo")
    private DatabaseBackupInfo databaseBackupInfo;

    /**
     * Get result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get name of database.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get errors associated with the RestoreDatabaseName.
     *
     * @return the restoreDatabaseNameErrors value
     */
    public List<ReportableException> restoreDatabaseNameErrors() {
        return this.restoreDatabaseNameErrors;
    }

    /**
     * Get errors associated with the BackupFolder path.
     *
     * @return the backupFolderErrors value
     */
    public List<ReportableException> backupFolderErrors() {
        return this.backupFolderErrors;
    }

    /**
     * Get errors associated with backup share user name and password credentials.
     *
     * @return the backupShareCredentialsErrors value
     */
    public List<ReportableException> backupShareCredentialsErrors() {
        return this.backupShareCredentialsErrors;
    }

    /**
     * Get errors associated with the storage account provided.
     *
     * @return the backupStorageAccountErrors value
     */
    public List<ReportableException> backupStorageAccountErrors() {
        return this.backupStorageAccountErrors;
    }

    /**
     * Get errors associated with existing backup files.
     *
     * @return the existingBackupErrors value
     */
    public List<ReportableException> existingBackupErrors() {
        return this.existingBackupErrors;
    }

    /**
     * Get information about backup files when existing backup mode is used.
     *
     * @return the databaseBackupInfo value
     */
    public DatabaseBackupInfo databaseBackupInfo() {
        return this.databaseBackupInfo;
    }

    /**
     * Set information about backup files when existing backup mode is used.
     *
     * @param databaseBackupInfo the databaseBackupInfo value to set
     * @return the ValidateMigrationInputSqlServerSqlMITaskOutput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskOutput withDatabaseBackupInfo(DatabaseBackupInfo databaseBackupInfo) {
        this.databaseBackupInfo = databaseBackupInfo;
        return this;
    }

}