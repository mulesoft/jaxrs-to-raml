/*
 * Copyright 2013-2018 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.generator.v10.types;

import amf.client.model.domain.*;
import org.raml.jaxrs.generator.Names;
import org.raml.jaxrs.generator.v10.Annotations;
import org.raml.jaxrs.generator.v10.CreationModel;
import org.raml.jaxrs.generator.v10.V10GType;

/**
 * Created by Jean-Philippe Belanger on 1/3/17. Just potential zeroes and ones
 */
public class V10GTypeFactory {


  public static V10GType createResponseBodyType(EndPoint resource,
                                                Operation method, Response response, AnyShape anyShape) {

    return new V10RamlToPojoGType(Names.ramlTypeName(resource, method,
                                                     response, anyShape), anyShape);
  }

  public static V10GType createInlineType(String ramlName,
                                          AnyShape shape) {
    return new V10RamlToPojoGType(ramlName, shape);
  }

  public static V10GType createScalar(String name, AnyShape anyShape) {

    return new V10RamlToPojoGType(name, anyShape);
  }

  public static V10GType createArray(String name,
                                     ArrayShape arrayShape) {

    return new V10RamlToPojoGType(name, arrayShape);
  }

  public static V10GType createEnum(String name,
                                    ScalarShape scalarShape) {
    return new V10RamlToPojoGType(name, scalarShape);
  }


  public static V10GType createJson(SchemaShape schemaShape, String ramlName, CreationModel model) {

    return new V10GTypeJson(schemaShape, ramlName, ramlName, model); // Should be annotable.
  }

  public static V10GType createJson(SchemaShape schemaShape, String ramlName,
                                    String javaTypeName, CreationModel model) {

    return new V10GTypeJson(schemaShape, ramlName, javaTypeName, model);
  }

  public static V10GType createXml(SchemaShape schemaShape, String ramlName, CreationModel model) {
    return new V10GTypeXml(schemaShape, ramlName, Annotations.CLASS_NAME.get(
                                                                             Names.typeName(ramlName), schemaShape),
                           model);
  }

  public static V10GType createXml(SchemaShape schemaShape, String ramlName,
                                   String javaName, CreationModel model) {
    return new V10GTypeXml(schemaShape, ramlName, javaName, model);
  }

  public static V10GType createUnion(String ramlName, UnionShape unionShape) {
    return new V10RamlToPojoGType(ramlName, unionShape);
  }

}
