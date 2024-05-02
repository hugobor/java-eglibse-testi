/*
Copyright 2024 Hugo Borges de Carvalho

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


package hugobor.javaeglibsetesti;


import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;


class TestPerson {

    @Test
    void testPersonEquals() {
	assertTrue(true);
	
	var karin = new Person(
		"Karin",
		"Bruxinha fofinha",
		26,
		List.of("mandioca", "manga"));
	
	var gaspar = new Person(
		"Gaspar",
		"Menininho fofo :3",
		17,
		List.of("cebola"));
	
	assertFalse(karin.equals(gaspar));
	assertFalse(karin.equals(gaspar));
	assertFalse(karin.hashCode() == gaspar.hashCode());
	
	var mirrorKarin = new Person(
		"Karin",
		"Bruxinha fofinha",
		26,
		List.of("mandioca", "manga"));
	
	assertTrue(karin.equals(mirrorKarin));
	assertTrue(mirrorKarin.equals(karin));
	
	var blubKarin = new Person(karin.name(), karin.descr(), karin.age(), List.of("mandioca"));
	
	assertFalse(karin.equals(blubKarin));
	assertTrue(karin.name().equals(blubKarin.name()));
    }
    
}
