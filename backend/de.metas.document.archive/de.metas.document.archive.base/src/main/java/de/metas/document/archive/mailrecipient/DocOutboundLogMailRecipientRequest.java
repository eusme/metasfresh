/*
 * #%L
 * de.metas.document.archive.base
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

package de.metas.document.archive.mailrecipient;

import de.metas.bpartner.BPartnerId;
import de.metas.document.DocTypeId;
import de.metas.organization.OrgId;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.adempiere.service.ClientId;
import org.adempiere.util.lang.impl.TableRecordReference;

import javax.annotation.Nullable;

@Value
@Builder
public class DocOutboundLogMailRecipientRequest
{
	@Nullable
	TableRecordReference recordRef;

	@NonNull
	ClientId clientId;

	@NonNull
	OrgId orgId;

	@Nullable
	DocTypeId docTypeId;

	@Nullable
	BPartnerId bPartnerId;
}
