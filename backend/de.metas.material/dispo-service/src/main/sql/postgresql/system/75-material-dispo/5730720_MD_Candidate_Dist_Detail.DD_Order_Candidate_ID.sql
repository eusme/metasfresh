-- Column: MD_Candidate_Dist_Detail.DD_Order_Candidate_ID
-- Column: MD_Candidate_Dist_Detail.DD_Order_Candidate_ID
-- 2024-08-02T10:23:41.253Z
INSERT INTO AD_Column (AD_Client_ID,AD_Column_ID,AD_Element_ID,AD_Org_ID,AD_Reference_ID,AD_Table_ID,CloningStrategy,ColumnName,Created,CreatedBy,DDL_NoForeignKey,EntityType,FacetFilterSeqNo,FieldLength,IsActive,IsAdvancedText,IsAllowLogging,IsAlwaysUpdateable,IsAutoApplyValidationRule,IsAutocomplete,IsCalculated,IsDimension,IsDLMPartitionBoundary,IsEncrypted,IsExcludeFromZoomTargets,IsFacetFilter,IsForceIncludeInGeneratedModel,IsGenericZoomKeyColumn,IsGenericZoomOrigin,IsIdentifier,IsKey,IsLazyLoading,IsMandatory,IsParent,IsRestAPICustomColumn,IsSelectionColumn,IsShowFilterIncrementButtons,IsShowFilterInline,IsStaleable,IsSyncDatabase,IsTranslated,IsUpdateable,IsUseDocSequence,MaxFacetsToFetch,Name,SelectionColumnSeqNo,SeqNo,Updated,UpdatedBy,Version) VALUES (0,588901,583179,0,30,540821,'XX','DD_Order_Candidate_ID',TO_TIMESTAMP('2024-08-02 13:23:40','YYYY-MM-DD HH24:MI:SS'),100,'N','de.metas.material.dispo',0,10,'Y','N','Y','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','Y','N',0,'Distributionsdisposition',0,0,TO_TIMESTAMP('2024-08-02 13:23:40','YYYY-MM-DD HH24:MI:SS'),100,0)
;

-- 2024-08-02T10:23:41.255Z
INSERT INTO AD_Column_Trl (AD_Language,AD_Column_ID, Name, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy,IsActive) SELECT l.AD_Language, t.AD_Column_ID, t.Name, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy,'Y' FROM AD_Language l, AD_Column t WHERE l.IsActive='Y'AND (l.IsSystemLanguage='Y') AND t.AD_Column_ID=588901 AND NOT EXISTS (SELECT 1 FROM AD_Column_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Column_ID=t.AD_Column_ID)
;

-- 2024-08-02T10:23:41.283Z
/* DDL */  select update_Column_Translation_From_AD_Element(583179) 
;

-- 2024-08-02T10:23:42.199Z
/* DDL */ SELECT public.db_alter_table('MD_Candidate_Dist_Detail','ALTER TABLE public.MD_Candidate_Dist_Detail ADD COLUMN DD_Order_Candidate_ID NUMERIC(10)')
;

-- 2024-08-02T10:23:42.208Z
ALTER TABLE MD_Candidate_Dist_Detail ADD CONSTRAINT DDOrderCandidate_MDCandidateDistDetail FOREIGN KEY (DD_Order_Candidate_ID) REFERENCES public.DD_Order_Candidate DEFERRABLE INITIALLY DEFERRED
;

