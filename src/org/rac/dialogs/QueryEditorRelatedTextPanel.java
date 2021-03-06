/**
 * ATReference Copyright � 2011 Rockefeller Archive Center

 * All rights reserved.
 *
 * This software is free. You can redistribute it and / or modify it under the terms of the Educational Community License (ECL)
 * version 1.0 (http://www.opensource.org/licenses/ecl1.php)
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the ECL license for more details about permissions and limitations.
 *
 *
 * ATReference
 * https://github.com/RockefellerArchiveCenter/ATReference/wiki
 *
 * @author Lee Mandell
 * Date: May 4, 2010
 * Time: 2:33:19 PM
 */

package org.rac.dialogs;

import org.archiviststoolkit.dialog.QueryEditorPanel;
import org.archiviststoolkit.hibernate.ATSearchCriterion;

public class QueryEditorRelatedTextPanel extends QueryEditorPanel {
	@Override
	public ATSearchCriterion getQueryCriterion(Class clazz, String field) {
		return null;
	}

	@Override
	public void requestInitialFocus() {
	}

	@Override
	public boolean validDataEntered() {
		return false;
	}
}
