/*
 * DISCLAIMER
 *
 * Copyright 2016 ArangoDB GmbH, Cologne, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright holder is ArangoDB GmbH, Cologne, Germany
 */

package com.arangodb.model;

/**
 * @author Mark - mark at arangodb.com
 * 
 * @see <a href="https://docs.arangodb.com/current/HTTP/Gharial/Vertices.html#modify-a-vertex">API Documentation</a>
 */
public class VertexUpdateOptions {

	private Boolean keepNull;
	private Boolean waitForSync;
	private String ifMatch;

	public VertexUpdateOptions() {
		super();
	}

	public Boolean getKeepNull() {
		return keepNull;
	}

	/**
	 * @param keepNull
	 *            If the intention is to delete existing attributes with the patch command, the URL query parameter
	 *            keepNull can be used with a value of false. This will modify the behavior of the patch command to
	 *            remove any attributes from the existing document that are contained in the patch document with an
	 *            attribute value of null.
	 * @return options
	 */
	public VertexUpdateOptions keepNull(final Boolean keepNull) {
		this.keepNull = keepNull;
		return this;
	}

	public Boolean getWaitForSync() {
		return waitForSync;
	}

	/**
	 * @param waitForSync
	 *            Wait until document has been synced to disk.
	 * @return options
	 */
	public VertexUpdateOptions waitForSync(final Boolean waitForSync) {
		this.waitForSync = waitForSync;
		return this;
	}

	public String getIfMatch() {
		return ifMatch;
	}

	/**
	 * @param ifMatch
	 *            replace a document based on target revision
	 * @return options
	 */
	public VertexUpdateOptions ifMatch(final String ifMatch) {
		this.ifMatch = ifMatch;
		return this;
	}
}