/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication
@ImportRuntimeHints(PetClinicRuntimeHints.class)
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}
  public static void casemetmod(String[] args) {
            int choice = 5; // Change this value to test different cases
            
            handleChoice(choice);
        }
        
        private static void handleChoice(int choice) {
            switch (choice) {
                case 1:
                    System.out.println("Case 1: You selected option 1.");
                    break;
                case 2:
                    System.out.println("Case 2: You selected option 2.");
                    break;
                case 3:
                    System.out.println("Case 3: You selected option 3.");
                    break;
                case 4:
                    System.out.println("Case 4: You selected option 4.");
                    break;
                case 5:
                    System.out.println("Case 5: You selected option 5.");
                    break;
                case 6:
                    System.out.println("Case 6: You selected option 6.");
                    break;
                case 7:
                    System.out.println("Case 7: You selected option 7.");
                    break;
                case 8:
                    System.out.println("Case 8: You selected option 8.");
                    break;
                case 9:
                    System.out.println("Case 9: You selected option 9.");
                    break;
                case 10:
                    System.out.println("Case 10: You selected option 10.");
                    break;
                default:
                    System.out.println("Default Case: Invalid choice. Please select a number between 1 and 10.");
            }
        }
  

}
