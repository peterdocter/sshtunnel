/*
 * ConnectBot: simple, powerful, open-source SSH client for Android
 * Copyright 2007 Kenny Root, Jeffrey Sharkey
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
 */

package com.trilead.ssh2.compression;

/**
 * Defines how zlib@openssh.org compression works. See
 * http://www.openssh.org/txt/draft-miller-secsh-compression-delayed-00.txt
 * compression is disabled until userauth has occurred.
 * 
 * @author Matt Johnston
 * 
 */
public class ZlibOpenSSH extends Zlib {

	@Override
	public boolean canCompressPreauth() {
		return false;
	}

}
