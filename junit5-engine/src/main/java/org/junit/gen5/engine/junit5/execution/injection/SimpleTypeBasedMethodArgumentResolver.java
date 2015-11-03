/*
 * Copyright 2015 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.gen5.engine.junit5.execution.injection;

import java.lang.annotation.*;
import java.lang.reflect.*;

import org.junit.gen5.commons.util.*;

// for a 'real' solution see: org.springframework.web.method.support.HandlerMethodArgumentResolver
public class SimpleTypeBasedMethodArgumentResolver implements MethodArgumentResolver {

	@Override
	public Object resolveArgumentForMethodParameter(Parameter parameter)
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Class<?> parameterType = parameter.getType();
		Annotation[] parameterAnnotations = parameter.getAnnotations();

		System.out.println("parameter = " + parameter);
		return ReflectionUtils.newInstance(parameterType);
	}

}
