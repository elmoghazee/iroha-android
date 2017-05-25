/*
Copyright Soramitsu Co., Ltd. 2016 All Rights Reserved.
http://soramitsu.co.jp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package io.soramitsu.irohaandroid;

import io.soramitsu.irohaandroid.model.KeyPair;

/**
 * Iroha client.
 */
public class Iroha {
    /**
     * Iroha constructor.
     */
    private Iroha() {
    }

    /* ============ 【KeyPair】 from here ============  */

    /**
     * Create KeyPair for iroha client.
     *
     * @return keypair generated by Ed25519
     */
    public static KeyPair createKeyPair() {
        return Ed25519.createKeyPair();
    }

    /**
     * Create signature for iroha.
     *
     * @param keyPair keypair generated by Ed25519
     * @param message message hashed by sha3
     * @return signature
     */
    public static String sign(KeyPair keyPair, String message) {
        return Ed25519.sign(message, keyPair);
    }

    /**
     * Confirm the message with signature.
     *
     * @param publicKey public key from keypair generated by Ed25519
     * @param signature signature
     * @param message   message hashed by sha3
     * @return true if the correct message
     */
    public static boolean verify(String publicKey, String signature, String message) {
        return Ed25519.verify(signature, message, publicKey);
    }

    /* ============ 【KeyPair】 to here ============  */

}
