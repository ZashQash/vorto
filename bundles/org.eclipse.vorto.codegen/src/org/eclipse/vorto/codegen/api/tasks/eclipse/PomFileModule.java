/*******************************************************************************
 *  Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Eclipse Distribution License v1.0 which accompany this distribution.
 *   
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  The Eclipse Distribution License is available at
 *  http://www.eclipse.org/org/documents/edl-v10.php.
 *   
 *  Contributors:
 *  Bosch Software Innovations GmbH - Please refer to git log
 *******************************************************************************/
package org.eclipse.vorto.codegen.api.tasks.eclipse;

import org.eclipse.vorto.codegen.api.tasks.Generated;
import org.eclipse.vorto.codegen.api.tasks.ICodeGeneratorTask;
import org.eclipse.vorto.codegen.api.tasks.IOutputter;
import org.eclipse.vorto.codegen.api.tasks.ITemplate;

/**
 * Generates a pom.xml for a maven project
 * 
 */
public class PomFileModule<Context> implements ICodeGeneratorTask<Context> {

	private static final String FILE_NAME = "pom.xml";
	private ITemplate<Context> template = null;

	public PomFileModule(ITemplate<Context> template) {
		this.template = template;
	}

	public void generate(Context model, IOutputter outputter) {
		Generated generatedPom = new Generated(FILE_NAME, null,
				template.getContent(model));

		outputter.output(generatedPom);
	}

}