/*
 * #%L
 * de.metas.manufacturing
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

package org.eevolution.productioncandidate.process;

import de.metas.process.JavaProcess;
import org.compiere.SpringContextHolder;
import org.eevolution.productioncandidate.service.PPOrderCandidateService;
import org.eevolution.productioncandidate.service.RecomputeMaturingCandidatesResult;

public class PP_Order_Candidate_CreateMaturingCandidates extends JavaProcess
{
	private final PPOrderCandidateService ppOrderCandidateService = SpringContextHolder.instance.getBean(PPOrderCandidateService.class);

	@Override
	protected String doIt() throws Exception
	{
		final RecomputeMaturingCandidatesResult recomputeMaturingCandidatesResult = ppOrderCandidateService.recomputeMaturingCandidates();
		addLog("Result: {}", recomputeMaturingCandidatesResult);
		return MSG_OK;
	}

}
