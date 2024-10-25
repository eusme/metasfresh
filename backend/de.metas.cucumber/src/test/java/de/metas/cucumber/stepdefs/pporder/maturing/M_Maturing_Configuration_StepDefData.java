/*
 * #%L
 * de.metas.cucumber
 * %%
 * Copyright (C) 2024 metas GmbH
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

package de.metas.cucumber.stepdefs.pporder.maturing;

import de.metas.cucumber.stepdefs.StepDefData;
import de.metas.cucumber.stepdefs.StepDefDataGetIdAware;
import de.metas.material.maturing.MaturingConfigId;
import org.compiere.model.I_M_Maturing_Configuration;

public class M_Maturing_Configuration_StepDefData extends StepDefData<I_M_Maturing_Configuration>
		implements StepDefDataGetIdAware<MaturingConfigId, I_M_Maturing_Configuration>
{
	public M_Maturing_Configuration_StepDefData()
	{
		super(I_M_Maturing_Configuration.class);
	}

	@Override
	public MaturingConfigId extractIdFromRecord(final I_M_Maturing_Configuration record)
	{
		return MaturingConfigId.ofRepoId(record.getM_Maturing_Configuration_ID());
	}
}
