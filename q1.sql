prompt Importing table TS_QUANT_LIST@Dblink_Ods...
set feedback off
set define off
insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('QOSTATE_COUNT', null, null, null, null, null, 'select 1,count(qo_flow_info_id) from TR_QO_FLOW', '数据质量问题单状态');

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('QOWORKORDERSTATE_COUNT', null, null, null, null, null, 'SELECT 1,COUNT(*) FROM TR_QO_WORKORDER', '问题单流程工单状态');

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MANAGER_MAIN_CAMPS', null, null, null, null, null, 'SELECT 1, COUNT(A.CAMP_SEQ_ID)
  FROM COCAMP.CO_CAMP_WAVE A, COCAMP.CO_CAMP B
 WHERE A.CAMP_ID = B.CAMP_ID', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MANAGER_MONTH_MAIN_CAMPS', null, null, null, null, null, 'SELECT 1, COUNT(A.CAMP_SEQ_ID)
  FROM COCAMP.CO_CAMP_WAVE A, COCAMP.CO_CAMP B
 WHERE A.CAMP_ID = B.CAMP_ID', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MANAGER_CREATE_MAIN_CAMPS', null, null, null, null, null, 'select 1,count(a.camp_seq_id) from cocamp.co_camp_wave a', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MANAGER_MAIN_SENDS', null, null, null, null, null, 'select 1,nvl(sum(a.SMS_SUCC_SEND_NUM)+sum(a.wap_SUCC_SEND_NUM)+sum(a.mms_SUCC_SEND_NUM)+sum(a.mail_SUCC_SEND_NUM),0)
 from  cocamp.co_camp_sale_act_info  a', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MANAGER_MAIN_ORDERS', null, null, null, null, null, 'select 1,count(a.order_id) from  cocamp.mv_co_camp_sp_order a,cocamp.co_camp_sale_act_info b', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MANAGER_MAIN_ORDERPER', null, null, null, null, null, 'select 1, trim(to_char((case when nvl(sum(a.SMS_SUCC_SEND_NUM),0) = 0 then 0 else nvl(sum(a.SMS_SUCC_ORDER_NUM),0) / nvl(sum(a.SMS_SUCC_SEND_NUM),0)*100 end),''9990.9999'')) 
   from    cocamp.co_camp_sale_act_info  a', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MANAGER_MAIN_COMPLAIN', null, null, null, null, null, 'select 1,nvl(sum(a.COMPLAIN_NUM),0) from  cocamp.co_camp_sale_act_info a', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MAIN_DAY_ORDERS', null, null, null, null, null, 'select 1,nvl(sum(count(1)),0) from  cocamp.mv_co_camp_sp_order a where  to_char(a.completed_date,''yyyymmdd'')=to_char(sysdate,''yyyymmdd'') and 
  a.state=''1'' group by order_id', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MAIN_DAY_SENDS', null, null, null, null, null, 'select 1,nvl(sum(a.succ_send_num),0) from  cocamp.co_camp_sale_act_view a  where to_char(a.CONt_START_date,''yyyymmdd'')=to_char(sysdate,''yyyymmdd'')', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MAIN_CAMPS', null, null, null, null, null, 'select 1,count(a.camp_id) from  cocamp.co_camp_sale_act_info  a where substr(a.STAT_CYCLE_ID,0,6)=to_char(sysdate,''yyyymm'')', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MAIN_SENDS', null, null, null, null, null, 'select 1,nvl(sum(a.SMS_SUCC_SEND_NUM)+sum(a.wap_SUCC_SEND_NUM)+sum(a.mms_SUCC_SEND_NUM)+sum(a.mail_SUCC_SEND_NUM),0)
 from  cocamp.co_camp_sale_act_info  a where substr(a.STAT_CYCLE_ID,0,6)=to_char(sysdate,''yyyymm'')', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MAIN_ORDERS', null, null, null, null, null, 'select 1,count(a.order_id) from  cocamp.mv_co_camp_sp_order a,cocamp.co_camp_sale_act_info b
  where  to_char(a.completed_date,''yyyymm'')=to_char(sysdate,''yyyymm'')  and 
 a.camp_id>0 and a.state=''1'' and a.camp_seq_id=b.camp_seq_id', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MAIN_ORDERPER', null, null, null, null, null, 'select 1, trim(to_char((case when nvl(sum(a.SMS_SUCC_SEND_NUM),0) = 0 then 0 else nvl(sum(a.SMS_SUCC_ORDER_NUM),0) / nvl(sum(a.SMS_SUCC_SEND_NUM),0)*100 end),''9990.9999'')) 
   from    cocamp.co_camp_sale_act_info  a where substr(a.STAT_CYCLE_ID,0,6)=to_char(sysdate,''yyyymm'')', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('MAIN_COMPLAIN', null, null, null, null, null, 'select 1,nvl(sum(a.COMPLAIN_NUM),0) from  cocamp.co_camp_sale_act_info a  where substr(a.STAT_CYCLE_ID,0,6)=to_char(sysdate,''yyyymm'')', null);

insert into TS_QUANT_LIST@Dblink_Ods (TAGTYPE, IDFIELDNAME, DESCFIELDNAME, TABLENAME, WHERECLAUSE, ORDERCLAUSE, COMPLEXSQL, REMARK)
values ('NO_AUDIT', null, null, null, null, null, 'select 1,NVL(count(1),0) 
  from CO_CAMP A, CO_CAMP_WAVE B, STAFF C ', null);

prompt Done.
