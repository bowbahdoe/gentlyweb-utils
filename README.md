# gentlyweb-utils

# ⚠️ DO NOT USE THIS ⚠️

This is a repackaging of the `com.gentlyweb.utils`
utility library as was included in the sourceforge download for 
the equally ancient `JoSQL` library.

I am interested in `JoSQL` because it seems like it could be
retro-fit to work with string templates in an interesting way,
and so this is just a mechanical step towards me doing that experiment.

I made three changes to the code as I got it

* Repackaged from `com.gentlyweb.utils` to `dev.mccue.gentlyweb.utils`. This was
likely unnecessary since the chance anyone has the original library on their classpath is [near zero](https://mvnrepository.com/search?q=gentlyweb)
* Added a `module-info` and compiled as Java 9, rather
than the original Java 1.4.
* Changed the references to `javax.activation` to `jakarta.activation`
and added the appropriate dependency

Other than that, everything is still in its original crusty pre-generics Java form. 
Almost all the classes here have better alternatives either in the standard library
or in more maintained utility libraries.

I don't have a good sense as to the history of this package, so that is an exercise for the reader.
All I know is that it is an ancient utility library and my guess is that it is the product of a single
person or small company.