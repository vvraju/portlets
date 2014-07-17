/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.ifli.rapid;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Satya Kola
 */
public class NoSuchRecommended_ProductsException extends NoSuchModelException {

	public NoSuchRecommended_ProductsException() {
		super();
	}

	public NoSuchRecommended_ProductsException(String msg) {
		super(msg);
	}

	public NoSuchRecommended_ProductsException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchRecommended_ProductsException(Throwable cause) {
		super(cause);
	}

}