/*
 * #%L
 * de.metas.cucumber
 * %%
 * Copyright (C) 2022 metas GmbH
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

package de.metas.cucumber.stepdefs.distributionorder;

import de.metas.cucumber.stepdefs.StepDefData;
import de.metas.cucumber.stepdefs.StepDefDataGetIdAware;
import de.metas.distribution.ddorder.DDOrderId;
import org.eevolution.model.I_DD_Order;

/**
 * Having a dedicated class to help the IOC-framework injecting the right instances, if a step-def needs more than one.
 */
public class DD_Order_StepDefData extends StepDefData<I_DD_Order>
		implements StepDefDataGetIdAware<DDOrderId, I_DD_Order>
{
	public DD_Order_StepDefData()
	{
		super(I_DD_Order.class);
	}

	@Override
	public DDOrderId extractIdFromRecord(final I_DD_Order record)
	{
		return DDOrderId.ofRepoId(record.getDD_Order_ID());
	}
}
