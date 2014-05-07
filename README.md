# jaxrs-to-raml
=============

JAX - RS to RAML project goal is to provide full featured easy to use components for generation of RAML apis description starting from from JAX-RS-annotated Java code

Currently project contains following modules:

## Key supported features:
 * All basic action types, path annotations, path,query, and form parameters
 * Generating resource tree basing on jersey resources available on the source path
 * Inferring media types when possible
 * Including javadoc documentation to descriptions of resources, methods, parameters.
 * Statically determinable sub resources. (no overriding)
 * Default values for parameters
 * XML/Json schemas and examples(stubs) generation with JAXB


## Installation and usage guides

- [Installation instructions/Usage guide for Eclipse or Mulestudio](https://github.com/mulesoft/jaxrs-to-raml/blob/master/install.md)
- [Installation instructions/Usage guide for using as plugin to javac](https://github.com/mulesoft/jaxrs-to-raml/blob/master/javac.md)


## Future features
  * Injection of request parameters to fields
  * Constraint annotations to raml constraints conversion

