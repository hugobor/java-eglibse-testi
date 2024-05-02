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


import java.util.List;
import java.util.stream.IntStream;


public class Blabu {
    public static void main(String[] args) {
	
	System.out.println("Olá!!!!");
	
	
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
	
	System.out.format("Minina: %s%nMenino: %s%n", karin, gaspar);
	
	// TODO Otimizar esse loop
	for (int i : IntStream.range(0, 10).boxed().toList()) {
	    System.out.println(i);
	}
	
	System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!!!");

	
////	var readScan = new Scanner(System.in).useLocale(Locale.of("pt", "BR"));
//	var readScan = new Scanner(System.in).useLocale(Locale.of("en", "US"));
//	
//	double dubl = readScan.nextDouble();
//	System.out.println(dubl);
    }
    
    
}



















