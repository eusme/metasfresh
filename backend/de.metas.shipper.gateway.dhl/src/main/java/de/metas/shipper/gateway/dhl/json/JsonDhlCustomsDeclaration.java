/*
 * #%L
 * de.metas.shipper.gateway.dhl
 * %%
 * Copyright (C) 2023 metas GmbH
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

package de.metas.shipper.gateway.dhl.json;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import javax.annotation.Nullable;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Value
@Builder
public class JsonDhlCustomsDeclaration
{
	String exportType = "COMMERCIAL_GOODS";
	@Nullable String shipperCustomsRef;// Zoll-Nummer or EORI-Number
	@Nullable String consigneeCustomsRef;// Zoll-Nummer or EORI-Number
	@NonNull JsonDhlAmount postalCharges;
	@NonNull @NotEmpty List<JsonDHLItem> items;
}
