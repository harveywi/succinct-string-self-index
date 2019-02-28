# A Pure Function Succinct String Self-Index in Scala

NOTE:  This is a work-in-progress.

A compressed full-text self-index represents a text in a compressed form while answering certain kinds of queries efficiently.  Such an index can be thought of as a compressed text file, but (a) providing efficient random access to substrings, and (b) providing compressed indexes over the string to enable rapid text mining functionality. These indexes represent a significant advancement over the (full-)text indexing techniques of the previous decade, whose indexes required several times the size of the text.  While the theoretical research behind full-text self-indexes has matured over the last several years, practical developments are still at the forefront.

This project uses pure functional programming techniques to implement a novel compressed full-text self-index that empirically compresses a (potentially multi-gigabyte) text file, such as a big collection of strings, semi-structured data, or one giant string, down to a fraction of its original size while providing the following operations (and others) in sublinear and/or logarithmic time:

* substring(position, length):
    * Retrieves a substring of the original string at the given position.
* count(substring):
    * Counts the number of occurrences of the given substring.  The cost is approximately logarithmic in the size of the input string, which is very efficient.
* allIndexesOf(substring):
    * Lazily retrieves the indexes of all occurrences of the given substring (so time complexity is output-sensitive).

Our API provides combinators for primitive operations to build regex search engines, Bayesian pattern recognition systems, semi-structured text mining tools, and many other things.

The data structure is a variant of the compressed suffix array that is widely used in bioinformatics for locating patterns within genetic code, and for gene sequence alignment.  However, this novel data structure is a compressed self-index and is considerably smaller than the compressed suffix array (which still requires several times the size of the input string).  This new data structure can make it possible to fit large datasets of strings in memory on a single workstation.  The key observation that led to the discovery of this particular formulation of the succinct string self-index data structure was a category-theoretic interpretation of corecursive endofunctions.

# Contributors

[William Harvey](https://github.com/harveywi/)

[Suyog Kulkarni](https://github.com/ksuyog)