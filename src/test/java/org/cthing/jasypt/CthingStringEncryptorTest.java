/*
 * Copyright 2025 C Thing Software
 * SPDX-License-Identifier: Apache-2.0
 */
package org.cthing.jasypt;

import org.jasypt.encryption.pbe.PBEStringEncryptor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


public class CthingStringEncryptorTest {

    @ParameterizedTest
    @ValueSource(strings = { "", " ", "hello", "123", "asdf234^(**%$" })
    public void testEncryptUsingStringPassword(final String message) {
        final PBEStringEncryptor encryptor = new CthingStringEncryptor();
        encryptor.setPassword("Password1234");
        final String encrypted = encryptor.encrypt(message);
        final String decrypted = encryptor.decrypt(encrypted);
        assertThat(decrypted).isEqualTo(message);
    }

    @ParameterizedTest
    @ValueSource(strings = { "", " ", "hello", "123", "asdf234^(**%$" })
    public void testEncryptUsingCharArrayPassword(final String message) {
        final CthingStringEncryptor encryptor = new CthingStringEncryptor();
        encryptor.setPassword("Password1234".toCharArray());
        final String encrypted = encryptor.encrypt(message);
        final String decrypted = encryptor.decrypt(encrypted);
        assertThat(decrypted).isEqualTo(message);
    }
}
