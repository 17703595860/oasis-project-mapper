
-- 展示框架
delete from TZ_DISPFRAME_FLDDRILLDOWN where DISPFRAME_DTL_ID in (select ID from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('534741347161214976')));
delete from TZ_DISPFRAME_ELEMENT where DISPFRAME_ID in (select ID from TZ_DISPFRAME where BE_ID in ('534741347161214976'));
delete from TZ_DISPFRAME where BE_ID in ('534741347161214976');

-- page
delete from TZ_PAGEZONE_CONTENT where PAGEZONE_ID in (select ID from TZ_PAGE_ZONE where PAGE_ID in (select ID from TZ_PAGE where BUSMODULE_ID in ('534516262622072833')));
delete from TZ_PAGE_ZONE where PAGE_ID in (select ID from TZ_PAGE where BUSMODULE_ID in ('534516262622072833'));
delete from TZ_PAGE where BUSMODULE_ID in ('534516262622072833');

