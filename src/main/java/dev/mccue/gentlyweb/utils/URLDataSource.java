/*
 * Copyright 2006 - Gary Bentley
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
package dev.mccue.gentlyweb.utils;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import jakarta.activation.DataSource;
import java.net.URL;
import java.net.URLConnection;

public class URLDataSource implements DataSource
{

    private URL url = null;         
    private String contentType = "text/plain";

    public URLDataSource (URL url) 
    {

	this.url = url;
    
    }

    public InputStream getInputStream () 
                                       throws IOException 
    {

	if (this.url == null) 
	{

	    throw new IOException ("No URL provided");

	}
	
	URLConnection urlC = url.openConnection ();
	urlC.setDoInput (true);
	
	urlC.connect ();
	this.contentType = urlC.getContentType ();

	// Get the input stream...
	return new BufferedInputStream (urlC.getInputStream ());
    
    }

    public OutputStream getOutputStream () 
                                         throws IOException 
    {

	throw new IOException ("Output not supported");

    }

    public String getContentType() 
    {

	return this.contentType;
        
    }
    
    public String getName() 
    {
    
        return "URL DataSource for sending only";
        
    }

}
