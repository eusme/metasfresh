/*
 * #%L
 * de.metas.contracts
 * %%
 * Copyright (C) 2021 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package de.metas.contracts.flatrate.process;

import com.google.common.collect.ImmutableList;
import de.metas.contracts.FlatrateDataId;
import de.metas.contracts.IFlatrateDAO;
import de.metas.contracts.model.I_C_Flatrate_Data;
import de.metas.contracts.model.I_C_Flatrate_Term;
import de.metas.process.Param;
import de.metas.process.ProcessInfoParameter;
import de.metas.util.Services;

public class C_Flatrate_Term_Change_BillPartner_For_FlatrateData extends C_Flatrate_Term_Change_BillPartner_Base
{
	final IFlatrateDAO flatrateDAO = Services.get(IFlatrateDAO.class);

	public static final String PARAM_FLATRATE_DATA_ID = I_C_Flatrate_Data.COLUMNNAME_C_Flatrate_Data_ID;

	@Param(parameterName = PARAM_FLATRATE_DATA_ID, mandatory = true)
	private int p_flatrateDataId;

	@Override
	protected ImmutableList<I_C_Flatrate_Term> getFlatrateTermsToChange()
	{
		final FlatrateDataId flatrateDataId = FlatrateDataId.ofRepoIdOrNull(p_flatrateDataId);
		if(flatrateDataId == null)
		{
			return ImmutableList.of();
		}
		return flatrateDAO.retrieveTermsAsList(flatrateDataId);
	}
}
