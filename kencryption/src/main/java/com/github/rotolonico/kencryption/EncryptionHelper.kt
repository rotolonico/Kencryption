package com.github.rotolonico.kencryption

import java.lang.Math.abs


private const val ran2 = 329832
private const val ran3 = 48493
private const val ran4 = 25


/**
 * Encrypts the string given a specific positive seed
 * @param seed: The seed you want to encrypt the string
 *
 * @return The string encrypted
 */
fun String.encrypt(seed: Int): String {
    return encryptionConstant(seed, this, true)

}

/**
 * Decrypts the string given a specific positive seed
 * @param seed: The seed you want to decrypt the string
 *
 * @return The string decrypted
 */
fun String.decrypt(seed: Int): String {
    return encryptionConstant(seed, this, false)
}

private fun encryptionConstant(seed: Int, message: String, isEncrpyt: Boolean): String {
    var shift: Int

    var seedE = seed

    val messageChar = message.toLowerCase().toCharArray()
    messageChar.forEachIndexed { i, char ->
        seedE = abs(seedE * ran2 % ran3)
        shift = (seedE % ran4)
        if (messageChar[i].toInt() in 97..122) {
            if (isEncrpyt) {
                messageChar[i] = char + shift
                if (messageChar[i].toInt() > 122) {
                    messageChar[i] = messageChar[i] - 26
                }
            } else {
                messageChar[i] = char - shift
                if (messageChar[i].toInt() < 97) {
                    messageChar[i] = messageChar[i] + 26
                }
            }
        }
    }
    return String(messageChar)
}

