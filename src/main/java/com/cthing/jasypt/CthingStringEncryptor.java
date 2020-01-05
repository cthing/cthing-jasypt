/*
 * Copyright 2020 C Thing Software
 * All rights reserved.
 */
package com.cthing.jasypt;

import org.jasypt.encryption.pbe.PBEStringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;


/**
 * <p>
 *     A Jasypt string encryptor.
 * </p>
 * <table>
 *     <caption>Encryptor configuration</caption>
 *     <tr>
 *         <th>Implementation:</th>
 *         <td>{@link PooledPBEStringEncryptor}</td>
 *     </tr>
 *     <tr>
 *         <th>Algorithm:</th>
 *         <td>PBEWITHHMACSHA512ANDAES_256</td>
 *     </tr>
 *     <tr>
 *         <th>Key iterations:</th>
 *         <td>1000</td>
 *     </tr>
 *     <tr>
 *         <th>Pool size:</th>
 *         <td>1</td>
 *     </tr>
 *     <tr>
 *         <th>Salt class:</th>
 *         <td>{@link org.jasypt.salt.RandomSaltGenerator}</td>
 *     </tr>
 *     <tr>
 *         <th>IV class:</th>
 *         <td>{@link org.jasypt.iv.RandomIvGenerator}</td>
 *     </tr>
 * </table>
 */
public class CthingStringEncryptor implements PBEStringEncryptor {

    private static final String ALGORITHM = "PBEWITHHMACSHA512ANDAES_256";
    private static final int KEY_ITERATIONS = 1000;
    private static final String POOL_SIZE = "1";
    private static final String SALT_CLASS = "org.jasypt.salt.RandomSaltGenerator";
    private static final String IV_CLASS = "org.jasypt.iv.RandomIvGenerator";
    private static final String OUTPUT_FORMAT = "base64";

    private final PooledPBEStringEncryptor encryptor;

    public CthingStringEncryptor() {
        final SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setAlgorithm(ALGORITHM);
        config.setKeyObtentionIterations(KEY_ITERATIONS);
        config.setPoolSize(POOL_SIZE);
        config.setSaltGeneratorClassName(SALT_CLASS);
        config.setIvGeneratorClassName(IV_CLASS);
        config.setStringOutputType(OUTPUT_FORMAT);

        this.encryptor = new PooledPBEStringEncryptor();
        this.encryptor.setConfig(config);
    }

    @Override
    public void setPassword(final String password) {
        this.encryptor.setPassword(password);
    }

    @Override
    public String encrypt(final String message) {
        return this.encryptor.encrypt(message);
    }

    @Override
    public String decrypt(final String encryptedMessage) {
        return this.encryptor.decrypt(encryptedMessage);
    }
}
