/**
 * Copyright © 2018 Mayo Clinic (RSTKNOWLEDGEMGMT@mayo.edu)
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
package edu.mayo.kmdp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import edu.mayo.kmdp.owls.serviceprofile.ServiceProfile;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CompilationTest {

	@Test
	public void testCodegeneration() {
		URL url = CompilationTest.class.getResource( "/" );
		//System.out.println( url );
		try {
			File f = new File( url.toURI() );
			assertTrue( f.exists() );
			String genPath = f.getParent() +
					".generated-sources.xjc.".replaceAll( "\\.", Matcher.quoteReplacement( File.separator ) );
			f = new File( genPath
					              + ServiceProfile.class.getPackage().getName().replaceAll( "\\.", Matcher.quoteReplacement( File.separator ) ) );
			assertTrue( f.exists() );
			assertTrue( f.isDirectory() );

			List<String> files = Arrays.stream( f.listFiles() )
					.map( File::getPath )
					.map( (s) -> s.replace( genPath, "" ) )
					.map( (s) -> s.replace( File.separator, "." ) )
					.map( (s) -> s.replace( ".java", "" ) )
					.collect( Collectors.toList() );

			//files.forEach(System.out::println);
			assertTrue( files.contains( ServiceProfile.class.getName() ) );

		} catch ( URISyntaxException e ) {
			e.printStackTrace();
			fail( e.getMessage() );
		}
	}



}
