# Kencryption

Kotlin library that can encrypt or decrypt strings given a seed

## How to install

Add JitPack in your **root *build.gradle*** at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
Add the dependency in your **app *build.gradle***:
 ```gradle
 	dependencies {
	        implementation 'com.github.rotolonico:Kencryption:v0.1'
	}
 ```

## How to use

To encrypt or decrypt a message you can use the 2 provied extension functions on the ```String``` object:

```kotlin

val seed = 2

val encryptedMessage = "hello world".encrypt(seed)
print(encryptedMessage)
// Encrypts the string "hello world" with seed 2
// Prints "mfpyy yjzsy"

val decryptedMessage = "mfpyy yjzsy".decrypt(seed)
print(decryptedMessage)
// Decrypts the string "mfpyy yjzsy" with seed 2
// Prints "hello world"
```

## Licence
This library is shared under **Apache License 2.0**.

### Created by Domenico Rotolo
