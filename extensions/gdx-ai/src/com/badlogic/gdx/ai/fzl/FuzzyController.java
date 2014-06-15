/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.ai.fzl;

import com.badlogic.gdx.ai.fsm.StateMachine;

/** A Fuzzy Controller manages the Variables, Rules and Methods to use in the fuzzy reasoning process.
 * 
 * @author Valtiel */
public interface FuzzyController {

	/** add a new Variable to the Controller.
	 *
	 * @param lv the Variable to add. */
	public void addVariable (LinguisticVariable lv);

	/** Set the DefuzzifyerMethod to the Controller. By default, this references to an instance of CentroidMethod
	 *
	 * @param defMethod the method to set. */
	public void setDefuzzifyerMethod (DefuzzyerMethod defMethod);

	/** create and add a new Rule to the Controller.
	 *
	 * @param ant Antecedent of the Rule
	 * @param con Consequent of the Rule */
	public void addRule (FuzzyTerm ant, FuzzyTerm con);

	/** Fuzzify the variable designed by the label with the given value
	 *
	 * @param label the label of the variable to fuzzify
	 * @param value the input */
	public void fuzzify (String label, double value);

	/** Defuzzify the variable designed by the label
	 *
	 * @param label the label of the variable to fuzzify
	 * @return the puntual value. */
	public double defuzzify (String label);
}
