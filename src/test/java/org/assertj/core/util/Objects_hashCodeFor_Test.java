/*
 * Created on Sep 23, 2006
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2006-2011 the original author or authors.
 */
package org.assertj.core.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for {@link Objects#hashCodeFor(Object)}.
 * 
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class Objects_hashCodeFor_Test {

  @Test
  public void should_return_hashCode_of_given_Object() {
    String s = "Yoda";
    assertEquals(s.hashCode(), Objects.hashCodeFor(s));
  }

  @Test
  public void should_return_zero_if_Object_is_null() {
    assertEquals(0, Objects.hashCodeFor(null));
  }
}
